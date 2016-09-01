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

import com.bydan.erp.nomina.util.ReferenciaConstantesFunciones;
import com.bydan.erp.nomina.util.ReferenciaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.ReferenciaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.ReferenciaBean;
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
public class ReferenciaBeanSwingJInternalFrame extends ReferenciaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ReferenciaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Referencia> referenciaValidator = new ClassValidator<Referencia>(Referencia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Referencia referencia;	
	public Referencia referenciaAux;
	public Referencia referenciaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Referencia referenciaTotales;
	public Long idReferenciaActual;
	public Long iIdNuevoReferencia=0L;
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

	public String sFinalQueryComboParentezco="";

	public List<Parentezco> parentezcosForeignKey;

	public List<Parentezco> getparentezcosForeignKey() {
		return parentezcosForeignKey;
	}

	public void setparentezcosForeignKey(List<Parentezco> parentezcosForeignKey) {
		this.parentezcosForeignKey = parentezcosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Parentezco parentezcoForeignKey;

	public Parentezco getparentezcoForeignKey() {
		return parentezcoForeignKey;
	}

	public void setparentezcoForeignKey(Parentezco parentezcoForeignKey) {
		this.parentezcoForeignKey = parentezcoForeignKey;
	}

	public String sFinalQueryComboProfesion="";

	public List<Profesion> profesionsForeignKey;

	public List<Profesion> getprofesionsForeignKey() {
		return profesionsForeignKey;
	}

	public void setprofesionsForeignKey(List<Profesion> profesionsForeignKey) {
		this.profesionsForeignKey = profesionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Profesion profesionForeignKey;

	public Profesion getprofesionForeignKey() {
		return profesionForeignKey;
	}

	public void setprofesionForeignKey(Profesion profesionForeignKey) {
		this.profesionForeignKey = profesionForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
	}
	
	

	public Boolean isTienePermisosTelefonoReferencia=false;

	public Boolean getIsTienePermisosTelefonoReferencia() {
		return isTienePermisosTelefonoReferencia;
	}

	public void setIsTienePermisosTelefonoReferencia(Boolean isTienePermisosTelefonoReferencia) {
		this.isTienePermisosTelefonoReferencia= isTienePermisosTelefonoReferencia;
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
	
	public Boolean isPermisoTodoReferencia;
	public Boolean isPermisoNuevoReferencia;
	public Boolean isPermisoActualizarReferencia;
	public Boolean isPermisoActualizarOriginalReferencia;
	public Boolean isPermisoEliminarReferencia;
	public Boolean isPermisoGuardarCambiosReferencia;
	public Boolean isPermisoConsultaReferencia;
	public Boolean isPermisoBusquedaReferencia;
	public Boolean isPermisoReporteReferencia;
	public Boolean isPermisoPaginacionMedioReferencia;
	public Boolean isPermisoPaginacionAltoReferencia;
	public Boolean isPermisoPaginacionTodoReferencia;
	public Boolean isPermisoCopiarReferencia;
	public Boolean isPermisoVerFormReferencia;
	public Boolean isPermisoDuplicarReferencia;
	public Boolean isPermisoOrdenReferencia;
	
	
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
	
	public ReferenciaParameterReturnGeneral referenciaReturnGeneral;
	public ReferenciaParameterReturnGeneral referenciaParameterGeneral;
	
	

	public TelefonoReferenciaLogic telefonoreferenciaLogic=null;

	public TelefonoReferenciaLogic getTelefonoReferenciaLogic() {
		return telefonoreferenciaLogic;
	}

	public void setTelefonoReferenciaLogic(TelefonoReferenciaLogic telefonoreferenciaLogic) {
		this.telefonoreferenciaLogic = telefonoreferenciaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoReferencia=false;
	public Boolean esParaAccionDesdeFormularioReferencia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ReferenciaSessionBeanAdditional referenciaSessionBeanAdditional=null;
	
	public ReferenciaSessionBeanAdditional getReferenciaSessionBeanAdditional() {
		return this.referenciaSessionBeanAdditional;
	}
	
	public void setReferenciaSessionBeanAdditional(ReferenciaSessionBeanAdditional referenciaSessionBeanAdditional) {
		try {
			this.referenciaSessionBeanAdditional=referenciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ReferenciaBeanSwingJInternalFrameAdditional referenciaBeanSwingJInternalFrameAdditional=null;
	//public class ReferenciaBeanSwingJInternalFrame
	
	public ReferenciaBeanSwingJInternalFrameAdditional getReferenciaBeanSwingJInternalFrameAdditional() {
		return this.referenciaBeanSwingJInternalFrameAdditional;
	}
	
	public void setReferenciaBeanSwingJInternalFrameAdditional(ReferenciaBeanSwingJInternalFrameAdditional referenciaBeanSwingJInternalFrameAdditional) {
		try {
			this.referenciaBeanSwingJInternalFrameAdditional=referenciaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ReferenciaLogic referenciaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Referencia referenciaBean;
	public ReferenciaConstantesFunciones referenciaConstantesFunciones;
	//public ReferenciaParameterReturnGeneral referenciaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public ParentezcoLogic parentezcoLogic;
	public ProfesionLogic profesionLogic;
	
	//PARAMETROS
	
	
	//public List<Referencia> referencias;	
	//public List<Referencia> referenciasEliminados;
	//public List<Referencia> referenciasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoReferencia=false;
	public Boolean isVisibilidadCeldaDuplicarReferencia=true;
	public Boolean isVisibilidadCeldaCopiarReferencia=true;
	public Boolean isVisibilidadCeldaVerFormReferencia=true;
	public Boolean isVisibilidadCeldaOrdenReferencia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesReferencia=false;
	public Boolean isVisibilidadCeldaModificarReferencia=false;
	public Boolean isVisibilidadCeldaActualizarReferencia=false;
	public Boolean isVisibilidadCeldaEliminarReferencia=false;
	public Boolean isVisibilidadCeldaCancelarReferencia=false;
	public Boolean isVisibilidadCeldaGuardarReferencia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosReferencia=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdParentezco=false;
	public Boolean isVisibilidadFK_IdProfesion=false;
	
	public Long getiIdNuevoReferencia() {
		return this.iIdNuevoReferencia;
	}

	public void setiIdNuevoReferencia(Long iIdNuevoReferencia) {
		this.iIdNuevoReferencia = iIdNuevoReferencia;
	}
	
	public Long getidReferenciaActual() {
		return this.idReferenciaActual;
	}

	public void setidReferenciaActual(Long idReferenciaActual) {
		this.idReferenciaActual = idReferenciaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Referencia getreferencia() {
		return this.referencia;
	}

	public void setreferencia(Referencia referencia) {
		this.referencia = referencia;
	}
	
	public Referencia getreferenciaAux() {
		return this.referenciaAux;
	}

	public void setreferenciaAux(Referencia referenciaAux) {
		this.referenciaAux = referenciaAux;
	}				
	
	public Referencia getreferenciaAnterior() {
		return this.referenciaAnterior;
	}

	public void setreferenciaAnterior(Referencia referenciaAnterior) {
		this.referenciaAnterior = referenciaAnterior;
	}	
	
	public Referencia getreferenciaTotales() {
		return this.referenciaTotales;
	}

	public void setreferenciaTotales(Referencia referenciaTotales) {
		this.referenciaTotales = referenciaTotales;
	}	
	
	public Referencia getreferenciaBean() {
		return this.referenciaBean;
	}

	public void setreferenciaBean(Referencia referenciaBean) {
		this.referenciaBean = referenciaBean;
	}	
	
	public ReferenciaParameterReturnGeneral getreferenciaReturnGeneral() {
		return this.referenciaReturnGeneral;
	}

	public void setreferenciaReturnGeneral(ReferenciaParameterReturnGeneral referenciaReturnGeneral) {
		this.referenciaReturnGeneral = referenciaReturnGeneral;
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

	public Long id_parentezcoFK_IdParentezco=-1L;

	public Long getid_parentezcoFK_IdParentezco() {
		return this.id_parentezcoFK_IdParentezco;
	}

	public void setid_parentezcoFK_IdParentezco(Long id_parentezcoFK_IdParentezco) {
		this.id_parentezcoFK_IdParentezco = id_parentezcoFK_IdParentezco;
	}

	public Long id_profesionFK_IdProfesion=-1L;

	public Long getid_profesionFK_IdProfesion() {
		return this.id_profesionFK_IdProfesion;
	}

	public void setid_profesionFK_IdProfesion(Long id_profesionFK_IdProfesion) {
		this.id_profesionFK_IdProfesion = id_profesionFK_IdProfesion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ReferenciaLogic getReferenciaLogic()	{		
		return referenciaLogic;
	}

	public void setReferenciaLogic(ReferenciaLogic referenciaLogic) {
		this.referenciaLogic = referenciaLogic;
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
	
	public Boolean getIsEsNuevoReferencia() {
		return isEsNuevoReferencia;
	}

	public void setIsEsNuevoReferencia(Boolean isEsNuevoReferencia) {
		this.isEsNuevoReferencia = isEsNuevoReferencia;
	}

	public Boolean getEsParaAccionDesdeFormularioReferencia() {
		return esParaAccionDesdeFormularioReferencia;
	}
	
	public void setEsParaAccionDesdeFormularioReferencia(Boolean esParaAccionDesdeFormularioReferencia) {
		this.esParaAccionDesdeFormularioReferencia = esParaAccionDesdeFormularioReferencia;
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

			if(this.referenciaSessionBean==null) {
				this.referenciaSessionBean=new ReferenciaSessionBean();
			}

			if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(referenciaSessionBean.getlidEmpresaActual());
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

			if(this.referenciaSessionBean==null) {
				this.referenciaSessionBean=new ReferenciaSessionBean();
			}

			if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(referenciaSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosParentezcosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.parentezcosForeignKey=new ArrayList<Parentezco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ParentezcoLogic parentezcoLogic=new ParentezcoLogic();

			//parentezcoLogic.getParentezcoDataAccess().setIsForForeingKeyData(true);

			if(this.referenciaSessionBean==null) {
				this.referenciaSessionBean=new ReferenciaSessionBean();
			}

			if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionParentezco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//parentezcoLogic.getParentezcoDataAccess().setIsForForeingKeyData(true);

					parentezcoLogic.getTodosParentezcosWithConnection(sFinalQuery,new Pagination());

					this.parentezcosForeignKey=parentezcoLogic.getParentezcos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaParentezco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					parentezcoLogic.getEntityWithConnection(referenciaSessionBean.getlidParentezcoActual());
					this.parentezcosForeignKey.add(parentezcoLogic.getParentezco());
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

	public void cargarCombosProfesionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.profesionsForeignKey=new ArrayList<Profesion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProfesionLogic profesionLogic=new ProfesionLogic();

			//profesionLogic.getProfesionDataAccess().setIsForForeingKeyData(true);

			if(this.referenciaSessionBean==null) {
				this.referenciaSessionBean=new ReferenciaSessionBean();
			}

			if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionProfesion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//profesionLogic.getProfesionDataAccess().setIsForForeingKeyData(true);

					profesionLogic.getTodosProfesionsWithConnection(sFinalQuery,new Pagination());

					this.profesionsForeignKey=profesionLogic.getProfesions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProfesion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					profesionLogic.getEntityWithConnection(referenciaSessionBean.getlidProfesionActual());
					this.profesionsForeignKey.add(profesionLogic.getProfesion());
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

					if(this.referencia!=null) {
						this.referencia.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormReferencia!=null) {
						this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaReferencia.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormReferencia!=null) {
						if(this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaReferenciaGenerico)throws Exception
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
				jComboBoxid_empresaReferenciaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaReferenciaGenerico!=null && jComboBoxid_empresaReferenciaGenerico.getItemCount()>0) {
					jComboBoxid_empresaReferenciaGenerico.setSelectedIndex(0);
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

					if(this.referencia!=null) {
						this.referencia.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormReferencia!=null) {
						this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoReferencia.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormReferencia!=null) {
						if(this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoReferencia!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoReferencia.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoReferencia!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoReferencia.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoReferencia.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoReferencia.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoReferenciaGenerico)throws Exception
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
				jComboBoxid_empleadoReferenciaGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoReferenciaGenerico!=null && jComboBoxid_empleadoReferenciaGenerico.getItemCount()>0) {
					jComboBoxid_empleadoReferenciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualParentezcoForeignKey(Long idParentezcoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Parentezco  parentezcoTemp=null;

			for(Parentezco parentezcoAux:parentezcosForeignKey) {
				if(parentezcoAux.getId()!=null && parentezcoAux.getId().equals(idParentezcoSeleccionado)) {
					parentezcoTemp=parentezcoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(parentezcoTemp!=null) {

					if(this.referencia!=null) {
						this.referencia.setParentezco(parentezcoTemp);
					}

					if(this.jInternalFrameDetalleFormReferencia!=null) {
						this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.setSelectedItem(parentezcoTemp);
					}
				} else {
					//jComboBoxid_parentezcoReferencia.setSelectedItem(parentezcoTemp);
					if(this.jInternalFrameDetalleFormReferencia!=null) {
						if(this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdParentezco") || sFormularioTipoBusqueda.equals("Todos")){
					if(parentezcoTemp!=null && jComboBoxid_parentezcoFK_IdParentezcoReferencia!=null) {
						jComboBoxid_parentezcoFK_IdParentezcoReferencia.setSelectedItem(parentezcoTemp);
					} else {
						if(jComboBoxid_parentezcoFK_IdParentezcoReferencia!=null) {
							//jComboBoxid_parentezcoFK_IdParentezcoReferencia.setSelectedItem(parentezcoTemp);
							if(jComboBoxid_parentezcoFK_IdParentezcoReferencia.getItemCount()>0) {
								jComboBoxid_parentezcoFK_IdParentezcoReferencia.setSelectedIndex(0);
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

	public String getActualParentezcoForeignKeyDescripcion(Long idParentezcoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Parentezco  parentezcoTemp=null;

			for(Parentezco parentezcoAux:parentezcosForeignKey) {
				if(parentezcoAux.getId()!=null && parentezcoAux.getId().equals(idParentezcoSeleccionado)) {
					parentezcoTemp=parentezcoAux;
					break;
				}
			}


			sDescripcion=ParentezcoConstantesFunciones.getParentezcoDescripcion(parentezcoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualParentezcoForeignKeyGenerico(Long idParentezcoSeleccionado,JComboBox jComboBoxid_parentezcoReferenciaGenerico)throws Exception
	{
		try
		{
			Parentezco  parentezcoTemp=null;

			for(Parentezco parentezcoAux:parentezcosForeignKey) {
				if(parentezcoAux.getId()!=null && parentezcoAux.getId().equals(idParentezcoSeleccionado)) {
					parentezcoTemp=parentezcoAux;
					break;
				}
			}

			if(parentezcoTemp!=null) {
				jComboBoxid_parentezcoReferenciaGenerico.setSelectedItem(parentezcoTemp);
			} else {
				if(jComboBoxid_parentezcoReferenciaGenerico!=null && jComboBoxid_parentezcoReferenciaGenerico.getItemCount()>0) {
					jComboBoxid_parentezcoReferenciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProfesionForeignKey(Long idProfesionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Profesion  profesionTemp=null;

			for(Profesion profesionAux:profesionsForeignKey) {
				if(profesionAux.getId()!=null && profesionAux.getId().equals(idProfesionSeleccionado)) {
					profesionTemp=profesionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(profesionTemp!=null) {

					if(this.referencia!=null) {
						this.referencia.setProfesion(profesionTemp);
					}

					if(this.jInternalFrameDetalleFormReferencia!=null) {
						this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.setSelectedItem(profesionTemp);
					}
				} else {
					//jComboBoxid_profesionReferencia.setSelectedItem(profesionTemp);
					if(this.jInternalFrameDetalleFormReferencia!=null) {
						if(this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProfesion") || sFormularioTipoBusqueda.equals("Todos")){
					if(profesionTemp!=null && jComboBoxid_profesionFK_IdProfesionReferencia!=null) {
						jComboBoxid_profesionFK_IdProfesionReferencia.setSelectedItem(profesionTemp);
					} else {
						if(jComboBoxid_profesionFK_IdProfesionReferencia!=null) {
							//jComboBoxid_profesionFK_IdProfesionReferencia.setSelectedItem(profesionTemp);
							if(jComboBoxid_profesionFK_IdProfesionReferencia.getItemCount()>0) {
								jComboBoxid_profesionFK_IdProfesionReferencia.setSelectedIndex(0);
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

	public String getActualProfesionForeignKeyDescripcion(Long idProfesionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Profesion  profesionTemp=null;

			for(Profesion profesionAux:profesionsForeignKey) {
				if(profesionAux.getId()!=null && profesionAux.getId().equals(idProfesionSeleccionado)) {
					profesionTemp=profesionAux;
					break;
				}
			}


			sDescripcion=ProfesionConstantesFunciones.getProfesionDescripcion(profesionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProfesionForeignKeyGenerico(Long idProfesionSeleccionado,JComboBox jComboBoxid_profesionReferenciaGenerico)throws Exception
	{
		try
		{
			Profesion  profesionTemp=null;

			for(Profesion profesionAux:profesionsForeignKey) {
				if(profesionAux.getId()!=null && profesionAux.getId().equals(idProfesionSeleccionado)) {
					profesionTemp=profesionAux;
					break;
				}
			}

			if(profesionTemp!=null) {
				jComboBoxid_profesionReferenciaGenerico.setSelectedItem(profesionTemp);
			} else {
				if(jComboBoxid_profesionReferenciaGenerico!=null && jComboBoxid_profesionReferenciaGenerico.getItemCount()>0) {
					jComboBoxid_profesionReferenciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Referencia referencia,JComboBox jComboBoxid_empresaReferenciaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaReferenciaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaReferenciaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				referencia.setid_empresa(empresaAux.getId());
				referencia.setempresa_descripcion(ReferenciaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				referencia.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(Referencia referencia,JComboBox jComboBoxid_empleadoReferenciaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoReferenciaGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoReferenciaGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				referencia.setid_empleado(empleadoAux.getId());
				referencia.setempleado_descripcion(ReferenciaConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				referencia.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarParentezcoForeignKey(Referencia referencia,JComboBox jComboBoxid_parentezcoReferenciaGenerico)throws Exception
	{
		try
		{
			Parentezco  parentezcoAux=new Parentezco();

			if(jComboBoxid_parentezcoReferenciaGenerico==null) {
				parentezcoAux=(Parentezco)this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.getSelectedItem();
			} else {
				parentezcoAux=(Parentezco)jComboBoxid_parentezcoReferenciaGenerico.getSelectedItem();
			}

			if(parentezcoAux!=null && parentezcoAux.getId()!=null) {
				referencia.setid_parentezco(parentezcoAux.getId());
				referencia.setparentezco_descripcion(ReferenciaConstantesFunciones.getParentezcoDescripcion(parentezcoAux));
				referencia.setParentezco(parentezcoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProfesionForeignKey(Referencia referencia,JComboBox jComboBoxid_profesionReferenciaGenerico)throws Exception
	{
		try
		{
			Profesion  profesionAux=new Profesion();

			if(jComboBoxid_profesionReferenciaGenerico==null) {
				profesionAux=(Profesion)this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.getSelectedItem();
			} else {
				profesionAux=(Profesion)jComboBoxid_profesionReferenciaGenerico.getSelectedItem();
			}

			if(profesionAux!=null && profesionAux.getId()!=null) {
				referencia.setid_profesion(profesionAux.getId());
				referencia.setprofesion_descripcion(ReferenciaConstantesFunciones.getProfesionDescripcion(profesionAux));
				referencia.setProfesion(profesionAux);			}
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

					if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferencia!=null) { 
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferencia!=null) { 
					}

					if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferencia!=null) { 
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferencia!=null) { 
					}

					if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoReferencia.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoReferencia.addItem(empleado);
							}
						}

						if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameParentezcosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingParentezco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferencia!=null) { 
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.removeAllItems();

							for(Parentezco parentezco:this.parentezcosForeignKey) {
								this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.addItem(parentezco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferencia!=null) { 
					}

					if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdParentezco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_parentezcoFK_IdParentezcoReferencia.removeAllItems();

							for(Parentezco parentezco:this.parentezcosForeignKey) {
								this.jComboBoxid_parentezcoFK_IdParentezcoReferencia.addItem(parentezco);
							}
						}

						if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProfesionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProfesion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferencia!=null) { 
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.removeAllItems();

							for(Profesion profesion:this.profesionsForeignKey) {
								this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.addItem(profesion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferencia!=null) { 
					}

					if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProfesion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_profesionFK_IdProfesionReferencia.removeAllItems();

							for(Profesion profesion:this.profesionsForeignKey) {
								this.jComboBoxid_profesionFK_IdProfesionReferencia.addItem(profesion);
							}
						}

						if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormReferencia!=null) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferencia!=null) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormReferencia!=null) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferencia!=null) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoReferencia.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoReferencia.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameParentezcoForeignKey(Parentezco parentezco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferencia!=null) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.setSelectedItem(parentezco);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferencia!=null) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_parentezcoFK_IdParentezcoReferencia.setSelectedItem(parentezco);
						} else {
							this.jComboBoxid_parentezcoFK_IdParentezcoReferencia.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProfesionForeignKey(Profesion profesion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferencia!=null) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.setSelectedItem(profesion);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferencia!=null) {
							this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_profesionFK_IdProfesionReferencia.setSelectedItem(profesion);
						} else {
							this.jComboBoxid_profesionFK_IdProfesionReferencia.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesReferencia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ReferenciaConstantesFunciones.refrescarForeignKeysDescripcionesReferencia(this.referenciaLogic.getReferencias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ReferenciaConstantesFunciones.refrescarForeignKeysDescripcionesReferencia(this.referencias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Parentezco.class));
		classes.add(new Classe(Profesion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//referenciaLogic.setReferencias(this.referencias);
			referenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ReferenciaParameterReturnGeneral getReferenciaParameterGeneral() {
		return this.referenciaParameterGeneral;
	}
	
	public void setReferenciaParameterGeneral(ReferenciaParameterReturnGeneral referenciaParameterGeneral) {
		this.referenciaParameterGeneral = referenciaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoReferencia() {
		return isPermisoTodoReferencia;
	}

	public void setIsPermisoTodoReferencia(Boolean isPermisoTodoReferencia) {
		this.isPermisoTodoReferencia = isPermisoTodoReferencia;
	}

	public Boolean getIsPermisoNuevoReferencia() {
		return isPermisoNuevoReferencia;
	}

	public void setIsPermisoNuevoReferencia(Boolean isPermisoNuevoReferencia) {
		this.isPermisoNuevoReferencia = isPermisoNuevoReferencia;
	}

	public Boolean getIsPermisoActualizarReferencia() {
		return isPermisoActualizarReferencia;
	}

	public void setIsPermisoActualizarReferencia(Boolean isPermisoActualizarReferencia) {
		this.isPermisoActualizarReferencia = isPermisoActualizarReferencia;
	}

	public Boolean getIsPermisoEliminarReferencia() {
		return isPermisoEliminarReferencia;
	}

	public void setIsPermisoEliminarReferencia(Boolean isPermisoEliminarReferencia) {
		this.isPermisoEliminarReferencia = isPermisoEliminarReferencia;
	}

	public Boolean getIsPermisoGuardarCambiosReferencia() {
		return isPermisoGuardarCambiosReferencia;
	}

	public void setIsPermisoGuardarCambiosReferencia(Boolean isPermisoGuardarCambiosReferencia) {
		this.isPermisoGuardarCambiosReferencia = isPermisoGuardarCambiosReferencia;
	}
	
	public Boolean getIsPermisoConsultaReferencia() {
		return isPermisoConsultaReferencia;
	}

	public void setIsPermisoConsultaReferencia(Boolean isPermisoConsultaReferencia) {
		this.isPermisoConsultaReferencia = isPermisoConsultaReferencia;
	}

	public Boolean getIsPermisoBusquedaReferencia() {
		return isPermisoBusquedaReferencia;
	}

	public void setIsPermisoBusquedaReferencia(Boolean isPermisoBusquedaReferencia) {
		this.isPermisoBusquedaReferencia = isPermisoBusquedaReferencia;
	}

	public Boolean getIsPermisoReporteReferencia() {
		return isPermisoReporteReferencia;
	}

	public void setIsPermisoReporteReferencia(Boolean isPermisoReporteReferencia) {
		this.isPermisoReporteReferencia = isPermisoReporteReferencia;
	}
	
	public Boolean getIsPermisoPaginacionMedioReferencia() {
		return isPermisoPaginacionMedioReferencia;
	}

	public void setIsPermisoPaginacionMedioReferencia(Boolean isPermisoPaginacionMedioReferencia) {
		this.isPermisoPaginacionMedioReferencia = isPermisoPaginacionMedioReferencia;
	}
	
	public Boolean getIsPermisoPaginacionTodoReferencia() {
		return isPermisoPaginacionTodoReferencia;
	}

	public void setIsPermisoPaginacionTodoReferencia(Boolean isPermisoPaginacionTodoReferencia) {
		this.isPermisoPaginacionTodoReferencia = isPermisoPaginacionTodoReferencia;
	}
	
	public Boolean getIsPermisoPaginacionAltoReferencia() {
		return isPermisoPaginacionAltoReferencia;
	}

	public void setIsPermisoPaginacionAltoReferencia(Boolean isPermisoPaginacionAltoReferencia) {
		this.isPermisoPaginacionAltoReferencia = isPermisoPaginacionAltoReferencia;
	}
	
	public Boolean getIsPermisoCopiarReferencia() {
		return isPermisoCopiarReferencia;
	}

	public void setIsPermisoCopiarReferencia(Boolean isPermisoCopiarReferencia) {
		this.isPermisoCopiarReferencia = isPermisoCopiarReferencia;
	}
	
	public Boolean getIsPermisoVerFormReferencia() {
		return isPermisoVerFormReferencia;
	}

	public void setIsPermisoVerFormReferencia(Boolean isPermisoVerFormReferencia) {
		this.isPermisoVerFormReferencia = isPermisoVerFormReferencia;
	}
	
	public Boolean getIsPermisoDuplicarReferencia() {
		return isPermisoDuplicarReferencia;
	}

	public void setIsPermisoDuplicarReferencia(Boolean isPermisoDuplicarReferencia) {
		this.isPermisoDuplicarReferencia = isPermisoDuplicarReferencia;
	}
	
	public Boolean getIsPermisoOrdenReferencia() {
		return isPermisoOrdenReferencia;
	}

	public void setIsPermisoOrdenReferencia(Boolean isPermisoOrdenReferencia) {
		this.isPermisoOrdenReferencia = isPermisoOrdenReferencia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoReferencia() {
		return isVisibilidadCeldaNuevoReferencia;
	}

	public void setIsVisibilidadCeldaNuevoReferencia(Boolean isVisibilidadCeldaNuevoReferencia) {
		this.isVisibilidadCeldaNuevoReferencia = isVisibilidadCeldaNuevoReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarReferencia() {
		return isVisibilidadCeldaDuplicarReferencia;
	}

	public void setIsVisibilidadCeldaDuplicarReferencia(Boolean isVisibilidadCeldaDuplicarReferencia) {
		this.isVisibilidadCeldaDuplicarReferencia = isVisibilidadCeldaDuplicarReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarReferencia() {
		return isVisibilidadCeldaCopiarReferencia;
	}

	public void setIsVisibilidadCeldaCopiarReferencia(Boolean isVisibilidadCeldaCopiarReferencia) {
		this.isVisibilidadCeldaCopiarReferencia = isVisibilidadCeldaCopiarReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormReferencia() {
		return isVisibilidadCeldaVerFormReferencia;
	}

	public void setIsVisibilidadCeldaVerFormReferencia(Boolean isVisibilidadCeldaVerFormReferencia) {
		this.isVisibilidadCeldaVerFormReferencia = isVisibilidadCeldaVerFormReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenReferencia() {
		return isVisibilidadCeldaOrdenReferencia;
	}

	public void setIsVisibilidadCeldaOrdenReferencia(Boolean isVisibilidadCeldaOrdenReferencia) {
		this.isVisibilidadCeldaOrdenReferencia = isVisibilidadCeldaOrdenReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesReferencia() {
		return isVisibilidadCeldaNuevoRelacionesReferencia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesReferencia(Boolean isVisibilidadCeldaNuevoRelacionesReferencia) {
		this.isVisibilidadCeldaNuevoRelacionesReferencia = isVisibilidadCeldaNuevoRelacionesReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarReferencia() {
		return isVisibilidadCeldaModificarReferencia;
	}

	public void setIsVisibilidadCeldaModificarReferencia(Boolean isVisibilidadCeldaModificarReferencia) {
		this.isVisibilidadCeldaModificarReferencia = isVisibilidadCeldaModificarReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarReferencia() {
		return isVisibilidadCeldaActualizarReferencia;
	}

	public void setIsVisibilidadCeldaActualizarReferencia(Boolean isVisibilidadCeldaActualizarReferencia) {
		this.isVisibilidadCeldaActualizarReferencia = isVisibilidadCeldaActualizarReferencia;
	}

	public Boolean getIsVisibilidadCeldaEliminarReferencia() {
		return isVisibilidadCeldaEliminarReferencia;
	}

	public void setIsVisibilidadCeldaEliminarReferencia(Boolean isVisibilidadCeldaEliminarReferencia) {
		this.isVisibilidadCeldaEliminarReferencia = isVisibilidadCeldaEliminarReferencia;
	}

	public Boolean getIsVisibilidadCeldaCancelarReferencia() {
		return isVisibilidadCeldaCancelarReferencia;
	}

	public void setIsVisibilidadCeldaCancelarReferencia(Boolean isVisibilidadCeldaCancelarReferencia) {
		this.isVisibilidadCeldaCancelarReferencia = isVisibilidadCeldaCancelarReferencia;
	}

	public Boolean getIsVisibilidadCeldaGuardarReferencia() {
		return isVisibilidadCeldaGuardarReferencia;
	}

	public void setIsVisibilidadCeldaGuardarReferencia(Boolean isVisibilidadCeldaGuardarReferencia) {
		this.isVisibilidadCeldaGuardarReferencia = isVisibilidadCeldaGuardarReferencia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosReferencia() {
		return isVisibilidadCeldaGuardarCambiosReferencia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosReferencia(Boolean isVisibilidadCeldaGuardarCambiosReferencia) {
		this.isVisibilidadCeldaGuardarCambiosReferencia = isVisibilidadCeldaGuardarCambiosReferencia;
	}
		
	public ReferenciaSessionBean getreferenciaSessionBean() {
		return this.referenciaSessionBean;
	}
	
	public void setreferenciaSessionBean(ReferenciaSessionBean referenciaSessionBean) {
		this.referenciaSessionBean=referenciaSessionBean;
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

	public Boolean getisVisibilidadFK_IdParentezco() {
		return this.isVisibilidadFK_IdParentezco;
	}

	public void setisVisibilidadFK_IdParentezco(Boolean isVisibilidadFK_IdParentezco) {
		this.isVisibilidadFK_IdParentezco=isVisibilidadFK_IdParentezco;
	}

	public Boolean getisVisibilidadFK_IdProfesion() {
		return this.isVisibilidadFK_IdProfesion;
	}

	public void setisVisibilidadFK_IdProfesion(Boolean isVisibilidadFK_IdProfesion) {
		this.isVisibilidadFK_IdProfesion=isVisibilidadFK_IdProfesion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysReferencia(Referencia referencia)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(referencia,null);
				this.setActualParaGuardarEmpleadoForeignKey(referencia,null);
				this.setActualParaGuardarParentezcoForeignKey(referencia,null);
				this.setActualParaGuardarProfesionForeignKey(referencia,null);
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
	
	public void bugActualizarReferenciaActual(Referencia referencia,Referencia referenciaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalReferencia(referencia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		referenciaAux.setId(referencia.getId());
		referenciaAux.setVersionRow(referencia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessReferencia();
		
			int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = referenciaValidator.getInvalidValues(this.referencia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			referenciaLogic.setDatosCliente(datosCliente);
			referenciaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				referenciaAux=new  Referencia();
				
				referenciaAux.setIsNew(true);
				referenciaAux.setIsChanged(true);
				
				referenciaAux.setReferenciaOriginal(this.referencia);
				
				referenciaAux.setId(this.referencia.getId());	
				referenciaAux.setVersionRow(this.referencia.getVersionRow());	
				referenciaAux.setid_empresa(this.referencia.getid_empresa());	
				referenciaAux.setid_empleado(this.referencia.getid_empleado());	
				referenciaAux.setid_parentezco(this.referencia.getid_parentezco());	
				referenciaAux.setid_profesion(this.referencia.getid_profesion());	
				referenciaAux.setcedula(this.referencia.getcedula());	
				referenciaAux.setapellido(this.referencia.getapellido());	
				referenciaAux.setnombre(this.referencia.getnombre());	
				referenciaAux.setdireccion(this.referencia.getdireccion());	
				referenciaAux.settelefono(this.referencia.gettelefono());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.referenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.referenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(referenciaAux,referenciaLogic.getReferencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciaAux,referencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.referenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciaLogic.saveReferencias();//WithConnection
						//referenciaLogic.getSetVersionRowReferencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.referencia,referenciaAux);
					
					this.refrescarForeignKeysDescripcionesReferencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.getTelefonoReferencias().addAll(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferencias.addAll(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciaLogic.saveReferenciaRelaciones(referenciaAux,this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.getTelefonoReferencias());//WithConnection
								//referenciaLogic.getSetVersionRowReferencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.referencia,referenciaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.setTelefonoReferencias(new ArrayList<TelefonoReferencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferencias= new ArrayList<TelefonoReferencia>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							referenciaAux.setTelefonoReferencias(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.getTelefonoReferencias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.referenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.referenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(referenciaAux,referenciaLogic.getReferencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(referenciaAux,referencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.referencia,referenciaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				referenciaAux=new  Referencia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.referenciaSessionBean.getEsGuardarRelacionado() 
					|| (this.referenciaSessionBean.getEsGuardarRelacionado() && this.referencia.getId()>=0)) {
						
					referenciaAux.setIsNew(false);
				}
				
				referenciaAux.setIsDeleted(false);
			
				referenciaAux.setId(this.referencia.getId());	
				referenciaAux.setVersionRow(this.referencia.getVersionRow());	
				referenciaAux.setid_empresa(this.referencia.getid_empresa());	
				referenciaAux.setid_empleado(this.referencia.getid_empleado());	
				referenciaAux.setid_parentezco(this.referencia.getid_parentezco());	
				referenciaAux.setid_profesion(this.referencia.getid_profesion());	
				referenciaAux.setcedula(this.referencia.getcedula());	
				referenciaAux.setapellido(this.referencia.getapellido());	
				referenciaAux.setnombre(this.referencia.getnombre());	
				referenciaAux.setdireccion(this.referencia.getdireccion());	
				referenciaAux.settelefono(this.referencia.gettelefono());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(referenciaAux,referenciaLogic.getReferencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciaAux,referencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.referenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciaLogic.saveReferencias();//WithConnection
						//referenciaLogic.getSetVersionRowReferencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.referencia,referenciaAux);
					
					this.refrescarForeignKeysDescripcionesReferencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.getTelefonoReferencias().addAll(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferencias.addAll(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciaLogic.saveReferenciaRelaciones(referenciaAux,this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.getTelefonoReferencias());//WithConnection
								//referenciaLogic.getSetVersionRowReferencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.referencia,referenciaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.setTelefonoReferencias(new ArrayList<TelefonoReferencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferencias= new ArrayList<TelefonoReferencia>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							referenciaAux.setTelefonoReferencias(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.getTelefonoReferencias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.referenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.referenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(referenciaAux,referenciaLogic.getReferencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(referenciaAux,referencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.referencia,referenciaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				referenciaAux=new  Referencia();
				
				referenciaAux.setIsNew(false);
				referenciaAux.setIsChanged(false);
				
				referenciaAux.setIsDeleted(true);
				
				referenciaAux.setId(this.referencia.getId());	
				referenciaAux.setVersionRow(this.referencia.getVersionRow());	
				referenciaAux.setid_empresa(this.referencia.getid_empresa());	
				referenciaAux.setid_empleado(this.referencia.getid_empleado());	
				referenciaAux.setid_parentezco(this.referencia.getid_parentezco());	
				referenciaAux.setid_profesion(this.referencia.getid_profesion());	
				referenciaAux.setcedula(this.referencia.getcedula());	
				referenciaAux.setapellido(this.referencia.getapellido());	
				referenciaAux.setnombre(this.referencia.getnombre());	
				referenciaAux.setdireccion(this.referencia.getdireccion());	
				referenciaAux.settelefono(this.referencia.gettelefono());	
				
				if(this.referenciaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.referenciaAux.getId()>=0) {	
						this.referenciasEliminados.add(referenciaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(referenciaAux,referenciaLogic.getReferencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciaAux,referencias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.referenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciaLogic.saveReferencias();//WithConnection
						//referenciaLogic.getSetVersionRowReferencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.getTelefonoReferencias().addAll(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferencias.addAll(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciaLogic.saveReferenciaRelaciones(referenciaAux,this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.getTelefonoReferencias());//WithConnection
								//referenciaLogic.getSetVersionRowReferencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.setTelefonoReferencias(new ArrayList<TelefonoReferencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferencias= new ArrayList<TelefonoReferencia>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							referenciaAux.setTelefonoReferencias(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.getTelefonoReferencias());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.referenciaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.referenciaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(referenciaAux,referenciaLogic.getReferencias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(referenciaAux,referencias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getReferencias().addAll(this.referenciasEliminados);
					
					referenciaLogic.saveReferencias();//WithConnection
					//referenciaLogic.getSetVersionRowReferencias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesReferencia();
				
				this.referenciasEliminados= new ArrayList<Referencia>();		
			}
			
			if(this.referenciaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Referencia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Referencia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.referencia=referenciaAux;
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
      		//this.finishProcessReferencia();
      	}
		
	}	
	
	public void actualizarRelaciones(Referencia referenciaLocal) throws Exception {
		
		if(this.referenciaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				referenciaLocal.setTelefonoReferencias(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.getTelefonoReferencias());
			
			} else {
			
				referenciaLocal.setTelefonoReferencias(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferencias);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Referencia referenciaLocal) throws Exception {	
		if(this.referenciaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				referenciaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				referenciaLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ParentezcoDetalleFormJInternalFrame.class)) {
				ParentezcoBeanSwingJInternalFrame parentezcoBeanSwingJInternalFrameLocal=(ParentezcoBeanSwingJInternalFrame) ((ParentezcoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				parentezcoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoParentezco(parentezcoBeanSwingJInternalFrameLocal.getparentezco(),true);
				parentezcoBeanSwingJInternalFrameLocal.actualizarLista(parentezcoBeanSwingJInternalFrameLocal.parentezco,this.parentezcosForeignKey);

				parentezcoBeanSwingJInternalFrameLocal.actualizarRelaciones(parentezcoBeanSwingJInternalFrameLocal.parentezco);

				referenciaLocal.setParentezco(parentezcoBeanSwingJInternalFrameLocal.parentezco);

				this.addItemDefectoCombosForeignKeyParentezco();
				this.cargarCombosFrameParentezcosForeignKey("Formulario");
				this.setActualParentezcoForeignKey(parentezcoBeanSwingJInternalFrameLocal.parentezco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProfesionDetalleFormJInternalFrame.class)) {
				ProfesionBeanSwingJInternalFrame profesionBeanSwingJInternalFrameLocal=(ProfesionBeanSwingJInternalFrame) ((ProfesionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				profesionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProfesion(profesionBeanSwingJInternalFrameLocal.getprofesion(),true);
				profesionBeanSwingJInternalFrameLocal.actualizarLista(profesionBeanSwingJInternalFrameLocal.profesion,this.profesionsForeignKey);

				profesionBeanSwingJInternalFrameLocal.actualizarRelaciones(profesionBeanSwingJInternalFrameLocal.profesion);

				referenciaLocal.setProfesion(profesionBeanSwingJInternalFrameLocal.profesion);

				this.addItemDefectoCombosForeignKeyProfesion();
				this.cargarCombosFrameProfesionsForeignKey("Formulario");
				this.setActualProfesionForeignKey(profesionBeanSwingJInternalFrameLocal.profesion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarReferenciaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = referenciaValidator.getInvalidValues(this.referencia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Referencia referencia,List<Referencia> referencias) throws Exception {
		try	{		
			ReferenciaConstantesFunciones.actualizarLista(referencia,referencias,this.referenciaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Referencia referencia,List<Referencia> referencias) throws Exception {
		try	{			
			ReferenciaConstantesFunciones.actualizarSelectedLista(referencia,referencias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Referencia> referenciasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				referenciasLocal=this.referenciaLogic.getReferencias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				referenciasLocal=this.referencias;
			}
			//ARCHITECTURE
		
			for(Referencia referenciaLocal:referenciasLocal) {
				if(this.permiteMantenimiento(referenciaLocal) && referenciaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ReferenciaConstantesFunciones.getReferenciaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ReferenciaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabelid_empresaReferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabelid_empleadoReferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaConstantesFunciones.IDPARENTEZCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabelid_parentezcoReferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaConstantesFunciones.IDPROFESION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabelid_profesionReferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaConstantesFunciones.CEDULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabelcedulaReferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabelapellidoReferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabelnombreReferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabeldireccionReferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabeltelefonoReferencia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormReferencia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferencia.jLabelid_empresaReferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferencia.jLabelid_empleadoReferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferencia.jLabelid_parentezcoReferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferencia.jLabelid_profesionReferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferencia.jLabelcedulaReferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferencia.jLabelapellidoReferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferencia.jLabelnombreReferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferencia.jLabeldireccionReferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferencia.jLabeltelefonoReferencia,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("TelefonoReferencia")) {
			if(this.referencia==null) {
				this.referencia= new Referencia();
			}

			if(this.referenciaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoReferencia
				this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);

				this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.gettelefonoreferencia().setReferencia(this.referencia);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoReferencia--;	
		
		
		this.referenciaAux=new Referencia();
		
		this.referenciaAux.setId(this.iIdNuevoReferencia);
		this.referenciaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.referenciaLogic.getReferencias().add(this.referenciaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.referencias.add(this.referenciaAux);
		}
		//ARCHITECTURE
		
		this.referencia=this.referenciaAux;
		
		if(ReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioReferencia(this.referencia);
			this.setVariablesObjetoActualToFormularioForeignKeyReferencia(this.referencia);
		}
				
		//this.setDefaultControlesReferencia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyReferencia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyReferencia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyReferencia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReferencia(this.referenciaBean,this.referencia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ReferenciaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.referenciaSessionBean.getConGuardarRelaciones()) {
			classes=ReferenciaConstantesFunciones.getClassesRelationshipsOfReferencia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.referenciaReturnGeneral=referenciaLogic.procesarEventosReferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referenciaLogic.getReferencias(),this.referencia,this.referenciaParameterGeneral,this.isEsNuevoReferencia,classes);//this.referenciaLogic.getReferencia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanReferencia(this.referenciaReturnGeneral,this.referenciaBean,false);
		
		if(this.referenciaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyReferencia(this.referenciaReturnGeneral.getReferencia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioReferencia(this.referenciaReturnGeneral.getReferencia());
		}
		
		if(this.referenciaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioReferencia(this.referenciaReturnGeneral.getReferencia(),classes);//this.referenciaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualReferencia(this.referencia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyReferencia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyReferencia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReferenciaBeanSwingJInternalFrameAdditional.RecargarFormReferencia(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingReferencia(false);
						
			if(referenciaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaSessionBean.getEsGuardarRelacionado() && TelefonoReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTelefonoReferenciaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ReferenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferencia();
			}
			
			this.actualizarVisualTableDatosReferencia();
			
			this.jTableDatosReferencia.setRowSelectionInterval(this.getIndiceNuevoReferencia(), this.getIndiceNuevoReferencia());
			
			this.seleccionarFilaTablaReferenciaActual();
						
			this.actualizarEstadoCeldasBotonesReferencia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesReferencia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormReferencia.jTextFieldcedulaReferencia.setEnabled(isHabilitar && this.referenciaConstantesFunciones.activarcedulaReferencia);
		this.jInternalFrameDetalleFormReferencia.jTextFieldapellidoReferencia.setEnabled(isHabilitar && this.referenciaConstantesFunciones.activarapellidoReferencia);
		this.jInternalFrameDetalleFormReferencia.jTextFieldnombreReferencia.setEnabled(isHabilitar && this.referenciaConstantesFunciones.activarnombreReferencia);
		this.jInternalFrameDetalleFormReferencia.jTextAreadireccionReferencia.setEnabled(isHabilitar && this.referenciaConstantesFunciones.activardireccionReferencia);
		this.jInternalFrameDetalleFormReferencia.jTextFieldtelefonoReferencia.setEnabled(isHabilitar && this.referenciaConstantesFunciones.activartelefonoReferencia);	
		//
		this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.setEnabled(isHabilitar && this.referenciaConstantesFunciones.activarid_empresaReferencia);
		this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.setEnabled(isHabilitar && this.referenciaConstantesFunciones.activarid_empleadoReferencia);
		this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.setEnabled(isHabilitar && this.referenciaConstantesFunciones.activarid_parentezcoReferencia);
		this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.setEnabled(isHabilitar && this.referenciaConstantesFunciones.activarid_profesionReferencia);
	};
	
	public void setDefaultControlesReferencia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoReferencia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.referenciaSessionBean.setConGuardarRelaciones(true);			
			this.referenciaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormReferencia.jTabbedPaneRelacionesReferencia.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.referenciaSessionBean.setConGuardarRelaciones(false);			
			this.referenciaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormReferencia.jTabbedPaneRelacionesReferencia.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoReferencia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Referencia referenciaAux:this.referenciaLogic.getReferencias()) {
				if(referenciaAux.getId().equals(this.iIdNuevoReferencia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Referencia referenciaAux:this.referencias) {
				if(referenciaAux.getId().equals(this.iIdNuevoReferencia)) {
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
	
	public int getIndiceActualReferencia(Referencia referencia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Referencia referenciaAux:this.referenciaLogic.getReferencias()) {
				if(referenciaAux.getId().equals(referencia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Referencia referenciaAux:this.referencias) {
				if(referenciaAux.getId().equals(referencia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalReferencia(Referencia referenciaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Referencia referenciaAux:this.referenciaLogic.getReferencias()) {
				if(referenciaAux.getReferenciaOriginal().getId().equals(referenciaOriginal.getId())) {
					existe=true;
					referenciaOriginal.setId(referenciaAux.getId());
					referenciaOriginal.setVersionRow(referenciaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Referencia referenciaAux:this.referencias) {
				if(referenciaAux.getReferenciaOriginal().getId().equals(referenciaOriginal.getId())) {
					existe=true;
					referenciaOriginal.setId(referenciaAux.getId());
					referenciaOriginal.setVersionRow(referenciaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosReferencia(Boolean esParaCancelar) throws Exception {
		referenciasAux=new ArrayList<Referencia>();
		referenciaAux=new Referencia();
		
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Referencia referenciaAux:this.referenciaLogic.getReferencias()) {
					if(referenciaAux.getId()<0) {
						referenciasAux.add(referenciaAux);
					}		
				}
				this.iIdNuevoReferencia=0L;
				this.referenciaLogic.getReferencias().removeAll(referenciasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Referencia referenciaAux:this.referencias) {
					if(referenciaAux.getId()<0) {
						referenciasAux.add(referenciaAux);
					}		
				}
				this.iIdNuevoReferencia=0L;
				this.referencias.removeAll(referenciasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoReferencia 
					&& this.referenciaLogic.getReferencias().size()>0
					) {
					referenciaAux=this.referenciaLogic.getReferencias().get(this.referenciaLogic.getReferencias().size() - 1);
				
					if(referenciaAux.getId()<0) {
						this.referenciaLogic.getReferencias().remove(referenciaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoReferencia && this.referencias.size()>0) {
					referenciaAux=this.referencias.get(this.referencias.size() - 1);
				
					if(referenciaAux.getId()<0) {
						this.referencias.remove(referenciaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoReferencia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(referencia.getId()<0) {
				this.referenciaLogic.getReferencias().remove(this.referencia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(referencia.getId()<0) {
				this.referencias.remove(this.referencia);
			}
		}			
	}
	
	public void setEstadosInicialesReferencia(List<Referencia> referenciasAux) throws Exception {
		ReferenciaConstantesFunciones.setEstadosInicialesReferencia(referenciasAux);
	}
	
	public void setEstadosInicialesReferencia(Referencia referenciaAux) throws Exception {
		ReferenciaConstantesFunciones.setEstadosInicialesReferencia(referenciaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarReferenciaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarReferenciaActual()) {
				if(!this.isEsNuevoReferencia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoReferencia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarReferenciaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Referencia ?", "MANTENIMIENTO DE Referencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Referencia referencia) throws Exception {
		ReferenciaConstantesFunciones.seleccionarAsignar(this.referencia,referencia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarReferencia=this.isPermisoActualizarOriginalReferencia;
			
			
			this.seleccionarAsignar(referencia);
			
			

			idEmpleadoActual=referencia.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReferenciaConstantesFunciones.quitarEspaciosReferencia(this.referencia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesReferencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.referenciaSessionBean.setsFuncionBusquedaRapida(this.referenciaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoReferencia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosReferencia(esParaCancelar);				
				this.cancelarNuevoReferencia(esParaCancelar);								
			}
			
			this.referencia=new Referencia();
			
			this.inicializarReferencia();
			
			this.actualizarEstadoCeldasBotonesReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarReferencia() throws Exception {
		try {
			ReferenciaConstantesFunciones.inicializarReferencia(this.referencia);
			
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
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.referenciaLogic.getReferencias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteReferencias(String sAccionBusqueda,List<Referencia> referenciasParaReportes) throws Exception {
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
					sPathReporteFinal="Referencia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ReferenciaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ReferenciaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Referencia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Referencias");		
		parameters.put("busquedapor", ReferenciaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(TelefonoReferencia.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ReferenciaLogic referenciaLogicAuxiliar=new ReferenciaLogic();
					referenciaLogicAuxiliar.setDatosCliente(referenciaLogic.getDatosCliente());				
					referenciaLogicAuxiliar.setReferencias(referenciasParaReportes);
					
					referenciaLogicAuxiliar.cargarRelacionesLoteForeignKeyReferenciaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					referenciasParaReportes=referenciaLogicAuxiliar.getReferencias();
					
					//referenciaLogic.getNewConnexionToDeep();
					
					//for (Referencia referencia:referenciasParaReportes) {
					//	referenciaLogic.deepLoad(referencia, false, DeepLoadType.INCLUDE, classes);
					//}						
					//referenciaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//referenciaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTelefonoReferencia = AuxiliarReportes.class.getResourceAsStream("TelefonoReferenciaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_telefonoreferencia", reportFileTelefonoReferencia);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceReferencia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ReferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ReferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceReferencia=new JRBeanArrayDataSource(ReferenciaJInternalFrame.TraerReferenciaBeans(referenciasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceReferencia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ReferenciaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ReferenciaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ReferenciaBean.TraerReferenciaBeans(referenciasParaReportes).toArray()));
							
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
				this.generarExcelReporteReferencias(sAccionBusqueda,sTipoArchivoReporte,referenciasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalReferencias(sAccionBusqueda,sTipoArchivoReporte,referenciasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoReferenciaActionPerformed(null);
					//this.generarExcelReporteReferencias(sAccionBusqueda,sTipoArchivoReporte,referenciasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalReferencias(sAccionBusqueda,sTipoArchivoReporte,referenciasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesReferencias(sAccionBusqueda,sTipoArchivoReporte,referenciasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesReferencias(sAccionBusqueda,sTipoArchivoReporte,referenciasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteReferencias(String sAccionBusqueda,String sTipoArchivoReporte,List<Referencia> referenciasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referencia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Referencias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReferencia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Referencia referencia : referenciasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ReferenciaConstantesFunciones.generarExcelReporteDataReferencia("NORMAL",row,workbook,referencia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderReferencia(String sTipo,Row row,Workbook workbook) {
		
		ReferenciaConstantesFunciones.generarExcelReporteHeaderReferencia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalReferencias(String sAccionBusqueda,String sTipoArchivoReporte,List<Referencia> referenciasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referencia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Referencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Referencia referencia : referenciasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ReferenciaConstantesFunciones.getReferenciaDescripcion(referencia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referencia.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referencia.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referencia.getparentezco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaConstantesFunciones.LABEL_IDPROFESION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDPROFESION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referencia.getprofesion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaConstantesFunciones.LABEL_CEDULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaConstantesFunciones.LABEL_CEDULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referencia.getcedula());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referencia.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referencia.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referencia.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referencia.gettelefono());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesReferencias(String sAccionBusqueda,String sTipoArchivoReporte,List<Referencia> referenciasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Referencia> referenciasRespaldo=null;
		
		classes=ReferenciaConstantesFunciones.getClassesRelationshipsOfReferencia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.referenciaLogic.setDatosCliente(this.datosCliente);
		this.referenciaLogic.setDatosDeep(this.datosDeep);
		this.referenciaLogic.setIsConDeep(true);
		
		referenciasRespaldo=this.referenciaLogic.getReferencias();
		
		this.referenciaLogic.setReferencias(referenciasParaReportes);	
		this.referenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		referenciasParaReportes=this.referenciaLogic.getReferencias();
		this.referenciaLogic.setReferencias(referenciasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referencia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Referencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReferencia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Referencia referencia : referenciasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderReferencia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ReferenciaConstantesFunciones.generarExcelReporteDataReferencia("NORMAL",row,workbook,referencia,cellStyleDataAux);
		
			
			


				//TelefonoReferencia
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO))) {

				if(referencia.getTelefonoReferencias()!=null && referencia.getTelefonoReferencias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TelefonoReferenciaConstantesFunciones.generarExcelReporteHeaderTelefonoReferencia("RELACIONADO",row,workbook);
				}

				if(referencia.getTelefonoReferencias()!=null) {
					i2=0;
					for(TelefonoReferencia telefonoreferencia : referencia.getTelefonoReferencias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TelefonoReferenciaConstantesFunciones.generarExcelReporteDataTelefonoReferencia("RELACIONADO",row,workbook,telefonoreferencia,cellStyleDataAuxHijo);
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
		cell.setCellValue(ReferenciaConstantesFunciones.getReferenciaDescripcion(referencia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoReferencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoReferencia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferencia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessReferencia() throws Exception {		
		this.startProcessReferencia(true);
	}
	
	public void startProcessReferencia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasReferencia ,this.jPanelParametrosReportesReferencia, this.jScrollPanelDatosReferencia,this.jPanelPaginacionReferencia, this.jScrollPanelDatosEdicionReferencia, this.jPanelAccionesReferencia,this.jPanelAccionesFormularioReferencia,this.jmenuBarReferencia,this.jmenuBarDetalleReferencia,this.jTtoolBarReferencia,this.jTtoolBarDetalleReferencia);		
		
		final JTabbedPane jTabbedPaneBusquedasReferencia=this.jTabbedPaneBusquedasReferencia; 
		
		final JPanel jPanelParametrosReportesReferencia=this.jPanelParametrosReportesReferencia;
		//final JScrollPane jScrollPanelDatosReferencia=this.jScrollPanelDatosReferencia;
		final JTable jTableDatosReferencia=this.jTableDatosReferencia;		
		final JPanel jPanelPaginacionReferencia=this.jPanelPaginacionReferencia;
		//final JScrollPane jScrollPanelDatosEdicionReferencia=this.jScrollPanelDatosEdicionReferencia;
		final JPanel jPanelAccionesReferencia=this.jPanelAccionesReferencia;
		
		JPanel jPanelCamposAuxiliarReferencia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarReferencia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormReferencia!=null) {
			jPanelCamposAuxiliarReferencia=this.jInternalFrameDetalleFormReferencia.jPanelCamposReferencia;
			jPanelAccionesFormularioAuxiliarReferencia=this.jInternalFrameDetalleFormReferencia.jPanelAccionesFormularioReferencia;
		}
		
		final JPanel jPanelCamposReferencia=jPanelCamposAuxiliarReferencia;
		final JPanel jPanelAccionesFormularioReferencia=jPanelAccionesFormularioAuxiliarReferencia;
		
		
		final JMenuBar jmenuBarReferencia=this.jmenuBarReferencia;
		final JToolBar jTtoolBarReferencia=this.jTtoolBarReferencia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarReferencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReferencia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) {
			jmenuBarDetalleAuxiliarReferencia=this.jInternalFrameDetalleFormReferencia.jmenuBarDetalleReferencia;
			jTtoolBarDetalleAuxiliarReferencia=this.jInternalFrameDetalleFormReferencia.jTtoolBarDetalleReferencia;
		}
		
		final JMenuBar jmenuBarDetalleReferencia=jmenuBarDetalleAuxiliarReferencia;
		final JToolBar jTtoolBarDetalleReferencia=jTtoolBarDetalleAuxiliarReferencia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReferencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReferencia;
			processRunnable.jTableDatos=jTableDatosReferencia;
			processRunnable.jPanelCampos=jPanelCamposReferencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionReferencia;
			processRunnable.jPanelAcciones=jPanelAccionesReferencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReferencia;
			
			
			processRunnable.jmenuBar=jmenuBarReferencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReferencia;
			processRunnable.jTtoolBar=jTtoolBarReferencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReferencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReferencia ,jPanelParametrosReportesReferencia,jTableDatosReferencia, /*jScrollPanelDatosReferencia,*/jPanelCamposReferencia,jPanelPaginacionReferencia, /*jScrollPanelDatosEdicionReferencia,*/ jPanelAccionesReferencia,jPanelAccionesFormularioReferencia,jmenuBarReferencia,jmenuBarDetalleReferencia,jTtoolBarReferencia,jTtoolBarDetalleReferencia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReferencia ,jPanelParametrosReportesReferencia, jScrollPanelDatosReferencia,jPanelPaginacionReferencia, jScrollPanelDatosEdicionReferencia, jPanelAccionesReferencia,jPanelAccionesFormularioReferencia,jmenuBarReferencia,jmenuBarDetalleReferencia,jTtoolBarReferencia,jTtoolBarDetalleReferencia);
						
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
	
	public void finishProcessReferencia() {// throws Exception 
		this.finishProcessReferencia(true);
	}
	
	public void finishProcessReferencia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasReferencia ,this.jPanelParametrosReportesReferencia, this.jScrollPanelDatosReferencia,this.jPanelPaginacionReferencia, this.jScrollPanelDatosEdicionReferencia, this.jPanelAccionesReferencia,this.jPanelAccionesFormularioReferencia,this.jmenuBarReferencia,this.jmenuBarDetalleReferencia,this.jTtoolBarReferencia,this.jTtoolBarDetalleReferencia);		
		
		final JTabbedPane jTabbedPaneBusquedasReferencia=this.jTabbedPaneBusquedasReferencia; 
		
		final JPanel jPanelParametrosReportesReferencia=this.jPanelParametrosReportesReferencia;
		//final JScrollPane jScrollPanelDatosReferencia=this.jScrollPanelDatosReferencia;
		final JTable jTableDatosReferencia=this.jTableDatosReferencia;		
		final JPanel jPanelPaginacionReferencia=this.jPanelPaginacionReferencia;
		//final JScrollPane jScrollPanelDatosEdicionReferencia=this.jScrollPanelDatosEdicionReferencia;
		final JPanel jPanelAccionesReferencia=this.jPanelAccionesReferencia;
		
		JPanel jPanelCamposAuxiliarReferencia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarReferencia=new JPanel();
		
		if(this.jInternalFrameDetalleFormReferencia!=null) {
			jPanelCamposAuxiliarReferencia=this.jInternalFrameDetalleFormReferencia.jPanelCamposReferencia;
			jPanelAccionesFormularioAuxiliarReferencia=this.jInternalFrameDetalleFormReferencia.jPanelAccionesFormularioReferencia;
		}
		
		final JPanel jPanelCamposReferencia=jPanelCamposAuxiliarReferencia;
		final JPanel jPanelAccionesFormularioReferencia=jPanelAccionesFormularioAuxiliarReferencia;
		
		
		final JMenuBar jmenuBarReferencia=this.jmenuBarReferencia;		
		final JToolBar jTtoolBarReferencia=this.jTtoolBarReferencia;
				
		JMenuBar jmenuBarDetalleAuxiliarReferencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReferencia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormReferencia!=null) {
			jmenuBarDetalleAuxiliarReferencia=this.jInternalFrameDetalleFormReferencia.jmenuBarDetalleReferencia;
			jTtoolBarDetalleAuxiliarReferencia=this.jInternalFrameDetalleFormReferencia.jTtoolBarDetalleReferencia;		
		}
		
		final JMenuBar jmenuBarDetalleReferencia=jmenuBarDetalleAuxiliarReferencia;
		final JToolBar jTtoolBarDetalleReferencia=jTtoolBarDetalleAuxiliarReferencia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReferencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReferencia;
			processRunnable.jTableDatos=jTableDatosReferencia;
			processRunnable.jPanelCampos=jPanelCamposReferencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionReferencia;
			processRunnable.jPanelAcciones=jPanelAccionesReferencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReferencia;
			
			
			processRunnable.jmenuBar=jmenuBarReferencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReferencia;
			processRunnable.jTtoolBar=jTtoolBarReferencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReferencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasReferencia ,jPanelParametrosReportesReferencia, jTableDatosReferencia,/*jScrollPanelDatosReferencia,*/jPanelCamposReferencia,jPanelPaginacionReferencia, /*jScrollPanelDatosEdicionReferencia,*/ jPanelAccionesReferencia,jPanelAccionesFormularioReferencia,jmenuBarReferencia,jmenuBarDetalleReferencia,jTtoolBarReferencia,jTtoolBarDetalleReferencia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesReferencia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarReferencia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuReferencia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarReferencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarReferencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleReferencia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuReferencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarReferencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleReferencia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.referenciaConstantesFunciones.getsFinalQueryReferencia();
		String  finalQueryPaginacionTodos=this.referenciaConstantesFunciones.getsFinalQueryReferencia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ReferenciaConstantesFunciones.getArrayColumnasGlobalesNoReferencia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ReferenciaConstantesFunciones.getArrayColumnasGlobalesReferencia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ReferenciaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.referenciasEliminados= new ArrayList<Referencia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessReferencia();
		
				///*ReferenciaSessionBean*/this.referenciaSessionBean=new ReferenciaSessionBean();
			
			if(this.referenciaSessionBean==null) {
				this.referenciaSessionBean=new ReferenciaSessionBean();
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
					this.iNumeroPaginacion=ReferenciaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ReferenciaConstantesFunciones.getClassesForeignKeysOfReferencia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/referencia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			referenciasAux= new ArrayList<Referencia>();
			
				
			referenciaLogic.setDatosCliente(this.datosCliente);
			referenciaLogic.setDatosDeep(this.datosDeep);
			referenciaLogic.setIsConDeep(true);
			
			
			referenciaLogic.getReferenciaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					referenciaLogic.getTodosReferencias(finalQueryGlobal,pagination);
					
					//referenciaLogic.getTodosReferenciasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(referenciaLogic.getReferencias()==null|| referenciaLogic.getReferencias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciasAux= new ArrayList<Referencia>();
							referenciasAux.addAll(referenciaLogic.getReferencias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciasAux= new ArrayList<Referencia>();
							referenciasAux.addAll(referencias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciaLogic.getTodosReferencias(finalQueryGlobal+"",this.pagination);												
							
							//referenciaLogic.getTodosReferenciasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteReferencias("Todos",referenciaLogic.getReferencias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciaLogic.setReferencias(new ArrayList<Referencia>());					
							referenciaLogic.getReferencias().addAll(referenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referencias=new ArrayList<Referencia>();
							referencias.addAll(referenciasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idReferencia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idReferencia=this.idActual;
				
				} else if(this.idReferenciaActual!=null && this.idReferenciaActual!=0L) {
					idReferencia=idReferenciaActual;
				}
				
					
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndicePorId(idReferencia);
				
				this.referencias=new ArrayList<Referencia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					referenciaLogic.getEntity(idReferencia);
					
					//referenciaLogic.getEntityWithConnection(idReferencia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciaLogic.setReferencias(new ArrayList<Referencia>());
					referenciaLogic.getReferencias().add(referenciaLogic.getReferencia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referencias=new ArrayList<Referencia>();
					this.referencias.add(referencia);
				}
				
				if(referenciaLogic.getReferencia()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciaLogic.getReferenciasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciaLogic.getReferencias()==null||referenciaLogic.getReferencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referencias==null|| referencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciasAux=new ArrayList<Referencia>();
						referenciasAux.addAll(referenciaLogic.getReferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciasAux=new ArrayList<Referencia>();
							referenciasAux.addAll(referencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciaLogic.getReferenciasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferencias("FK_IdEmpleado",referenciaLogic.getReferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferencias("FK_IdEmpleado",referencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciaLogic.setReferencias(new ArrayList<Referencia>());
						referenciaLogic.getReferencias().addAll(referenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referencias=new ArrayList<Referencia>();
							referencias.addAll(referenciasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciaLogic.getReferenciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciaLogic.getReferencias()==null||referenciaLogic.getReferencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referencias==null|| referencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciasAux=new ArrayList<Referencia>();
						referenciasAux.addAll(referenciaLogic.getReferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciasAux=new ArrayList<Referencia>();
							referenciasAux.addAll(referencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciaLogic.getReferenciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferencias("FK_IdEmpresa",referenciaLogic.getReferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferencias("FK_IdEmpresa",referencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciaLogic.setReferencias(new ArrayList<Referencia>());
						referenciaLogic.getReferencias().addAll(referenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referencias=new ArrayList<Referencia>();
							referencias.addAll(referenciasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdParentezco")) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdParentezco(id_parentezcoFK_IdParentezco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciaLogic.getReferenciasFK_IdParentezco(finalQueryGlobal,pagination,id_parentezcoFK_IdParentezco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdParentezco(id_parentezcoFK_IdParentezco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdParentezco(id_parentezcoFK_IdParentezco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciaLogic.getReferencias()==null||referenciaLogic.getReferencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referencias==null|| referencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciasAux=new ArrayList<Referencia>();
						referenciasAux.addAll(referenciaLogic.getReferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciasAux=new ArrayList<Referencia>();
							referenciasAux.addAll(referencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciaLogic.getReferenciasFK_IdParentezco(finalQueryGlobal,pagination,id_parentezcoFK_IdParentezco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdParentezco(id_parentezcoFK_IdParentezco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdParentezco(id_parentezcoFK_IdParentezco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferencias("FK_IdParentezco",referenciaLogic.getReferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferencias("FK_IdParentezco",referencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciaLogic.setReferencias(new ArrayList<Referencia>());
						referenciaLogic.getReferencias().addAll(referenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referencias=new ArrayList<Referencia>();
							referencias.addAll(referenciasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProfesion")) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdProfesion(id_profesionFK_IdProfesion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciaLogic.getReferenciasFK_IdProfesion(finalQueryGlobal,pagination,id_profesionFK_IdProfesion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdProfesion(id_profesionFK_IdProfesion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdProfesion(id_profesionFK_IdProfesion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciaLogic.getReferencias()==null||referenciaLogic.getReferencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referencias==null|| referencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciasAux=new ArrayList<Referencia>();
						referenciasAux.addAll(referenciaLogic.getReferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciasAux=new ArrayList<Referencia>();
							referenciasAux.addAll(referencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciaLogic.getReferenciasFK_IdProfesion(finalQueryGlobal,pagination,id_profesionFK_IdProfesion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdProfesion(id_profesionFK_IdProfesion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaConstantesFunciones.getDetalleIndiceFK_IdProfesion(id_profesionFK_IdProfesion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferencias("FK_IdProfesion",referenciaLogic.getReferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferencias("FK_IdProfesion",referencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciaLogic.setReferencias(new ArrayList<Referencia>());
						referenciaLogic.getReferencias().addAll(referenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referencias=new ArrayList<Referencia>();
							referencias.addAll(referenciasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesReferencia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessReferencia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=referenciaLogic.getReferencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referencias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=referenciaLogic.getReferencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referencias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Referencia referencia) {
		Boolean permite=true;
		
		if(this.referencia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ReferenciaConstantesFunciones.getOrderByListaReferencia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ReferenciaConstantesFunciones.getOrderByListaReferencia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Referencia referencia:referenciaLogic.getReferencias()) {
				if(referencia.getsType().equals(Constantes2.S_TOTALES)) {
					referenciaTotales=referencia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Referencia referencia:this.referencias) {
				if(referencia.getsType().equals(Constantes2.S_TOTALES)) {
					referenciaTotales=referencia;
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
			this.referenciaAux=new Referencia();
			this.referenciaAux.setsType(Constantes2.S_TOTALES);
			this.referenciaAux.setIsNew(false);
			this.referenciaAux.setIsChanged(false);
			this.referenciaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ReferenciaConstantesFunciones.TotalizarValoresFilaReferencia(this.referenciaLogic.getReferencias(),this.referenciaAux);
				
				this.referenciaLogic.getReferencias().add(this.referenciaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ReferenciaConstantesFunciones.TotalizarValoresFilaReferencia(this.referencias,this.referenciaAux);
				
				this.referencias.add(this.referenciaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		referenciaTotales=new Referencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.referenciaLogic.getReferencias().remove(referenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.referencias.remove(referenciaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		referenciaTotales=new Referencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Referencia referencia:referenciaLogic.getReferencias()) {
				if(referencia.getsType().equals(Constantes2.S_TOTALES)) {
					referenciaTotales=referencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReferenciaConstantesFunciones.TotalizarValoresFilaReferencia(this.referenciaLogic.getReferencias(),referenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Referencia referencia:this.referencias) {
				if(referencia.getsType().equals(Constantes2.S_TOTALES)) {
					referenciaTotales=referencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReferenciaConstantesFunciones.TotalizarValoresFilaReferencia(this.referencias,referenciaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getReferenciasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciasFK_IdParentezco()throws Exception {
		try {
			sAccionBusqueda="FK_IdParentezco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciasFK_IdProfesion()throws Exception {
		try {
			sAccionBusqueda="FK_IdProfesion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getReferenciasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciaLogic.getReferenciasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciaLogic.getReferenciasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciasFK_IdParentezco(String sFinalQuery,Long id_parentezco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciaLogic.getReferenciasFK_IdParentezco(sFinalQuery,this.pagination,id_parentezco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciasFK_IdProfesion(String sFinalQuery,Long id_profesion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciaLogic.getReferenciasFK_IdProfesion(sFinalQuery,this.pagination,id_profesion);
				
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
	
	public void inicializarPermisosReferencia() {
		this.isPermisoTodoReferencia=false;
		this.isPermisoNuevoReferencia=false;
		this.isPermisoActualizarReferencia=false;
		this.isPermisoActualizarOriginalReferencia=false;
		this.isPermisoEliminarReferencia=false;
		this.isPermisoGuardarCambiosReferencia=false;
		this.isPermisoConsultaReferencia=false;
		this.isPermisoBusquedaReferencia=false;
		this.isPermisoReporteReferencia=false;		
		this.isPermisoOrdenReferencia=false;		
		this.isPermisoPaginacionMedioReferencia=false;		
		this.isPermisoPaginacionAltoReferencia=false;
		this.isPermisoPaginacionTodoReferencia=false;
		this.isPermisoCopiarReferencia=false;		
		this.isPermisoVerFormReferencia=false;		
		this.isPermisoDuplicarReferencia=false;		
		this.isPermisoOrdenReferencia=false;		
	}
	
	public void setPermisosUsuarioReferencia(Boolean isPermiso) {
		this.isPermisoTodoReferencia=isPermiso;
		this.isPermisoNuevoReferencia=isPermiso;
		this.isPermisoActualizarReferencia=isPermiso;
		this.isPermisoActualizarOriginalReferencia=isPermiso;
		this.isPermisoEliminarReferencia=isPermiso;
		this.isPermisoGuardarCambiosReferencia=isPermiso;
		this.isPermisoConsultaReferencia=isPermiso;
		this.isPermisoBusquedaReferencia=isPermiso;
		this.isPermisoReporteReferencia=isPermiso;
		this.isPermisoOrdenReferencia=isPermiso;		
		this.isPermisoPaginacionMedioReferencia=isPermiso;		
		this.isPermisoPaginacionAltoReferencia=isPermiso;		
		this.isPermisoPaginacionTodoReferencia=isPermiso;		
		this.isPermisoCopiarReferencia=isPermiso;		
		this.isPermisoVerFormReferencia=isPermiso;		
		this.isPermisoDuplicarReferencia=isPermiso;
		this.isPermisoOrdenReferencia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioReferencia(Boolean isPermiso) {
		//this.isPermisoTodoReferencia=isPermiso;
		this.isPermisoNuevoReferencia=isPermiso;
		this.isPermisoActualizarReferencia=isPermiso;
		this.isPermisoActualizarOriginalReferencia=isPermiso;
		this.isPermisoEliminarReferencia=isPermiso;
		this.isPermisoGuardarCambiosReferencia=isPermiso;
		//this.isPermisoConsultaReferencia=isPermiso;
		//this.isPermisoBusquedaReferencia=isPermiso;
		//this.isPermisoReporteReferencia=isPermiso;
		//this.isPermisoOrdenReferencia=isPermiso;		
		//this.isPermisoPaginacionMedioReferencia=isPermiso;		
		//this.isPermisoPaginacionAltoReferencia=isPermiso;		
		//this.isPermisoPaginacionTodoReferencia=isPermiso;		
		//this.isPermisoCopiarReferencia=isPermiso;		
		//this.isPermisoDuplicarReferencia=isPermiso;
		//this.isPermisoOrdenReferencia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioReferenciaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TelefonoReferenciaConstantesFunciones.SNOMBREOPCION);
		
		if(ReferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTelefonoReferencia=false;
		this.isTienePermisosTelefonoReferencia=this.verificarGetPermisosUsuarioOpcionReferenciaClaseRelacionada(this.opcionsRelacionadas,TelefonoReferenciaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebReferencia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioReferenciaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTelefonoReferencia=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioReferenciaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionReferenciaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioReferenciaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTelefonoReferencia && this.jInternalFrameDetalleFormReferencia!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormReferencia.jTabbedPaneRelacionesReferencia.remove(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioReferencia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ReferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.referenciaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ReferenciaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoReferencia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarReferencia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalReferencia=this.isPermisoActualizarReferencia;
			this.isPermisoEliminarReferencia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosReferencia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaReferencia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaReferencia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoReferencia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteReferencia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReferencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioReferencia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoReferencia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoReferencia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarReferencia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormReferencia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarReferencia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReferencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.referenciaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosReferencia.setToolTipText(this.jTableDatosReferencia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioReferencia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioReferencia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ReferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ReferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioReferencia() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTelefonoReferencia && this.referenciaConstantesFunciones.mostrarTelefonoReferenciaReferencia && !ReferenciaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Telefono Referencia");
			reporte.setsDescripcion("Telefono Referencia");
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
	public void inicializarCombosForeignKeyReferenciaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.parentezcosForeignKey=new ArrayList();
				this.profesionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyReferenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ReferenciaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyReferenciaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyParentezcoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProfesionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyParentezcoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.parentezcosForeignKey==null||this.parentezcosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ParentezcoConstantesFunciones.getArrayColumnasGlobalesParentezco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ParentezcoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ParentezcoConstantesFunciones.SFINALQUERY;

				this.cargarCombosParentezcosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProfesionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.profesionsForeignKey==null||this.profesionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProfesionConstantesFunciones.getArrayColumnasGlobalesProfesion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProfesionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProfesionConstantesFunciones.SFINALQUERY;

				this.cargarCombosProfesionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyReferenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ReferenciaParameterReturnGeneral referenciaReturnGeneral=new ReferenciaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.referenciaConstantesFunciones.cargarid_empresaReferencia)
					 || (this.esRecargarFks && this.referenciaConstantesFunciones.cargarid_empresaReferencia)) {

					if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+referenciaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.referenciaConstantesFunciones.cargarid_empleadoReferencia)
					 || (this.esRecargarFks && this.referenciaConstantesFunciones.cargarid_empleadoReferencia)) {

					if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+referenciaSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalParentezco="";

				if(((this.parentezcosForeignKey==null||this.parentezcosForeignKey.size()<=0) && this.referenciaConstantesFunciones.cargarid_parentezcoReferencia)
					 || (this.esRecargarFks && this.referenciaConstantesFunciones.cargarid_parentezcoReferencia)) {

					if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionParentezco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ParentezcoConstantesFunciones.getArrayColumnasGlobalesParentezco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalParentezco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ParentezcoConstantesFunciones.TABLENAME);

						finalQueryGlobalParentezco=Funciones.GetFinalQueryAppend(finalQueryGlobalParentezco, "");
						finalQueryGlobalParentezco+=ParentezcoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosParentezcosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalParentezco=" WHERE " + ConstantesSql.ID + "="+referenciaSessionBean.getlidParentezcoActual();
					}
				} else {
					finalQueryGlobalParentezco="NONE";
				}


				String finalQueryGlobalProfesion="";

				if(((this.profesionsForeignKey==null||this.profesionsForeignKey.size()<=0) && this.referenciaConstantesFunciones.cargarid_profesionReferencia)
					 || (this.esRecargarFks && this.referenciaConstantesFunciones.cargarid_profesionReferencia)) {

					if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionProfesion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProfesionConstantesFunciones.getArrayColumnasGlobalesProfesion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProfesion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProfesionConstantesFunciones.TABLENAME);

						finalQueryGlobalProfesion=Funciones.GetFinalQueryAppend(finalQueryGlobalProfesion, "");
						finalQueryGlobalProfesion+=ProfesionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProfesionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProfesion=" WHERE " + ConstantesSql.ID + "="+referenciaSessionBean.getlidProfesionActual();
					}
				} else {
					finalQueryGlobalProfesion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				referenciaReturnGeneral=referenciaLogic.cargarCombosLoteForeignKeyReferencia(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalParentezco,finalQueryGlobalProfesion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=referenciaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=referenciaReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalParentezco.equals("NONE")) {
				this.parentezcosForeignKey=referenciaReturnGeneral.getparentezcosForeignKey();
			}

			if(!finalQueryGlobalProfesion.equals("NONE")) {
				this.profesionsForeignKey=referenciaReturnGeneral.getprofesionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyReferencia()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyParentezco();
			this.addItemDefectoCombosForeignKeyProfesion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.referenciaSessionBean==null) {
				this.referenciaSessionBean=new ReferenciaSessionBean();
			}

			if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyParentezco()throws Exception {
		try {

			if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionParentezco()) {
				Parentezco parentezco=new Parentezco();
				ParentezcoConstantesFunciones.setParentezcoDescripcion(parentezco,Constantes.SMENSAJE_ESCOJA_OPCION);
				parentezco.setId(null);

				if(!ParentezcoConstantesFunciones.ExisteEnLista(this.parentezcosForeignKey,parentezco,true)) {

					this.parentezcosForeignKey.add(0,parentezco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProfesion()throws Exception {
		try {

			if(!this.referenciaSessionBean.getisBusquedaDesdeForeignKeySesionProfesion()) {
				Profesion profesion=new Profesion();
				ProfesionConstantesFunciones.setProfesionDescripcion(profesion,Constantes.SMENSAJE_ESCOJA_OPCION);
				profesion.setId(null);

				if(!ProfesionConstantesFunciones.ExisteEnLista(this.profesionsForeignKey,profesion,true)) {

					this.profesionsForeignKey.add(0,profesion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyReferencia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyReferencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyReferencia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyReferencia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyReferencia(Referencia referencia)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(referencia.getid_empleado(),false,"Formulario");
			this.setActualParentezcoForeignKey(referencia.getid_parentezco(),false,"Formulario");
			this.setActualProfesionForeignKey(referencia.getid_profesion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyReferencia(Referencia referencia,String sTipoEvento)throws Exception {	
		try {
			
			

				if(referencia.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoReferencia")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(referencia.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyReferencia()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.referenciaConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualParentezcoForeignKey(this.referenciaConstantesFunciones.getid_parentezco(),false,"Formulario");
			this.setActualProfesionForeignKey(this.referenciaConstantesFunciones.getid_profesion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyReferencia()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyReferencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyReferencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroReferencia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyReferencia()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameParentezcosForeignKey("Todos");
			this.cargarCombosFrameProfesionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyReferencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameParentezcosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProfesionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyReferencia()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia!=null && this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia!=null && this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia!=null && this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia!=null && this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ReferenciaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ReferenciaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ReferenciaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.referenciaSessionBean=new ReferenciaSessionBean(); 
		this.referenciaConstantesFunciones=new ReferenciaConstantesFunciones(); 
		this.referenciaBean=new Referencia();//(this.referenciaConstantesFunciones); 		
		this.referenciaReturnGeneral=new ReferenciaParameterReturnGeneral(); 
		
		this.referenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ReferenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ReferenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ReferenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessReferencia(true);
			
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
			
			this.referenciaConstantesFunciones=new ReferenciaConstantesFunciones(); 
			this.referenciaBean=new Referencia();//this.referenciaConstantesFunciones); 			
			this.referenciaReturnGeneral=new ReferenciaParameterReturnGeneral(); 
		
			ReferenciaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Referencia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.referencia=new Referencia();
			this.referencias = new ArrayList<Referencia>();
			this.referenciasAux = new ArrayList<Referencia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic=new ReferenciaLogic();
				this.referenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.referenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.referenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormReferencia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoReferencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReferencia);	
					}
					
					if(this.jInternalFrameImportacionReferencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReferencia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByReferencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByReferencia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormReferencia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormReferencia);
				this.jInternalFrameDetalleFormReferencia.setVisible(false);
				this.jInternalFrameDetalleFormReferencia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoReferencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReferencia);
					this.jInternalFrameReporteDinamicoReferencia.setVisible(false);
					this.jInternalFrameReporteDinamicoReferencia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionReferencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionReferencia);
					this.jInternalFrameImportacionReferencia.setVisible(false);
					this.jInternalFrameImportacionReferencia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByReferencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByReferencia);
					this.jInternalFrameOrderByReferencia.setVisible(false);
					this.jInternalFrameOrderByReferencia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idReferenciaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ReferenciaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.referenciaReturnGeneral=new ReferenciaParameterReturnGeneral();
			
			this.referenciaParameterGeneral=new ReferenciaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.referenciaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ReferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.referenciaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TelefonoReferenciaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReferenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.referenciaSessionBean.getEsGuardarRelacionado(),this.referenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReferenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.referenciaSessionBean.getEsGuardarRelacionado(),this.referenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoReferencia=false;
			this.isVisibilidadCeldaDuplicarReferencia=true;
			this.isVisibilidadCeldaCopiarReferencia=true;
			this.isVisibilidadCeldaVerFormReferencia=true;
			this.isVisibilidadCeldaOrdenReferencia=true;
			this.isVisibilidadCeldaNuevoRelacionesReferencia=false;
			this.isVisibilidadCeldaModificarReferencia=false;
			this.isVisibilidadCeldaActualizarReferencia=false;
			this.isVisibilidadCeldaEliminarReferencia=false;
			this.isVisibilidadCeldaCancelarReferencia=false;
			this.isVisibilidadCeldaGuardarReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosReferencia=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdParentezco=true;
			this.isVisibilidadFK_IdProfesion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosReferencia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioReferencia(false);
			
			this.setPermisosUsuarioReferencia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciaSessionBean.getEsGuardarRelacionado() 
				|| (this.referenciaSessionBean.getEsGuardarRelacionado() && this.referenciaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioReferenciaClasesRelacionadas();
			}
			
			if(this.referenciaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioReferenciaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosReferencia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualReferencia();
			}
			
			if(!this.isPermisoBusquedaReferencia) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasReferencia.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioReferencia,this.isPermisoPaginacionMedioReferencia,this.isPermisoPaginacionTodoReferencia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ReferenciaConstantesFunciones.getTiposSeleccionarReferencia());
				
				this.tiposColumnasSelect=ReferenciaConstantesFunciones.getTiposSeleccionarReferencia(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectReferencia();				
				//this.tiposRelacionesSelect=ReferenciaConstantesFunciones.getTiposRelacionesReferencia(true);
				
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
			//if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioReferencia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioReferencia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioReferencia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesReferencia() ;
			
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
			
			
			this.telefonoreferenciaLogic=new TelefonoReferenciaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.parentezcoLogic=new ParentezcoLogic();
			this.profesionLogic=new ProfesionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				referenciaImplementable= (ReferenciaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReferenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				referenciaImplementableHome= (ReferenciaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReferenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.referencias= new ArrayList<Referencia>();
			this.referenciasEliminados= new ArrayList<Referencia>();
						
			this.isEsNuevoReferencia=false;
			this.esParaAccionDesdeFormularioReferencia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.parentezcosForeignKey=new ArrayList<Parentezco>() ;
			this.profesionsForeignKey=new ArrayList<Profesion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyReferencia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroReferencia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ReferenciaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ReferenciaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesReferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingReferencia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormReferencia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioReferencia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioReferencia();
			}
			
			ReferenciaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasReferencia.getTabCount(); i++) {
					this.jTabbedPaneBusquedasReferencia.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasReferencia.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessReferencia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Referencia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectReferencia() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesReferencia")) {
				iIndex=this.jInternalFrameDetalleFormReferencia.jTabbedPaneRelacionesReferencia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormReferencia.jTabbedPaneRelacionesReferencia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosReferencia.getSelectedRow();	
				
				

				if(sTitle.equals("Telefono Referencias")) {
					if(!TelefonoReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessReferencia();

						this.cargarParteTabPanelRelacionadaTelefonoReferencia(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessReferencia();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaTelefonoReferencia(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormReferencia.cargarSessionConBeanSwingJInternalFrameTelefonoReferencia(false,true,iIndex);
		this.jButtonTelefonoReferenciaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTelefonoReferencia();

		//this.jTabbedPaneRelacionesReferencia.updateUI();
		//this.jTabbedPaneRelacionesReferencia.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesReferencia.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("TelefonoReferencia")) {
				int row=this.jTableDatosReferencia.getSelectedRow();
				jButtonTelefonoReferenciaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Telefono Referencia")) {

					if(this.isTienePermisosTelefonoReferencia && this.referenciaConstantesFunciones.mostrarTelefonoReferenciaReferencia && !ReferenciaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Telefono Referencias"+"("+TelefonoReferenciaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Telefono Referencias");

						if(referenciaConstantesFunciones.resaltarTelefonoReferenciaReferencia!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(referenciaConstantesFunciones.resaltarTelefonoReferenciaReferencia);
						}

						jmenuItem.setEnabled(this.referenciaConstantesFunciones.activarTelefonoReferenciaReferencia);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TelefonoReferencia"));

						

						this.jInternalFrameDetalleFormReferencia.jmenuDetalleReferencia.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyReferencia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyReferencia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyReferencia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyReferenciaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyReferencia();
		
		this.cargarCombosFrameForeignKeyReferencia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyReferencia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyReferencia();
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

	public void cargarCombosForeignKeyParentezco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyParentezcoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyParentezco();
				this.cargarCombosFrameParentezcosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaParentezco(this.parentezcosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProfesion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProfesionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProfesion();
				this.cargarCombosFrameProfesionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProfesion(this.profesionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoReferenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.referenciaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
			
			if(jTableDatosReferencia.getRowCount()>=1) {
				jTableDatosReferencia.removeRowSelectionInterval(0, jTableDatosReferencia.getRowCount()-1);						
			}
			
			this.isEsNuevoReferencia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoReferencia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesReferencia(true);			
			//this.referencia=new Referencia();
			//this.referencia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferencia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferencia() ;
			
			if(ReferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferencia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.referencia);	
			this.actualizarInformacion("INFO_PADRE",false,this.referencia);				
			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
			if(this.referenciaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Referencia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarReferenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosReferencia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosReferencia.getSelectedRows().length;			
			}
			
			referenciasSeleccionados=this.getReferenciasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoReferencia--;			
				//Referencia referenciaAux= new Referencia();			
				//referenciaAux.setId(this.iIdNuevoReferencia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Referencia referenciaOrigen=new Referencia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Referencia referenciaOrigen : referenciasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							referenciaOrigen =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciaOrigen =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaReferencia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.referencia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosReferencia(referenciaOrigen,this.referencia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.referenciaLogic.getReferencias().add(this.referenciaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.referencias.add(this.referenciaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaReferencia(false);
				
				this.jTableDatosReferencia.setRowSelectionInterval(this.getIndiceNuevoReferencia(), this.getIndiceNuevoReferencia());
				
				int iLastRow =  this.jTableDatosReferencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReferencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReferencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReferencia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();									
		
			Referencia referenciaOrigen=new Referencia();
			Referencia referenciaDestino=new Referencia();
				
			referenciasSeleccionados=this.getReferenciasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosReferencia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || referenciasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosReferencia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciaOrigen =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						referenciaOrigen =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciaDestino =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						referenciaDestino =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				referenciaOrigen =referenciasSeleccionados.get(0);
				referenciaDestino =referenciasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosReferencia(referenciaOrigen,referenciaDestino,true,false);
				
				referenciaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(referenciaDestino,referenciaLogic.getReferencias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciaDestino,referencias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaReferencia(false);
				
				//this.jTableDatosReferencia.setRowSelectionInterval(this.getIndiceNuevoReferencia(), this.getIndiceNuevoReferencia());
				
				int iLastRow =  this.jTableDatosReferencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReferencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReferencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReferencia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormReferencia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesReferencia.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasReferencia.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesReferencia.setVisible(!isVisible);
			this.jPanelPaginacionReferencia.setVisible(!isVisible);
			this.jPanelAccionesReferencia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameReferencia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoReferencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionReferencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByReferencia();
			
			this.abrirFrameOrderByReferencia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByReferencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleReferencia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormReferencia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormReferencia.isMaximum()) {
					this.jInternalFrameDetalleFormReferencia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormReferencia.setSize(this.jInternalFrameDetalleFormReferencia.iWidthFormulario,this.jInternalFrameDetalleFormReferencia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormReferencia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormReferencia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormReferencia.isMaximum()) {
						this.jInternalFrameDetalleFormReferencia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormReferencia.jContentPaneDetalleReferencia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormReferencia.jTabbedPaneRelacionesReferencia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormReferencia.jContentPaneDetalleReferencia.getWidth(),ReferenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReferencia.jTabbedPaneRelacionesReferencia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormReferencia.jContentPaneDetalleReferencia.getWidth(),ReferenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReferencia.jTabbedPaneRelacionesReferencia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormReferencia.jContentPaneDetalleReferencia.getWidth(),ReferenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(TelefonoReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTelefonoReferencia();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormReferencia.setVisible(true);
	        this.jInternalFrameDetalleFormReferencia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByReferencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByReferencia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByReferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferencia,false,this);
				} else {
					this.jInternalFrameOrderByReferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferencia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByReferencia);
				this.jInternalFrameOrderByReferencia.setVisible(false);
				this.jInternalFrameOrderByReferencia.setSelected(false);
				
				this.jInternalFrameOrderByReferencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReferencia"));
				
				this.inicializarActualizarBindingTablaOrderByReferencia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionReferencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionReferencia==null) {
				
				this.jInternalFrameImportacionReferencia=new ImportacionJInternalFrame(ReferenciaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReferencia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionReferencia);
				this.jInternalFrameImportacionReferencia.setVisible(false);
				this.jInternalFrameImportacionReferencia.setSelected(false);


				this.jInternalFrameImportacionReferencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReferencia"));
				this.jInternalFrameImportacionReferencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReferencia"));
				this.jInternalFrameImportacionReferencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReferencia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoReferencia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoReferencia==null) {
				this.jInternalFrameReporteDinamicoReferencia=new ReporteDinamicoJInternalFrame(ReferenciaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReferencia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReferencia);
				this.jInternalFrameReporteDinamicoReferencia.setVisible(false);
				this.jInternalFrameReporteDinamicoReferencia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoReferencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferencia"));
				this.jInternalFrameReporteDinamicoReferencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferencia"));
				this.jInternalFrameReporteDinamicoReferencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferencia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferencia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaTelefonoReferencia() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.jScrollPanelDatosTelefonoReferencia.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormReferencia.jContentPaneDetalleReferencia.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.jScrollPanelDatosTelefonoReferencia.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.jScrollPanelDatosTelefonoReferencia.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.jScrollPanelDatosTelefonoReferencia.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleReferencia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormReferencia);
			
	       	this.jInternalFrameDetalleFormReferencia.setVisible(false);
	        this.jInternalFrameDetalleFormReferencia.setSelected(false);
			
			//this.jInternalFrameDetalleFormReferencia.dispose();
			//this.jInternalFrameDetalleFormReferencia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoReferencia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoReferencia.setVisible(true);
	        this.jInternalFrameReporteDinamicoReferencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionReferencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionReferencia.setVisible(true);
	        this.jInternalFrameImportacionReferencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByReferencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByReferencia.setVisible(true);
	        this.jInternalFrameOrderByReferencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByReferencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByReferencia.setVisible(false);
	        this.jInternalFrameOrderByReferencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoReferencia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoReferencia.setVisible(false);
	        this.jInternalFrameReporteDinamicoReferencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionReferencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionReferencia.setVisible(false);
	        this.jInternalFrameImportacionReferencia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarReferencia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarReferencia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesReferencia(true);
			//this.isEsNuevoReferencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesReferencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferencia(false) ;
			
			if(referenciaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaSessionBean.getEsGuardarRelacionado() && TelefonoReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTelefonoReferenciaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ReferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferencia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaReferenciaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarReferencia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesReferencia(true);
			//this.isEsNuevoReferencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.referencia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesReferencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesReferencia(false) ;
			
			if(ReferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferencia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.referenciaConstantesFunciones.cargarid_empleadoReferencia) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingReferencia(false,false);
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
		TableColumn tableColumnEmpleado=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferencia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaParentezco(List<Parentezco> parentezcosForeignKey)throws Exception{
		TableColumn tableColumnParentezco=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO));
		TableCellEditor tableCellEditorParentezco =tableColumnParentezco.getCellEditor();

		ParentezcoTableCell parentezcoTableCellFk=(ParentezcoTableCell)tableCellEditorParentezco;

		if(parentezcoTableCellFk!=null) {
			parentezcoTableCellFk.setparentezcosForeignKey(parentezcosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferencia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//parentezcoTableCellFk.setRowActual(intSelectedRow);
			//parentezcoTableCellFk.setparentezcosForeignKeyActual(parentezcosForeignKey);
		//}


		if(parentezcoTableCellFk!=null) {
			parentezcoTableCellFk.RecargarParentezcosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProfesion(List<Profesion> profesionsForeignKey)throws Exception{
		TableColumn tableColumnProfesion=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_IDPROFESION));
		TableCellEditor tableCellEditorProfesion =tableColumnProfesion.getCellEditor();

		ProfesionTableCell profesionTableCellFk=(ProfesionTableCell)tableCellEditorProfesion;

		if(profesionTableCellFk!=null) {
			profesionTableCellFk.setprofesionsForeignKey(profesionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferencia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//profesionTableCellFk.setRowActual(intSelectedRow);
			//profesionTableCellFk.setprofesionsForeignKeyActual(profesionsForeignKey);
		//}


		if(profesionTableCellFk!=null) {
			profesionTableCellFk.RecargarProfesionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesReferencia(false);
			
			//if(!this.isEsNuevoReferencia) {								
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				
			}
			
			if(this.permiteMantenimiento(this.referencia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.referenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoReferencia=true;
					this.inicializarActualizarBindingTablaReferencia(false);
					this.isEsNuevoReferencia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoReferencia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoReferencia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReferencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferencia(false);
				
				this.habilitarDeshabilitarControlesReferencia(false);
			
												
				
				if(ReferenciaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleReferencia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoReferenciaActionPerformed(evt,referenciaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualReferencia(this.referencia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosReferencia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,referenciaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.referencia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Referencia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Referencia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarReferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				this.referencia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				this.referencia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.referencia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.referenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ReferenciaModel) this.jTableDatosReferencia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoReferencia=true;
				this.inicializarActualizarBindingTablaReferencia(false);
				this.isEsNuevoReferencia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReferencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferencia(false);
				
				this.habilitarDeshabilitarControlesReferencia(false);
				
				
				
				if(ReferenciaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleReferencia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarReferenciaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosReferencia.getRowCount()>=1) {
				jTableDatosReferencia.removeRowSelectionInterval(0, jTableDatosReferencia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesReferencia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaReferencia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferencia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferencia(false) ;
			
			this.isEsNuevoReferencia=false;
			
			if(ReferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleReferencia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingReferencia(false);
				
				//SI ES MANUAL
				if(ReferenciaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualReferencia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoReferencia--;			
			//Referencia referenciaAux= new Referencia();			
			//referenciaAux.setId(this.iIdNuevoReferencia);
			
			if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaReferencia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
			
			this.referencia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.referenciaLogic.getReferencias().add(this.referenciaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.referencias.add(this.referenciaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaReferencia(false);
			
			this.jTableDatosReferencia.setRowSelectionInterval(this.getIndiceNuevoReferencia(), this.getIndiceNuevoReferencia());
			
			int iLastRow =  this.jTableDatosReferencia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosReferencia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosReferencia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaReferencia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingReferencia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferencia(false);
			
			//SI ES MANUAL
			if(ReferenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferencia();
			}
			
			//this.abrirFrameTreeReferencia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionReferenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ReferenciaS ?", "MANTENIMIENTO DE Referencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionReferencia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralReferencia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.referenciaReturnGeneral=referenciaLogic.procesarImportacionReferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.referenciaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarReferenciaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionReferenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionReferencia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionReferencia.setFileImportacion(this.jInternalFrameImportacionReferencia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionReferencia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionReferencia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionReferencia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionReferencia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();		

		referenciasSeleccionados=this.getReferenciasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ReferenciaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ReferenciaBaseDesign.jrxml";
			
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
			
			this.generarReporteReferencias("Todos",referenciasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoReferencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReferenciaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Parentezco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Parentezco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Parentezco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Parentezco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaConstantesFunciones.LABEL_IDPROFESION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Profesion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Profesion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Profesion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Profesion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaConstantesFunciones.LABEL_CEDULA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_dula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_dula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_dula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_dula_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoReferencia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoReferencia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoReferencia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ReferenciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ReferenciaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO:
					sNombreCampoCategoria="id_parentezco";
					break;

				case ReferenciaConstantesFunciones.LABEL_IDPROFESION:
					sNombreCampoCategoria="id_profesion";
					break;

				case ReferenciaConstantesFunciones.LABEL_CEDULA:
					sNombreCampoCategoria="cedula";
					break;

				case ReferenciaConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case ReferenciaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ReferenciaConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case ReferenciaConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoReferencia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ReferenciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ReferenciaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO:
					sNombreCampoCategoriaValor="id_parentezco";
					break;

				case ReferenciaConstantesFunciones.LABEL_IDPROFESION:
					sNombreCampoCategoriaValor="id_profesion";
					break;

				case ReferenciaConstantesFunciones.LABEL_CEDULA:
					sNombreCampoCategoriaValor="cedula";
					break;

				case ReferenciaConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case ReferenciaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ReferenciaConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case ReferenciaConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoReferencia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferencia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReferenciaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ReferenciaConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Parentezco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_parentezco");
					break;

				case ReferenciaConstantesFunciones.LABEL_IDPROFESION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Profesion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_profesion");
					break;

				case ReferenciaConstantesFunciones.LABEL_CEDULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cedula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cedula");
					break;

				case ReferenciaConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case ReferenciaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ReferenciaConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case ReferenciaConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
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
	
	public void jButtonGenerarExcelReporteDinamicoReferenciaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();		
		
		referenciasSeleccionados=this.getReferenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referencia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Referencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoReferencia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoReferencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ReferenciaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Referencia referencia:referenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referencia.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(Referencia referencia:referenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referencia.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO);
					iRow++;

					for(Referencia referencia:referenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referencia.getparentezco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaConstantesFunciones.LABEL_IDPROFESION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDPROFESION);
					iRow++;

					for(Referencia referencia:referenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referencia.getprofesion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaConstantesFunciones.LABEL_CEDULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaConstantesFunciones.LABEL_CEDULA);
					iRow++;

					for(Referencia referencia:referenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referencia.getcedula());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(Referencia referencia:referenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referencia.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Referencia referencia:referenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referencia.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Referencia referencia:referenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referencia.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(Referencia referencia:referenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referencia.gettelefono());
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
			//	this.getFilaCabeceraExportarExcelReferencia(row);				
			//	iRow++;
			//}				
			
			//for(Referencia referenciaAux:referenciasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelReferencia(referenciaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia",JOptionPane.INFORMATION_MESSAGE);
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
				this.referenciaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferencia(false);
			
			//SI ES MANUAL
			if(ReferenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferencia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferencia(false);
			
			//SI ES MANUAL
			if(ReferenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReferencia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesReferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferencia(false);
			
			//SI ES MANUAL
			if(ReferenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReferencia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaReferencia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosReferencia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosReferencia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosReferencia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosReferencia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosReferencia.setMinimumSize(dimensionMinimum);
		this.jTableDatosReferencia.setMaximumSize(dimensionMaximum);
		this.jTableDatosReferencia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingReferencia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingReferencia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingReferencia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaReferencia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesReferencia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasReferencia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReferencia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesReferencia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ReferenciaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualReferencia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaReferencia();
		
		this.inicializarActualizarBindingBotonesManualReferencia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualReferencia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReferencia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualReferencia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualReferencia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosReferencia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosReferencia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteReferencia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormReferencia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormReferencia.jCheckBoxPostAccionNuevoReferencia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormReferencia.jCheckBoxPostAccionSinCerrarReferencia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormReferencia.jCheckBoxPostAccionSinMensajeReferencia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosReferencia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosReferencia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteReferencia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormReferencia!=null) {
				this.jInternalFrameDetalleFormReferencia.jCheckBoxPostAccionNuevoReferencia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormReferencia.jCheckBoxPostAccionSinCerrarReferencia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormReferencia.jCheckBoxPostAccionSinMensajeReferencia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionReferencia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionReferencia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormReferencia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesReferencia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoReferencia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesReferencia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesReferencia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarReferencia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesReferencia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoReferencia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesReferencia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralReferencia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesReferencia(Boolean esInicializar) throws Exception {
		try	{	
			if(ReferenciaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualReferencia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesReferencia() throws Exception {
		try	{
			if(ReferenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualReferencia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReferencia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualReferencia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesReferencia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesReferencia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesReferencia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionReferencia.addItem(reporte);
			}
			
			
			if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionReferencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionReferencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesReferencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesReferencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarReferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarReferencia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarReferencia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferencia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferencia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReferencia!=null) {
				this.jInternalFrameReporteDinamicoReferencia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoReferencia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReferencia!=null) {
				this.jInternalFrameReporteDinamicoReferencia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoReferencia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoReferencia!=null) {
				
				if(this.jInternalFrameReporteDinamicoReferencia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReferencia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReferencia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoReferencia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReferencia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReferencia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualReferencia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoReferencia.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoReferencia.getSelectedItem()).getId();}
		if(this.jComboBoxid_parentezcoFK_IdParentezcoReferencia.getSelectedItem()!=null){this.id_parentezcoFK_IdParentezco=((Parentezco)this.jComboBoxid_parentezcoFK_IdParentezcoReferencia.getSelectedItem()).getId();}
		if(this.jComboBoxid_profesionFK_IdProfesionReferencia.getSelectedItem()!=null){this.id_profesionFK_IdProfesion=((Profesion)this.jComboBoxid_profesionFK_IdProfesionReferencia.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasReferencia(Boolean esInicializar) throws Exception {				
		if(ReferenciaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualReferencia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaReferencia() throws Exception {
		this.inicializarActualizarBindingTablaReferencia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByReferencia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosReferenciaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaReferencia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=referenciaLogic.getReferencias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=referencias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosReferencia.setModel(new ReferenciaModel(this.referenciaLogic.getReferencias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosReferencia.setModel(new ReferenciaModel(this.referencias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByReferencia!=null && this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByReferencia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ReferenciaConstantesFunciones.SCLASSWEBTITULO,referenciaConstantesFunciones.resaltarSeleccionarReferencia,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ReferenciaConstantesFunciones.SCLASSWEBTITULO,referenciaConstantesFunciones.resaltarSeleccionarReferencia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_ID));

		if(this.referenciaConstantesFunciones.mostraridReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.referenciaConstantesFunciones.resaltaridReferencia,this.referenciaConstantesFunciones.activaridReferencia,this,true,"idReferencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciaConstantesFunciones.resaltaridReferencia,this.referenciaConstantesFunciones.activaridReferencia,this,true,"idReferencia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.referenciaConstantesFunciones.mostrarid_empresaReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.referenciaConstantesFunciones.resaltarid_empresaReferencia,this,this.referenciaConstantesFunciones.activarid_empresaReferencia));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.referenciaConstantesFunciones.resaltarid_empresaReferencia,this,this.referenciaConstantesFunciones.activarid_empresaReferencia,false,"id_empresaReferencia","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.referenciaConstantesFunciones.mostrarid_empleadoReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.referenciaConstantesFunciones.resaltarid_empleadoReferencia,this,this.referenciaConstantesFunciones.activarid_empleadoReferencia));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.referenciaConstantesFunciones.resaltarid_empleadoReferencia,this,this.referenciaConstantesFunciones.activarid_empleadoReferencia,true,"id_empleadoReferencia","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO));

		if(this.referenciaConstantesFunciones.mostrarid_parentezcoReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ParentezcoTableCell(this.parentezcosForeignKey,this.referenciaConstantesFunciones.resaltarid_parentezcoReferencia,this,this.referenciaConstantesFunciones.activarid_parentezcoReferencia));
			tableColumn.setCellEditor(new ParentezcoTableCell(this.parentezcosForeignKey,this.referenciaConstantesFunciones.resaltarid_parentezcoReferencia,this,this.referenciaConstantesFunciones.activarid_parentezcoReferencia,true,"id_parentezcoReferencia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_IDPROFESION));

		if(this.referenciaConstantesFunciones.mostrarid_profesionReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaConstantesFunciones.LABEL_IDPROFESION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProfesionTableCell(this.profesionsForeignKey,this.referenciaConstantesFunciones.resaltarid_profesionReferencia,this,this.referenciaConstantesFunciones.activarid_profesionReferencia));
			tableColumn.setCellEditor(new ProfesionTableCell(this.profesionsForeignKey,this.referenciaConstantesFunciones.resaltarid_profesionReferencia,this,this.referenciaConstantesFunciones.activarid_profesionReferencia,true,"id_profesionReferencia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_CEDULA));

		if(this.referenciaConstantesFunciones.mostrarcedulaReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaConstantesFunciones.LABEL_CEDULA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciaConstantesFunciones.resaltarcedulaReferencia,this.referenciaConstantesFunciones.activarcedulaReferencia,this,true,"cedulaReferencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciaConstantesFunciones.resaltarcedulaReferencia,this.referenciaConstantesFunciones.activarcedulaReferencia,this,true,"cedulaReferencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_APELLIDO));

		if(this.referenciaConstantesFunciones.mostrarapellidoReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciaConstantesFunciones.resaltarapellidoReferencia,this.referenciaConstantesFunciones.activarapellidoReferencia,this,true,"apellidoReferencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciaConstantesFunciones.resaltarapellidoReferencia,this.referenciaConstantesFunciones.activarapellidoReferencia,this,true,"apellidoReferencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_NOMBRE));

		if(this.referenciaConstantesFunciones.mostrarnombreReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciaConstantesFunciones.resaltarnombreReferencia,this.referenciaConstantesFunciones.activarnombreReferencia,this,true,"nombreReferencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciaConstantesFunciones.resaltarnombreReferencia,this.referenciaConstantesFunciones.activarnombreReferencia,this,true,"nombreReferencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_DIRECCION));

		if(this.referenciaConstantesFunciones.mostrardireccionReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciaConstantesFunciones.resaltardireccionReferencia,this.referenciaConstantesFunciones.activardireccionReferencia,this,true,"direccionReferencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciaConstantesFunciones.resaltardireccionReferencia,this.referenciaConstantesFunciones.activardireccionReferencia,this,true,"direccionReferencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferencia,ReferenciaConstantesFunciones.LABEL_TELEFONO));

		if(this.referenciaConstantesFunciones.mostrartelefonoReferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciaConstantesFunciones.resaltartelefonoReferencia,this.referenciaConstantesFunciones.activartelefonoReferencia,this,true,"telefonoReferencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciaConstantesFunciones.resaltartelefonoReferencia,this.referenciaConstantesFunciones.activartelefonoReferencia,this,true,"telefonoReferencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTelefonoReferencia && this.referenciaConstantesFunciones.mostrarTelefonoReferenciaReferencia && !ReferenciaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Telefono Referencias");
				tableColumn.setHeaderValue("Telefono Referencias");
				tableColumn.setCellRenderer(new TelefonoReferenciaTableCell(referenciaConstantesFunciones.resaltarTelefonoReferenciaReferencia,this,this.referenciaConstantesFunciones.activarTelefonoReferenciaReferencia));
				tableColumn.setCellEditor(new TelefonoReferenciaTableCell(referenciaConstantesFunciones.resaltarTelefonoReferenciaReferencia,this,this.referenciaConstantesFunciones.activarTelefonoReferenciaReferencia));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosReferencia.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.referenciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.referenciaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReferencia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.referenciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.referenciaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReferencia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarReferencia && this.isPermisoGuardarCambiosReferencia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.referenciaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.referenciaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosReferencia.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.referenciaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosReferencia.addColumn(tableColumn);
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
			
			this.jTableDatosReferencia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReferencia && this.isPermisoGuardarCambiosReferencia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.referenciaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReferencia && this.isPermisoGuardarCambiosReferencia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosReferencia.moveColumn(this.jTableDatosReferencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosReferencia.moveColumn(this.jTableDatosReferencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.referenciaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosReferencia.moveColumn(this.jTableDatosReferencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosReferencia.moveColumn(this.jTableDatosReferencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosReferencia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosReferencia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosReferencia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosReferencia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosReferencia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosReferencia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosReferencia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosReferencia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=referenciaLogic.getReferencias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=referencias.size()-1;
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
		//this.jTableDatosReferencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosReferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosReferencia();
			
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
				
				//this.isEsNuevoReferencia=false;
					
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
				if(this.referenciaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormReferencia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReferencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReferencia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.referencia.getsType().equals("DUPLICADO")
				   || this.referencia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoReferencia=true;
				
				} else {
					this.isEsNuevoReferencia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
					if(this.referencia.getId()>=0 && !this.referencia.getIsNew()) {						
						this.isEsNuevoReferencia=false;
						
					} else {
						this.isEsNuevoReferencia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoReferencia(esRelaciones);						
				
				this.seleccionarReferencia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.referencia.getId()<0) {
					this.isEsNuevoReferencia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarReferencia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarReferencia(evt,rowIndex);
				}	
				
				if(this.referenciaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Referencia: " + this.dDif); 
					}
				}								
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarReferencia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.referencia)) {
					if(this.referencia.getId()>0) {
						this.referencia.setIsDeleted(true);
						
						this.referenciasEliminados.add(this.referencia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.referenciaLogic.getReferencias().remove(this.referencia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.referencias.remove(this.referencia);				
					}
					
					
					((ReferenciaModel) this.jTableDatosReferencia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaReferencia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarReferencia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoReferencia) {
			
			if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReferencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReferencia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioReferencia(this.referencia);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.referenciaConstantesFunciones.cargarid_empresaReferencia || this.referenciaConstantesFunciones.event_dependid_empresaReferencia) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.referencia.getid_empresa());
									//this.inicializarActualizarBindingReferencia(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(referencia.getEmpresa()!=null) {
							this.empresasForeignKey.add(referencia.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.referencia.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.referenciaConstantesFunciones.cargarid_empleadoReferencia || this.referenciaConstantesFunciones.event_dependid_empleadoReferencia) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.referencia.getid_empleado());
									//this.inicializarActualizarBindingReferencia(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(referencia.getEmpleado()!=null) {
							this.empleadosForeignKey.add(referencia.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.referencia.getid_empleado(),false,"Formulario");

					//Parentezco
					if(!this.referenciaConstantesFunciones.cargarid_parentezcoReferencia || this.referenciaConstantesFunciones.event_dependid_parentezcoReferencia) {
						//this.cargarCombosParentezcosForeignKeyLista(" where id="+this.referencia.getid_parentezco());
									//this.inicializarActualizarBindingReferencia(false,false);
						this.parentezcosForeignKey=new ArrayList<Parentezco>();

						if(referencia.getParentezco()!=null) {
							this.parentezcosForeignKey.add(referencia.getParentezco());
						}

						this.addItemDefectoCombosForeignKeyParentezco();
						this.cargarCombosFrameParentezcosForeignKey("Todos");
					}
					this.setActualParentezcoForeignKey(this.referencia.getid_parentezco(),false,"Formulario");

					//Profesion
					if(!this.referenciaConstantesFunciones.cargarid_profesionReferencia || this.referenciaConstantesFunciones.event_dependid_profesionReferencia) {
						//this.cargarCombosProfesionsForeignKeyLista(" where id="+this.referencia.getid_profesion());
									//this.inicializarActualizarBindingReferencia(false,false);
						this.profesionsForeignKey=new ArrayList<Profesion>();

						if(referencia.getProfesion()!=null) {
							this.profesionsForeignKey.add(referencia.getProfesion());
						}

						this.addItemDefectoCombosForeignKeyProfesion();
						this.cargarCombosFrameProfesionsForeignKey("Todos");
					}
					this.setActualProfesionForeignKey(this.referencia.getid_profesion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesReferencia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesReferencia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferencia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoReferencia(Referencia referencia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoReferencia(referencia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoReferencia(Referencia referencia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioReferencia(referencia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyReferencia(referencia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyReferencia(referencia);
	}
	
	public void setVariablesObjetoActualToFormularioReferencia(Referencia referencia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormReferencia.jLabelidReferencia.setText(referencia.getId().toString());
			this.jInternalFrameDetalleFormReferencia.jTextFieldcedulaReferencia.setText(referencia.getcedula());
			this.jInternalFrameDetalleFormReferencia.jTextFieldapellidoReferencia.setText(referencia.getapellido());
			this.jInternalFrameDetalleFormReferencia.jTextFieldnombreReferencia.setText(referencia.getnombre());
			this.jInternalFrameDetalleFormReferencia.jTextAreadireccionReferencia.setText(referencia.getdireccion());
			this.jInternalFrameDetalleFormReferencia.jTextFieldtelefonoReferencia.setText(referencia.gettelefono());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Referencia referenciaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,referenciaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Referencia referenciaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				referenciaLocal=this.referencia;
			} else {
				referenciaLocal=this.referenciaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(referenciaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoReferencia(referenciaLocal,true);
					
					if(referenciaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(referenciaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.referenciaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(referenciaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoReferencia(Referencia referencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReferencia(referencia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysReferencia(referencia);
	}
	
	public void setVariablesFormularioToObjetoActualReferencia(Referencia referencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReferencia(referencia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualReferencia(Referencia referencia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormReferencia.jLabelidReferencia.getText()==null || this.jInternalFrameDetalleFormReferencia.jLabelidReferencia.getText()=="" || this.jInternalFrameDetalleFormReferencia.jLabelidReferencia.getText()=="Id") {
				this.jInternalFrameDetalleFormReferencia.jLabelidReferencia.setText("0");
			}

			if(conColumnasBase) {referencia.setId(Long.parseLong(this.jInternalFrameDetalleFormReferencia.jLabelidReferencia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabelIdReferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referencia.setcedula(this.jInternalFrameDetalleFormReferencia.jTextFieldcedulaReferencia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaConstantesFunciones.LABEL_CEDULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabelcedulaReferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referencia.setapellido(this.jInternalFrameDetalleFormReferencia.jTextFieldapellidoReferencia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabelapellidoReferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referencia.setnombre(this.jInternalFrameDetalleFormReferencia.jTextFieldnombreReferencia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabelnombreReferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referencia.setdireccion(this.jInternalFrameDetalleFormReferencia.jTextAreadireccionReferencia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabeldireccionReferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referencia.settelefono(this.jInternalFrameDetalleFormReferencia.jTextFieldtelefonoReferencia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferencia.jLabeltelefonoReferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReferencia(Referencia referenciaBean,Referencia referencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && referenciaBean.getid_empleado()!=null && !referenciaBean.getid_empleado().equals(-1L))) {referencia.setid_empleado(referenciaBean.getid_empleado());}
			if(conDefault || (!conDefault && referenciaBean.getid_parentezco()!=null && !referenciaBean.getid_parentezco().equals(-1L))) {referencia.setid_parentezco(referenciaBean.getid_parentezco());}
			if(conDefault || (!conDefault && referenciaBean.getid_profesion()!=null && !referenciaBean.getid_profesion().equals(-1L))) {referencia.setid_profesion(referenciaBean.getid_profesion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosReferencia(Referencia referenciaOrigen,Referencia referencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && referenciaOrigen.getId()!=null && !referenciaOrigen.getId().equals(0L))) {referencia.setId(referenciaOrigen.getId());}}
			if(conDefault || (!conDefault && referenciaOrigen.getid_empleado()!=null && !referenciaOrigen.getid_empleado().equals(-1L))) {referencia.setid_empleado(referenciaOrigen.getid_empleado());}
			if(conDefault || (!conDefault && referenciaOrigen.getid_parentezco()!=null && !referenciaOrigen.getid_parentezco().equals(-1L))) {referencia.setid_parentezco(referenciaOrigen.getid_parentezco());}
			if(conDefault || (!conDefault && referenciaOrigen.getid_profesion()!=null && !referenciaOrigen.getid_profesion().equals(-1L))) {referencia.setid_profesion(referenciaOrigen.getid_profesion());}
			if(conDefault || (!conDefault && referenciaOrigen.getcedula()!=null && !referenciaOrigen.getcedula().equals(""))) {referencia.setcedula(referenciaOrigen.getcedula());}
			if(conDefault || (!conDefault && referenciaOrigen.getapellido()!=null && !referenciaOrigen.getapellido().equals(""))) {referencia.setapellido(referenciaOrigen.getapellido());}
			if(conDefault || (!conDefault && referenciaOrigen.getnombre()!=null && !referenciaOrigen.getnombre().equals(""))) {referencia.setnombre(referenciaOrigen.getnombre());}
			if(conDefault || (!conDefault && referenciaOrigen.getdireccion()!=null && !referenciaOrigen.getdireccion().equals(""))) {referencia.setdireccion(referenciaOrigen.getdireccion());}
			if(conDefault || (!conDefault && referenciaOrigen.gettelefono()!=null && !referenciaOrigen.gettelefono().equals(""))) {referencia.settelefono(referenciaOrigen.gettelefono());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReferencia(Referencia referencia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReferencia.jLabelidReferencia.setText(referencia.getId().toString());
			this.jInternalFrameDetalleFormReferencia.jTextFieldcedulaReferencia.setText(referencia.getcedula());
			this.jInternalFrameDetalleFormReferencia.jTextFieldapellidoReferencia.setText(referencia.getapellido());
			this.jInternalFrameDetalleFormReferencia.jTextFieldnombreReferencia.setText(referencia.getnombre());
			this.jInternalFrameDetalleFormReferencia.jTextAreadireccionReferencia.setText(referencia.getdireccion());
			this.jInternalFrameDetalleFormReferencia.jTextFieldtelefonoReferencia.setText(referencia.gettelefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReferencia(ReferenciaBean referenciaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReferencia.jLabelidReferencia.setText(referenciaBean.getId().toString());
			this.jInternalFrameDetalleFormReferencia.jTextFieldcedulaReferencia.setText(referenciaBean.getcedula());
			this.jInternalFrameDetalleFormReferencia.jTextFieldapellidoReferencia.setText(referenciaBean.getapellido());
			this.jInternalFrameDetalleFormReferencia.jTextFieldnombreReferencia.setText(referenciaBean.getnombre());
			this.jInternalFrameDetalleFormReferencia.jTextAreadireccionReferencia.setText(referenciaBean.getdireccion());
			this.jInternalFrameDetalleFormReferencia.jTextFieldtelefonoReferencia.setText(referenciaBean.gettelefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanReferencia(ReferenciaParameterReturnGeneral referenciaReturnGeneral,ReferenciaBean referenciaBean,Boolean conDefault) throws Exception { 
		try {
			Referencia referenciaLocal=new Referencia();
			
			referenciaLocal=referenciaReturnGeneral.getReferencia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && referenciaLocal.getId()!=null && !referenciaLocal.getId().equals(0L))) {referenciaBean.setId(referenciaLocal.getId());}}
			if(conDefault || (!conDefault && referenciaLocal.getid_empleado()!=null && !referenciaLocal.getid_empleado().equals(-1L))) {referenciaBean.setid_empleado(referenciaLocal.getid_empleado());}
			if(conDefault || (!conDefault && referenciaLocal.getid_parentezco()!=null && !referenciaLocal.getid_parentezco().equals(-1L))) {referenciaBean.setid_parentezco(referenciaLocal.getid_parentezco());}
			if(conDefault || (!conDefault && referenciaLocal.getid_profesion()!=null && !referenciaLocal.getid_profesion().equals(-1L))) {referenciaBean.setid_profesion(referenciaLocal.getid_profesion());}
			if(conDefault || (!conDefault && referenciaLocal.getcedula()!=null && !referenciaLocal.getcedula().equals(""))) {referenciaBean.setcedula(referenciaLocal.getcedula());}
			if(conDefault || (!conDefault && referenciaLocal.getapellido()!=null && !referenciaLocal.getapellido().equals(""))) {referenciaBean.setapellido(referenciaLocal.getapellido());}
			if(conDefault || (!conDefault && referenciaLocal.getnombre()!=null && !referenciaLocal.getnombre().equals(""))) {referenciaBean.setnombre(referenciaLocal.getnombre());}
			if(conDefault || (!conDefault && referenciaLocal.getdireccion()!=null && !referenciaLocal.getdireccion().equals(""))) {referenciaBean.setdireccion(referenciaLocal.getdireccion());}
			if(conDefault || (!conDefault && referenciaLocal.gettelefono()!=null && !referenciaLocal.gettelefono().equals(""))) {referenciaBean.settelefono(referenciaLocal.gettelefono());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxReferenciaGenerico(Long idReferenciaSeleccionado,JComboBox jComboBoxReferencia,List<Referencia> referenciasLocal)throws Exception {
		try {
			Referencia  referenciaTemp=null;

			for(Referencia referenciaAux:referenciasLocal) {
				if(referenciaAux.getId()!=null && referenciaAux.getId().equals(idReferenciaSeleccionado)) {
					referenciaTemp=referenciaAux;
					break;
				}
			}

			jComboBoxReferencia.setSelectedItem(referenciaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxReferenciaGenerico(JComboBox jComboBoxReferencia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReferencia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxReferencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReferencia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxReferencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("TelefonoReferencia")) {
			jButtonTelefonoReferenciaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referencia=(Referencia) referenciaLogic.getReferencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			referencia =(Referencia) referencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!referencia.getIsNew() && !referencia.getIsChanged() && !referencia.getIsDeleted()) {
				sDescripcion=referencia.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=referencia.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!referencia.getIsNew() && !referencia.getIsChanged() && !referencia.getIsDeleted()) {
				sDescripcion=referencia.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=referencia.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Parentezco")) {
			//sDescripcion=this.getActualParentezcoForeignKeyDescripcion((Long)value);
			if(!referencia.getIsNew() && !referencia.getIsChanged() && !referencia.getIsDeleted()) {
				sDescripcion=referencia.getparentezco_descripcion();
			} else {
				//sDescripcion=this.getActualParentezcoForeignKeyDescripcion((Long)value);
				sDescripcion=referencia.getparentezco_descripcion();
			}
		}

		if(sTipo.equals("Profesion")) {
			//sDescripcion=this.getActualProfesionForeignKeyDescripcion((Long)value);
			if(!referencia.getIsNew() && !referencia.getIsChanged() && !referencia.getIsDeleted()) {
				sDescripcion=referencia.getprofesion_descripcion();
			} else {
				//sDescripcion=this.getActualProfesionForeignKeyDescripcion((Long)value);
				sDescripcion=referencia.getprofesion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Referencia referenciaRow=new Referencia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referenciaRow=(Referencia) referenciaLogic.getReferencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			referenciaRow=(Referencia) referencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTelefonoReferenciaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Referencia referencia) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormReferencia==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referencia = (Referencia)this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.referencia = (Referencia)this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(referencia!=null) {
						this.referencia = referencia;
					} else {
						this.referencia = new Referencia();
					}
				}

				if(this.isTienePermisosTelefonoReferencia && this.permiteMantenimiento(this.referencia)) {
					TelefonoReferenciaBeanSwingJInternalFrame telefonoreferenciaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFramePopup=new TelefonoReferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						telefonoreferenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFramePopup;
					} else {
						telefonoreferenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame;
					}

					List<Referencia> referencias=new ArrayList<Referencia>();
					referencias.add(this.referencia);
					if(!esRelacionado) {
						//telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaSessionBean.setConGuardarRelaciones(false);
						//telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					telefonoreferenciaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormReferencia.cargarTelefonoReferenciaBeanSwingJInternalFrame(referencias,this.referencia,telefonoreferenciaBeanSwingJInternalFrame,/*conInicializar,*/telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaSessionBean.getConGuardarRelaciones(),telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaSessionBean.getEsGuardarRelacionado());
					telefonoreferenciaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						telefonoreferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsTelefonoReferencia("no_relacionado");

						telefonoreferenciaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TelefonoReferenciaConstantesFunciones.ITAMANIOFILATABLA + (TelefonoReferenciaConstantesFunciones.ITAMANIOFILATABLA/2));

						telefonoreferenciaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderReferencia=(TitledBorder)this.jScrollPanelDatosReferencia.getBorder();
						TitledBorder titledBorderTelefonoReferencia=(TitledBorder)telefonoreferenciaBeanSwingJInternalFrame.jScrollPanelDatosTelefonoReferencia.getBorder();

						titledBorderTelefonoReferencia.setTitle(titledBorderReferencia.getTitle() + " -> Telefono Referencia");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,telefonoreferenciaBeanSwingJInternalFrame);
						}

						telefonoreferenciaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(telefonoreferenciaBeanSwingJInternalFrame);

						telefonoreferenciaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.referenciaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Telefono Referencia",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualReferencia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoReferencia.setVisible((this.isVisibilidadCeldaNuevoReferencia && this.isPermisoNuevoReferencia));			
			this.jButtonDuplicarReferencia.setVisible((this.isVisibilidadCeldaDuplicarReferencia && this.isPermisoDuplicarReferencia));			
			this.jButtonCopiarReferencia.setVisible((this.isVisibilidadCeldaCopiarReferencia && this.isPermisoCopiarReferencia));
			this.jButtonVerFormReferencia.setVisible((this.isVisibilidadCeldaVerFormReferencia && this.isPermisoVerFormReferencia));
			
			this.jButtonAbrirOrderByReferencia.setVisible((this.isVisibilidadCeldaOrdenReferencia && this.isPermisoOrdenReferencia));			
			
			this.jButtonNuevoRelacionesReferencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferencia && this.isPermisoNuevoReferencia));			
			this.jButtonNuevoGuardarCambiosReferencia.setVisible((this.isVisibilidadCeldaNuevoReferencia && this.isPermisoNuevoReferencia && this.isPermisoGuardarCambiosReferencia));
			
			if(this.jInternalFrameDetalleFormReferencia!=null) {
			this.jInternalFrameDetalleFormReferencia.jButtonModificarReferencia.setVisible((this.isVisibilidadCeldaModificarReferencia && this.isPermisoActualizarReferencia));	
			this.jInternalFrameDetalleFormReferencia.jButtonActualizarReferencia.setVisible((this.isVisibilidadCeldaActualizarReferencia && this.isPermisoActualizarReferencia));	
			this.jInternalFrameDetalleFormReferencia.jButtonEliminarReferencia.setVisible((this.isVisibilidadCeldaEliminarReferencia && this.isPermisoEliminarReferencia));
			this.jInternalFrameDetalleFormReferencia.jButtonCancelarReferencia.setVisible(this.isVisibilidadCeldaCancelarReferencia);							
			this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosReferencia.setVisible((this.isVisibilidadCeldaGuardarReferencia && this.isPermisoGuardarCambiosReferencia));			
			
			}
						
			this.jButtonGuardarCambiosTablaReferencia.setVisible((this.isVisibilidadCeldaGuardarCambiosReferencia && this.isPermisoGuardarCambiosReferencia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarReferencia.setVisible((this.isVisibilidadCeldaNuevoReferencia && this.isPermisoNuevoReferencia));						
			this.jButtonDuplicarToolBarReferencia.setVisible((this.isVisibilidadCeldaDuplicarReferencia && this.isPermisoDuplicarReferencia));						
			this.jButtonCopiarToolBarReferencia.setVisible((this.isVisibilidadCeldaCopiarReferencia && this.isPermisoCopiarReferencia));			
			this.jButtonVerFormToolBarReferencia.setVisible((this.isVisibilidadCeldaVerFormReferencia && this.isPermisoVerFormReferencia));			
			this.jButtonAbrirOrderByToolBarReferencia.setVisible((this.isVisibilidadCeldaOrdenReferencia && this.isPermisoOrdenReferencia));
			this.jButtonNuevoRelacionesToolBarReferencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferencia && this.isPermisoNuevoReferencia));			
			this.jButtonNuevoGuardarCambiosToolBarReferencia.setVisible((this.isVisibilidadCeldaNuevoReferencia && this.isPermisoNuevoReferencia && this.isPermisoGuardarCambiosReferencia));			
			
			if(this.jInternalFrameDetalleFormReferencia!=null) {
			this.jInternalFrameDetalleFormReferencia.jButtonModificarToolBarReferencia.setVisible((this.isVisibilidadCeldaModificarReferencia && this.isPermisoActualizarReferencia));	
			this.jInternalFrameDetalleFormReferencia.jButtonActualizarToolBarReferencia.setVisible((this.isVisibilidadCeldaActualizarReferencia  && this.isPermisoActualizarReferencia));	
			this.jInternalFrameDetalleFormReferencia.jButtonEliminarToolBarReferencia.setVisible((this.isVisibilidadCeldaEliminarReferencia && this.isPermisoEliminarReferencia));
			this.jInternalFrameDetalleFormReferencia.jButtonCancelarToolBarReferencia.setVisible(this.isVisibilidadCeldaCancelarReferencia);				
			this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosToolBarReferencia.setVisible((this.isVisibilidadCeldaGuardarReferencia && this.isPermisoGuardarCambiosReferencia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarReferencia.setVisible((this.isVisibilidadCeldaGuardarCambiosReferencia && this.isPermisoGuardarCambiosReferencia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoReferencia.setVisible((this.isVisibilidadCeldaNuevoReferencia && this.isPermisoNuevoReferencia));			
			this.jMenuItemDuplicarReferencia.setVisible((this.isVisibilidadCeldaDuplicarReferencia && this.isPermisoDuplicarReferencia));			
			this.jMenuItemCopiarReferencia.setVisible((this.isVisibilidadCeldaCopiarReferencia && this.isPermisoCopiarReferencia));			
			this.jMenuItemVerFormReferencia.setVisible((this.isVisibilidadCeldaVerFormReferencia && this.isPermisoVerFormReferencia));			
			this.jMenuItemAbrirOrderByReferencia.setVisible((this.isVisibilidadCeldaOrdenReferencia && this.isPermisoOrdenReferencia));			
			//this.jMenuItemMostrarOcultarReferencia.setVisible((this.isVisibilidadCeldaOrdenReferencia && this.isPermisoOrdenReferencia));
			this.jMenuItemDetalleAbrirOrderByReferencia.setVisible((this.isVisibilidadCeldaOrdenReferencia && this.isPermisoOrdenReferencia));			
			//this.jMenuItemDetalleMostrarOcultarReferencia.setVisible((this.isVisibilidadCeldaOrdenReferencia && this.isPermisoOrdenReferencia));			
			this.jMenuItemNuevoRelacionesReferencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferencia && this.isPermisoNuevoReferencia));			
			this.jMenuItemNuevoGuardarCambiosReferencia.setVisible((this.isVisibilidadCeldaNuevoReferencia && this.isPermisoNuevoReferencia && this.isPermisoGuardarCambiosReferencia));									
			
			if(this.jInternalFrameDetalleFormReferencia!=null) {
			this.jInternalFrameDetalleFormReferencia.jMenuItemModificarReferencia.setVisible((this.isVisibilidadCeldaModificarReferencia && this.isPermisoActualizarReferencia));	
			this.jInternalFrameDetalleFormReferencia.jMenuItemActualizarReferencia.setVisible((this.isVisibilidadCeldaActualizarReferencia && this.isPermisoActualizarReferencia));	
			this.jInternalFrameDetalleFormReferencia.jMenuItemEliminarReferencia.setVisible((this.isVisibilidadCeldaEliminarReferencia && this.isPermisoEliminarReferencia));
			this.jInternalFrameDetalleFormReferencia.jMenuItemCancelarReferencia.setVisible(this.isVisibilidadCeldaCancelarReferencia);				
			}
			
			this.jMenuItemGuardarCambiosReferencia.setVisible((this.isVisibilidadCeldaGuardarReferencia && this.isPermisoGuardarCambiosReferencia));						
			this.jMenuItemGuardarCambiosTablaReferencia.setVisible((this.isVisibilidadCeldaGuardarCambiosReferencia && this.isPermisoGuardarCambiosReferencia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoReferencia=this.jButtonNuevoReferencia.isVisible();
			this.isVisibilidadCeldaDuplicarReferencia=this.jButtonDuplicarReferencia.isVisible();
			this.isVisibilidadCeldaCopiarReferencia=this.jButtonCopiarReferencia.isVisible();
			this.isVisibilidadCeldaVerFormReferencia=this.jButtonVerFormReferencia.isVisible();
			
			this.isVisibilidadCeldaOrdenReferencia=this.jButtonAbrirOrderByReferencia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesReferencia=this.jButtonNuevoRelacionesReferencia.isVisible();
			this.isVisibilidadCeldaModificarReferencia=this.jButtonModificarReferencia.isVisible();
			
			if(this.jInternalFrameDetalleFormReferencia!=null) {
			this.isVisibilidadCeldaActualizarReferencia=this.jInternalFrameDetalleFormReferencia.jButtonActualizarReferencia.isVisible();
			this.isVisibilidadCeldaEliminarReferencia=this.jInternalFrameDetalleFormReferencia.jButtonEliminarReferencia.isVisible();
			this.isVisibilidadCeldaCancelarReferencia=this.jInternalFrameDetalleFormReferencia.jButtonCancelarReferencia.isVisible();
			this.isVisibilidadCeldaGuardarReferencia=this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosReferencia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosReferencia=this.jButtonGuardarCambiosTablaReferencia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoReferencia=this.jButtonNuevoToolBarReferencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReferencia=this.jButtonNuevoRelacionesToolBarReferencia.isVisible();
			
			if(this.jInternalFrameDetalleFormReferencia!=null) {
			this.isVisibilidadCeldaModificarReferencia=this.jInternalFrameDetalleFormReferencia.jButtonModificarToolBarReferencia.isVisible();
			this.isVisibilidadCeldaActualizarReferencia=this.jInternalFrameDetalleFormReferencia.jButtonActualizarToolBarReferencia.isVisible();
			this.isVisibilidadCeldaEliminarReferencia=this.jInternalFrameDetalleFormReferencia.jButtonEliminarToolBarReferencia.isVisible();
			this.isVisibilidadCeldaCancelarReferencia=this.jInternalFrameDetalleFormReferencia.jButtonCancelarToolBarReferencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReferencia=this.jButtonGuardarCambiosToolBarReferencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReferencia=this.jButtonGuardarCambiosTablaToolBarReferencia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoReferencia=this.jMenuItemNuevoReferencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReferencia=this.jMenuItemNuevoRelacionesReferencia.isVisible();
			
			if(this.jInternalFrameDetalleFormReferencia!=null) {
			this.isVisibilidadCeldaModificarReferencia=this.jInternalFrameDetalleFormReferencia.jMenuItemModificarReferencia.isVisible();
			this.isVisibilidadCeldaActualizarReferencia=this.jInternalFrameDetalleFormReferencia.jMenuItemActualizarReferencia.isVisible();
			this.isVisibilidadCeldaEliminarReferencia=this.jInternalFrameDetalleFormReferencia.jMenuItemEliminarReferencia.isVisible();
			this.isVisibilidadCeldaCancelarReferencia=this.jInternalFrameDetalleFormReferencia.jMenuItemCancelarReferencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReferencia=this.jMenuItemGuardarCambiosReferencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReferencia=this.jMenuItemGuardarCambiosTablaReferencia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesReferencia(Boolean esInicializar) {
		if(ReferenciaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.referenciaSessionBean.getConGuardarRelaciones()) {
				//if(this.referenciaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesReferencia();
			}
			
			this.inicializarActualizarBindingBotonesManualReferencia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualReferencia() {
		this.jButtonNuevoReferencia.setVisible(this.isPermisoNuevoReferencia);			
		this.jButtonDuplicarReferencia.setVisible(this.isPermisoDuplicarReferencia);			
		this.jButtonCopiarReferencia.setVisible(this.isPermisoCopiarReferencia);			
		this.jButtonVerFormReferencia.setVisible(this.isPermisoVerFormReferencia);			
		
		this.jButtonAbrirOrderByReferencia.setVisible(this.isPermisoOrdenReferencia);					
		
		this.jButtonNuevoRelacionesReferencia.setVisible(this.isPermisoNuevoReferencia);			
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jButtonModificarReferencia.setVisible(this.isPermisoActualizarReferencia);	
			this.jInternalFrameDetalleFormReferencia.jButtonActualizarReferencia.setVisible(this.isPermisoActualizarReferencia);	
			this.jInternalFrameDetalleFormReferencia.jButtonEliminarReferencia.setVisible(this.isPermisoEliminarReferencia);
			this.jInternalFrameDetalleFormReferencia.jButtonCancelarReferencia.setVisible(this.isVisibilidadCeldaCancelarReferencia);						
			this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosReferencia.setVisible(this.isPermisoGuardarCambiosReferencia);							
		}
		
		this.jButtonGuardarCambiosTablaReferencia.setVisible(this.isPermisoActualizarReferencia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleReferencia() {
		this.jInternalFrameDetalleFormReferencia.jButtonModificarReferencia.setVisible(this.isPermisoActualizarReferencia);	
		this.jInternalFrameDetalleFormReferencia.jButtonActualizarReferencia.setVisible(this.isPermisoActualizarReferencia);	
		this.jInternalFrameDetalleFormReferencia.jButtonEliminarReferencia.setVisible(this.isPermisoEliminarReferencia);
		this.jInternalFrameDetalleFormReferencia.jButtonCancelarReferencia.setVisible(this.isVisibilidadCeldaCancelarReferencia);							
		this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosReferencia.setVisible((this.isVisibilidadCeldaGuardarReferencia && this.isPermisoGuardarCambiosReferencia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosReferencia() {
		if(ReferenciaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualReferencia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesReferencia() {
	}
	
	public void jTableDatosReferenciaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarReferencia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referencia==null) {
						this.referencia = new Referencia();
					}

					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				}

				if(this.referencia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.referencia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaReferenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebReferencia(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.referenciaLogic.getConnexion());

				if(this.referencia.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.referencia.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferencia=(TitledBorder)this.jScrollPanelDatosReferencia.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderReferencia.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referencia==null) {
						this.referencia = new Referencia();
					}

					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				}

				if(this.referencia.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.referencia.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoReferenciaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderReferencia=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosReferencia.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderReferencia=(TitledBorder)this.jScrollPanelDatosReferencia.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderReferencia.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoReferenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebReferencia(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.referenciaLogic.getConnexion());

				if(this.referencia.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.referencia.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferencia=(TitledBorder)this.jScrollPanelDatosReferencia.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderReferencia.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referencia==null) {
						this.referencia = new Referencia();
					}

					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				}

				if(this.referencia.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.referencia.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_parentezcoReferenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoparentezco=true;

			idTienePermisoparentezco=this.tienePermisosUsuarioEnPaginaWebReferencia(ParentezcoConstantesFunciones.CLASSNAME);

			if(idTienePermisoparentezco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);

				this.parentezcoBeanSwingJInternalFrame=new ParentezcoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.parentezcoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.parentezcoBeanSwingJInternalFrame.getParentezcoLogic().setConnexion(this.referenciaLogic.getConnexion());

				if(this.referencia.getid_parentezco()!=null) {
					this.parentezcoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.parentezcoBeanSwingJInternalFrame.setIdActual(this.referencia.getid_parentezco());
					this.parentezcoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.parentezcoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.parentezcoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParentezco();
				}

				JInternalFrameBase jinternalFrame =this.parentezcoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferencia=(TitledBorder)this.jScrollPanelDatosReferencia.getBorder();
				TitledBorder titledBorderparentezco=(TitledBorder)this.parentezcoBeanSwingJInternalFrame.jScrollPanelDatosParentezco.getBorder();

				titledBorderparentezco.setTitle(titledBorderReferencia.getTitle() + " -> Parentezco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_parentezcoReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referencia==null) {
						this.referencia = new Referencia();
					}

					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				}

				if(this.referencia.getid_parentezco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_parentezco = "+this.referencia.getid_parentezco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_profesionReferenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprofesion=true;

			idTienePermisoprofesion=this.tienePermisosUsuarioEnPaginaWebReferencia(ProfesionConstantesFunciones.CLASSNAME);

			if(idTienePermisoprofesion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);

				this.profesionBeanSwingJInternalFrame=new ProfesionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.profesionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.profesionBeanSwingJInternalFrame.getProfesionLogic().setConnexion(this.referenciaLogic.getConnexion());

				if(this.referencia.getid_profesion()!=null) {
					this.profesionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.profesionBeanSwingJInternalFrame.setIdActual(this.referencia.getid_profesion());
					this.profesionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.profesionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.profesionBeanSwingJInternalFrame.inicializarActualizarBindingTablaProfesion();
				}

				JInternalFrameBase jinternalFrame =this.profesionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferencia=(TitledBorder)this.jScrollPanelDatosReferencia.getBorder();
				TitledBorder titledBorderprofesion=(TitledBorder)this.profesionBeanSwingJInternalFrame.jScrollPanelDatosProfesion.getBorder();

				titledBorderprofesion.setTitle(titledBorderReferencia.getTitle() + " -> Profesion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_profesionReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referencia==null) {
						this.referencia = new Referencia();
					}

					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				}

				if(this.referencia.getid_profesion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_profesion = "+this.referencia.getid_profesion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncedulaReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referencia==null) {
						this.referencia = new Referencia();
					}

					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				}

				if(this.referencia.getcedula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cedula like '%"+this.referencia.getcedula()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referencia==null) {
						this.referencia = new Referencia();
					}

					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				}

				if(this.referencia.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.referencia.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referencia==null) {
						this.referencia = new Referencia();
					}

					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				}

				if(this.referencia.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.referencia.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referencia==null) {
						this.referencia = new Referencia();
					}

					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				}

				if(this.referencia.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.referencia.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoReferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferencia(this.getreferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referencia==null) {
						this.referencia = new Referencia();
					}

					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);
				}

				if(this.referencia.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.referencia.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoReferenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferencia(false,false);

			this.getReferenciasFK_IdEmpleado();

			this.inicializarActualizarBindingReferencia(false);

			//if(ReferenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaReferenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferencia(false,false);

			this.getReferenciasFK_IdEmpresa();

			this.inicializarActualizarBindingReferencia(false);

			//if(ReferenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdParentezcoReferenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferencia(false,false);

			this.getReferenciasFK_IdParentezco();

			this.inicializarActualizarBindingReferencia(false);

			//if(ReferenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProfesionReferenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferencia(false,false);

			this.getReferenciasFK_IdProfesion();

			this.inicializarActualizarBindingReferencia(false);

			//if(ReferenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameReferencia() {
		if(this.jInternalFrameDetalleFormReferencia!=null) {
		

		if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormReferencia!=null) {
			this.jInternalFrameDetalleFormReferencia.setVisible(false);	    			
			this.jInternalFrameDetalleFormReferencia.dispose();
			this.jInternalFrameDetalleFormReferencia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoReferencia!=null) {
			this.jInternalFrameReporteDinamicoReferencia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoReferencia.dispose();
			this.jInternalFrameReporteDinamicoReferencia=null;
		}
		
		if(this.jInternalFrameImportacionReferencia!=null) {
			this.jInternalFrameImportacionReferencia.setVisible(false);	    			
			this.jInternalFrameImportacionReferencia.dispose();
			this.jInternalFrameImportacionReferencia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessReferencia();
			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
			
			if(sTipo.equals("NuevoReferencia")) {
				jButtonNuevoReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarReferencia")) {
				jButtonDuplicarReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarReferencia")) {
				jButtonCopiarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormReferencia")) {
				jButtonVerFormReferenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarReferencia")) {
				jButtonNuevoReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarReferencia")) {
				jButtonDuplicarReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoReferencia")) {
				jButtonNuevoReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarReferencia")) {
				jButtonDuplicarReferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesReferencia")) {
				jButtonNuevoReferenciaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarReferencia")) {
				jButtonNuevoReferenciaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesReferencia")) {
				jButtonNuevoReferenciaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarReferencia")) {
				jButtonModificarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarReferencia")) {
				jButtonModificarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarReferencia")) {
				jButtonModificarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarReferencia")) {
				jButtonActualizarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarReferencia")) {
				jButtonActualizarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarReferencia")) {
				jButtonActualizarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarReferencia")) {
				jButtonEliminarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarReferencia")) {
				jButtonEliminarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarReferencia")) {
				jButtonEliminarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarReferencia")) {
				jButtonCancelarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarReferencia")) {
				jButtonCancelarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarReferencia")) {
				jButtonCancelarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarReferencia")) {
				jButtonCerrarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarReferencia")) {
				jButtonCerrarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarReferencia")) {
				jButtonCerrarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarReferencia")) {
				jButtonMostrarOcultarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarReferencia")) {
				jButtonCancelarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosReferencia")) {
				jButtonGuardarCambiosReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarReferencia")) {
				jButtonGuardarCambiosReferenciaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarReferencia")) {
				jButtonCopiarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarReferencia")) {
				jButtonVerFormReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosReferencia")) {
				jButtonGuardarCambiosReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarReferencia")) {
				jButtonCopiarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormReferencia")) {
				jButtonVerFormReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaReferencia")) {
				jButtonGuardarCambiosReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarReferencia")) {
				jButtonGuardarCambiosReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaReferencia")) {
				jButtonGuardarCambiosReferenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionReferencia")) {
				jButtonRecargarInformacionReferenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarReferencia")) {
				jButtonRecargarInformacionReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionReferencia")) {
				jButtonRecargarInformacionReferenciaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresReferencia")) {
				jButtonAnterioresReferenciaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarReferencia")) {
				jButtonAnterioresReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreReferencia")) {
				jButtonAnterioresReferenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesReferencia")) {
				jButtonSiguientesReferenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarReferencia")) {
				jButtonSiguientesReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesReferencia")) {
				jButtonSiguientesReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByReferencia") || sTipo.equals("MenuItemDetalleAbrirOrderByReferencia")) {
				jButtonAbrirOrderByReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarReferencia") || sTipo.equals("MenuItemDetalleMostrarOcultarReferencia")) {
				jButtonMostrarOcultarReferenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosReferencia")) {
				jButtonNuevoGuardarCambiosReferenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarReferencia")) {
				jButtonNuevoGuardarCambiosReferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosReferencia")) {
				jButtonNuevoGuardarCambiosReferenciaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoReferencia")) {
				jButtonCerrarReporteDinamicoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoReferencia")) {
				jButtonGenerarReporteDinamicoReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoReferencia")) {
				
				jButtonGenerarExcelReporteDinamicoReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionReferencia")) {
				jButtonCerrarImportacionReferenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionReferencia")) {
				
				jButtonGenerarImportacionReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionReferencia")) {
				
				jButtonAbrirImportacionReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesReferencia")) {
				jComboBoxTiposAccionesReferenciaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesReferencia")) {
				jComboBoxTiposRelacionesReferenciaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioReferencia")) {
				jComboBoxTiposAccionesReferenciaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarReferencia")) {
				
				jComboBoxTiposSeleccionarReferenciaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralReferencia")) {
				jTextFieldValorCampoGeneralReferenciaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByReferencia")) {
				jButtonAbrirOrderByReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarReferencia")) {
				jButtonAbrirOrderByReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByReferencia")) {
				jButtonCerrarOrderByReferenciaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReferenciaBusqueda")) {
				this.jButtonidReferenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaReferenciaUpdate")) {
				this.jButtonid_empresaReferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaReferenciaBusqueda")) {
				this.jButtonid_empresaReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoReferencia")) {
				this.jButtonid_empleadoReferenciaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoReferenciaUpdate")) {
				this.jButtonid_empleadoReferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoReferenciaBusqueda")) {
				this.jButtonid_empleadoReferenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parentezcoReferenciaUpdate")) {
				this.jButtonid_parentezcoReferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parentezcoReferenciaBusqueda")) {
				this.jButtonid_parentezcoReferenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_profesionReferenciaUpdate")) {
				this.jButtonid_profesionReferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_profesionReferenciaBusqueda")) {
				this.jButtonid_profesionReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedulaReferenciaBusqueda")) {
				this.jButtoncedulaReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoReferenciaBusqueda")) {
				this.jButtonapellidoReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreReferenciaBusqueda")) {
				this.jButtonnombreReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionReferenciaBusqueda")) {
				this.jButtondireccionReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoReferenciaBusqueda")) {
				this.jButtontelefonoReferenciaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoReferencia")) {
				this.jButtonid_empleadoReferenciaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoReferencia")) {
				this.jButtonFK_IdEmpleadoReferenciaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdParentezcoReferencia")) {
				this.jButtonFK_IdParentezcoReferenciaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProfesionReferencia")) {
				this.jButtonFK_IdProfesionReferenciaActionPerformed(evt);
			}
			
			;
			
			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessReferencia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				


				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Referencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Referencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Referencia referenciaLocal=null;
			
			if(!this.getEsControlTabla()) {
				referenciaLocal=this.referencia;
			} else {
				referenciaLocal=this.referenciaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
							
				
				


				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Referencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Referencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaAnterior =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciaAnterior =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
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
			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
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
			
			


			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
								
						
				


				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Referencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Referencia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
								
				
				


				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Referencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Referencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaAnterior =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciaAnterior =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referencia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaAnterior =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciaAnterior =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
							
				
				


				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Referencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Referencia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciaAnterior =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.referenciaAnterior =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
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
			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
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
			
			


			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
								
				
				


				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Referencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Referencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaAnterior =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciaAnterior =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosReferencia")) {
					jCheckBoxSeleccionarTodosReferenciaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosReferencia")) {
					jCheckBoxSeleccionadosReferenciaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarReferencia")) {
					
				}
				
				


				
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Referencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Referencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
												
				
				


				
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Referencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Referencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciaAnterior =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.referenciaAnterior =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
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
			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
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
			
			


			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Referencia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Referencia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referencia);
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
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
				
				


				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Referencia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Referencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciaAnterior =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciaAnterior =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarReferencia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosReferenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosReferencia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.referencia =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.referencia =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.referencia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarReferencia")) {
				
				}
				
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarReferencia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosReferencia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarReferencia")) {
			
			}
			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessReferencia();
			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
			if(sTipo.equals("NuevoReferencia")) {
				jButtonNuevoReferenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarReferencia")) {
				jButtonDuplicarReferenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarReferencia")) {
				jButtonCopiarReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormReferencia")) {
				jButtonVerFormReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesReferencia")) {
				jButtonNuevoReferenciaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarReferencia")) {
				jButtonModificarReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarReferencia")) {
				jButtonActualizarReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarReferencia")) {
				jButtonEliminarReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaReferencia")) {
				jButtonGuardarCambiosReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarReferencia")) {
				jButtonCancelarReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarReferencia")) {
				jButtonCerrarReferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosReferencia")) {
				jButtonGuardarCambiosReferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosReferencia")) {
				jButtonNuevoGuardarCambiosReferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByReferencia")) {
				jButtonAbrirOrderByReferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionReferencia")) {
				jButtonRecargarInformacionReferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresReferencia")) {
				jButtonAnterioresReferenciaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesReferencia")) {
				jButtonSiguientesReferenciaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReferenciaBusqueda")) {
				this.jButtonidReferenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaReferenciaUpdate")) {
				this.jButtonid_empresaReferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaReferenciaBusqueda")) {
				this.jButtonid_empresaReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoReferencia")) {
				this.jButtonid_empleadoReferenciaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoReferenciaUpdate")) {
				this.jButtonid_empleadoReferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoReferenciaBusqueda")) {
				this.jButtonid_empleadoReferenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parentezcoReferenciaUpdate")) {
				this.jButtonid_parentezcoReferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parentezcoReferenciaBusqueda")) {
				this.jButtonid_parentezcoReferenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_profesionReferenciaUpdate")) {
				this.jButtonid_profesionReferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_profesionReferenciaBusqueda")) {
				this.jButtonid_profesionReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedulaReferenciaBusqueda")) {
				this.jButtoncedulaReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoReferenciaBusqueda")) {
				this.jButtonapellidoReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreReferenciaBusqueda")) {
				this.jButtonnombreReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionReferenciaBusqueda")) {
				this.jButtondireccionReferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoReferenciaBusqueda")) {
				this.jButtontelefonoReferenciaBusquedaActionPerformed(evt);
			}
			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessReferencia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameReferencia")) {
				closingInternalFrameReferencia();
				
			} else if(sTipo.equals("jButtonCancelarReferencia")) {
				JInternalFrameBase jInternalFrameDetalleFormReferencia = (JInternalFrameBase)evt.getSource();
	            	
	            ReferenciaBeanSwingJInternalFrame jInternalFrameParent=(ReferenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormReferencia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarReferenciaActionPerformed(null);
			}
			
			ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.referencia,new Object(),this.referenciaParameterGeneral,this.referenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormReferencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormReferencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormReferencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.referencia)) {
			if(!esControlTabla) {
				if(ReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);			
				}
				
				if(this.referenciaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualReferencia(this.referencia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.referenciaReturnGeneral=referenciaLogic.procesarEventosReferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciaLogic.getReferencias(),this.referencia,this.referenciaParameterGeneral,this.isEsNuevoReferencia,classes);//this.referenciaLogic.getReferencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanReferencia(this.referenciaReturnGeneral,this.referenciaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.referenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanReferencia(classes,this.referenciaReturnGeneral,this.referenciaBean,false);
					}
						
					if(this.referenciaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyReferencia(this.referenciaReturnGeneral.getReferencia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioReferencia(this.referenciaReturnGeneral.getReferencia());	
					}
						
					if(this.referenciaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioReferencia(this.referenciaReturnGeneral.getReferencia(),classes);//this.referenciaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioReferencia(this.referencia,classes);//this.referenciaBean);									
				}
			
				if(ReferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualReferencia(this.referencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReferencia(this.referencia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.referenciaAnterior!=null) {
						this.referencia=this.referenciaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.referenciaReturnGeneral=referenciaLogic.procesarEventosReferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciaLogic.getReferencias(),this.referencia,this.referenciaParameterGeneral,this.isEsNuevoReferencia,classes);//this.referenciaLogic.getReferencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.referenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.referenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.referenciaReturnGeneral.getReferencia(),referenciaLogic.getReferencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.referenciaReturnGeneral.getReferencia(),this.referencias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosReferencia.repaint();
				
				//((AbstractTableModel) this.jTableDatosReferencia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosReferencia();
			}
		}
	}
	
	public void actualizarVisualTableDatosReferencia() throws Exception {
		
		ReferenciaModel referenciaModel=(ReferenciaModel)this.jTableDatosReferencia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referenciaModel.referencias=this.referenciaLogic.getReferencias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			referenciaModel.referencias=this.referencias;
		}
		
		
		((ReferenciaModel) this.jTableDatosReferencia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaReferencia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getreferenciaAnterior(),this.referenciaLogic.getReferencias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getreferenciaAnterior(),this.referencias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosReferencia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioReferencia(Referencia referencia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TelefonoReferencia.class)) {
					this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.setTelefonoReferencias(referencia.getTelefonoReferencias());
					this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTelefonoReferencia(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
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
										
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referencia,new Object(),generalEntityParameterGeneral,this.referenciaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.referenciaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ReferenciaConstantesFunciones.getClassesRelationshipsOfReferencia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ReferenciaConstantesFunciones.getClassesRelationshipsFromStringsOfReferencia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormReferencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ReferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referencia,new Object(),generalEntityParameterGeneral,this.referenciaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioReferencia(ReferenciaBean referenciaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TelefonoReferencia.class)) {
					this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.setTelefonoReferencias(referencia.getTelefonoReferencias());
					this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTelefonoReferencia(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanReferencia(ArrayList<Classe> classes,ReferenciaReturnGeneral referenciaReturnGeneral,ReferenciaBean referenciaBean,Boolean conDefault) throws Exception {
		
			this.referenciaBean.setTelefonoReferencias(referenciaReturnGeneral.getReferencia().getTelefonoReferencias());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualReferencia(Referencia referencia,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(TelefonoReferencia.class)) {
					referencia.setTelefonoReferencias(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaLogic.getTelefonoReferencias());
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
		if(!paraTabla && !this.permiteMantenimiento(this.referencia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormReferencia = new ReferenciaDetalleFormJInternalFrame(jDesktopPane,this.referenciaSessionBean.getConGuardarRelaciones(),this.referenciaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormReferencia);
		this.jInternalFrameDetalleFormReferencia.setVisible(false);
		this.jInternalFrameDetalleFormReferencia.setSelected(false);						
		
		this.jInternalFrameDetalleFormReferencia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormReferencia.referenciaLogic=this.referenciaLogic;
		
		this.cargarCombosFrameForeignKeyReferencia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleReferencia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReferencia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyReferencia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyReferencia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormReferencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReferencia"));
		
		this.jInternalFrameDetalleFormReferencia.jButtonModificarReferencia.addActionListener(new ButtonActionListener(this,"ModificarReferencia"));

		
		this.jInternalFrameDetalleFormReferencia.jButtonModificarToolBarReferencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarReferencia"));
					
		this.jInternalFrameDetalleFormReferencia.jMenuItemModificarReferencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarReferencia"));		
		
		
		
		this.jInternalFrameDetalleFormReferencia.jButtonActualizarReferencia.addActionListener (new ButtonActionListener(this,"ActualizarReferencia"));
		
		
		this.jInternalFrameDetalleFormReferencia.jButtonActualizarToolBarReferencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReferencia"));
						
		this.jInternalFrameDetalleFormReferencia.jMenuItemActualizarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReferencia"));		
		
		
		
		this.jInternalFrameDetalleFormReferencia.jButtonEliminarReferencia.addActionListener (new ButtonActionListener(this,"EliminarReferencia"));
		
		
		this.jInternalFrameDetalleFormReferencia.jButtonEliminarToolBarReferencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarReferencia"));
								
		this.jInternalFrameDetalleFormReferencia.jMenuItemEliminarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReferencia"));		
		
		
		
		this.jInternalFrameDetalleFormReferencia.jButtonCancelarReferencia.addActionListener (new ButtonActionListener(this,"CancelarReferencia"));
		
		
		this.jInternalFrameDetalleFormReferencia.jButtonCancelarToolBarReferencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarReferencia"));
					
		this.jInternalFrameDetalleFormReferencia.jMenuItemCancelarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReferencia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormReferencia.jMenuItemDetalleCerrarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReferencia"));		
		
		
		
		this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosToolBarReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferencia"));
		
		
		
		this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosToolBarReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferencia"));
		
		
		
		this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReferencia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonidReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_empresaReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_empresaReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaBusqueda"));
		//jButtonid_empleadoReferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoReferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferencia.jButtonid_empleadoReferencia.addActionListener(new ButtonActionListener(this,"id_empleadoReferencia"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_empleadoReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_empleadoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_parentezcoReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_parentezcoReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_parentezcoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_parentezcoReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_profesionReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_profesionReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_profesionReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_profesionReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtoncedulaReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"cedulaReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonapellidoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"apellidoReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonnombreReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtondireccionReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"direccionReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtontelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoReferenciaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormReferencia.jTabbedPaneRelacionesReferencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReferencia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameReferencia"));
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReferencia"));
		}
		
		this.jTableDatosReferencia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarReferencia"));
		
		this.jTableDatosReferencia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarReferencia"));
		
		this.jButtonNuevoReferencia.addActionListener(new ButtonActionListener(this,"NuevoReferencia"));
		
		this.jButtonDuplicarReferencia.addActionListener(new ButtonActionListener(this,"DuplicarReferencia"));
		
		this.jButtonCopiarReferencia.addActionListener(new ButtonActionListener(this,"CopiarReferencia"));
		
		this.jButtonVerFormReferencia.addActionListener(new ButtonActionListener(this,"VerFormReferencia"));
		
		
		this.jButtonNuevoToolBarReferencia.addActionListener(new ButtonActionListener(this,"NuevoToolBarReferencia"));
			
		this.jButtonDuplicarToolBarReferencia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarReferencia"));
			
		this.jMenuItemNuevoReferencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoReferencia"));
			
		this.jMenuItemDuplicarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarReferencia"));		
		
		
		this.jButtonNuevoRelacionesReferencia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesReferencia"));
		
		
		this.jButtonNuevoRelacionesToolBarReferencia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarReferencia"));
			
		this.jMenuItemNuevoRelacionesReferencia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesReferencia"));		
		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jButtonModificarReferencia.addActionListener(new ButtonActionListener(this,"ModificarReferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jButtonModificarToolBarReferencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarReferencia"));
			
			this.jInternalFrameDetalleFormReferencia.jMenuItemModificarReferencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarReferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormReferencia.jButtonActualizarReferencia.addActionListener (new ButtonActionListener(this,"ActualizarReferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jButtonActualizarToolBarReferencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReferencia"));
				
			this.jInternalFrameDetalleFormReferencia.jMenuItemActualizarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jButtonEliminarReferencia.addActionListener (new ButtonActionListener(this,"EliminarReferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jButtonEliminarToolBarReferencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarReferencia"));
						
			this.jInternalFrameDetalleFormReferencia.jMenuItemEliminarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jButtonCancelarReferencia.addActionListener (new ButtonActionListener(this,"CancelarReferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jButtonCancelarToolBarReferencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarReferencia"));
			
			this.jInternalFrameDetalleFormReferencia.jMenuItemCancelarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReferencia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarReferencia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarReferencia"));		
		
		
		this.jButtonCerrarReferencia.addActionListener (new ButtonActionListener(this,"CerrarReferencia"));
		
		
		this.jButtonCerrarToolBarReferencia.addActionListener (new ButtonActionListener(this,"CerrarToolBarReferencia"));
			
		this.jMenuItemCerrarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarReferencia"));
			
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jMenuItemDetalleCerrarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosReferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosToolBarReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferencia"));
		}
		
		this.jButtonCopiarToolBarReferencia.addActionListener (new ButtonActionListener(this,"CopiarToolBarReferencia"));
			
		this.jButtonVerFormToolBarReferencia.addActionListener (new ButtonActionListener(this,"VerFormToolBarReferencia"));
		
		this.jMenuItemGuardarCambiosReferencia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosReferencia"));
			
		this.jMenuItemCopiarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarReferencia"));		
		
		this.jMenuItemVerFormReferencia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormReferencia"));		
		
		
		this.jButtonGuardarCambiosTablaReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReferencia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarReferencia"));
			
		this.jMenuItemGuardarCambiosTablaReferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReferencia"));		
		
		
		
		this.jButtonRecargarInformacionReferencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionReferencia"));
					
		this.jButtonRecargarInformacionToolBarReferencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarReferencia"));
		
		this.jMenuItemRecargarInformacionReferencia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionReferencia"));		
		
		
		
		this.jButtonAnterioresReferencia.addActionListener (new ButtonActionListener(this,"AnterioresReferencia"));
		
		
		this.jButtonAnterioresToolBarReferencia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarReferencia"));
		
		this.jMenuItemAnterioresReferencia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresReferencia"));		
		
		
		this.jButtonSiguientesReferencia.addActionListener (new ButtonActionListener(this,"SiguientesReferencia"));
		
		
		this.jButtonSiguientesToolBarReferencia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarReferencia"));
			
		this.jMenuItemSiguientesReferencia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesReferencia"));
			
		this.jMenuItemAbrirOrderByReferencia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByReferencia"));
			
		this.jMenuItemMostrarOcultarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarReferencia"));
			
		this.jMenuItemDetalleAbrirOrderByReferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByReferencia"));
			
		this.jMenuItemDetalleMostarOcultarReferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarReferencia"));		
		
		
		this.jButtonNuevoGuardarCambiosReferencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosReferencia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarReferencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarReferencia"));
			
		this.jMenuItemNuevoGuardarCambiosReferencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosReferencia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosReferencia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosReferencia"));

		this.jCheckBoxSeleccionadosReferencia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosReferencia"));
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReferencia"));
		}
		
		
		this.jComboBoxTiposRelacionesReferencia.addActionListener (new ButtonActionListener(this,"TiposRelacionesReferencia"));
			
		this.jComboBoxTiposAccionesReferencia.addActionListener (new ButtonActionListener(this,"TiposAccionesReferencia"));
					
		this.jComboBoxTiposSeleccionarReferencia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarReferencia"));
			
		this.jTextFieldValorCampoGeneralReferencia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralReferencia"));		
		
		
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonidReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_empresaReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_empresaReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaBusqueda"));
		//jButtonid_empleadoReferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoReferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferencia.jButtonid_empleadoReferencia.addActionListener(new ButtonActionListener(this,"id_empleadoReferencia"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_empleadoReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_empleadoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_parentezcoReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_parentezcoReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_parentezcoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_parentezcoReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_profesionReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_profesionReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_profesionReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_profesionReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtoncedulaReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"cedulaReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonapellidoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"apellidoReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonnombreReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtondireccionReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"direccionReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtontelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoReferenciaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoReferencia.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoReferencia"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoReferencia.addActionListener(new ButtonActionListener(this,"id_empleadoReferencia"));

			this.jButtonFK_IdParentezcoReferencia.addActionListener(new ButtonActionListener(this,"FK_IdParentezcoReferencia"));

			this.jButtonFK_IdProfesionReferencia.addActionListener(new ButtonActionListener(this,"FK_IdProfesionReferencia"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoReferencia!=null) {
				this.jInternalFrameReporteDinamicoReferencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferencia"));
				this.jInternalFrameReporteDinamicoReferencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferencia"));
				this.jInternalFrameReporteDinamicoReferencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferencia"));
			}
			
			//this.jButtonCerrarReporteDinamicoReferencia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferencia"));				
			//this.jButtonGenerarReporteDinamicoReferencia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferencia"));
			//this.jButtonGenerarExcelReporteDinamicoReferencia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferencia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionReferencia!=null) {
				this.jInternalFrameImportacionReferencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReferencia"));
				this.jInternalFrameImportacionReferencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReferencia"));
				this.jInternalFrameImportacionReferencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReferencia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByReferencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByReferencia"));
			
			this.jButtonAbrirOrderByToolBarReferencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarReferencia"));			
			
			if(this.jInternalFrameOrderByReferencia!=null) {
				this.jInternalFrameOrderByReferencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReferencia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormReferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferencia.jTabbedPaneRelacionesReferencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReferencia"));
		
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
            		closingInternalFrameReferencia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormReferencia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormReferencia = (JInternalFrameBase)event.getSource();
	            	
	            ReferenciaBeanSwingJInternalFrame jInternalFrameParent=(ReferenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormReferencia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarReferenciaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosReferencia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosReferenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosReferencia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosReferencia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoReferencia";
		inputMap = this.jButtonNuevoReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReferenciaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesReferencia";
		inputMap = this.jButtonNuevoRelacionesReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReferenciaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarReferencia";
		inputMap = this.jButtonModificarReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarReferencia";
		inputMap = this.jButtonActualizarReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarReferencia";
		inputMap = this.jButtonEliminarReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarReferencia";
		inputMap = this.jButtonCancelarReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarReferencia";
		inputMap = this.jButtonCerrarReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosReferencia";
		inputMap = this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosReferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormReferencia.jButtonGuardarCambiosReferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosReferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosReferencia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosReferenciaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesReferencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesReferenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarReferencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarReferenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralReferencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralReferenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonidReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_empresaReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_empresaReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaBusqueda"));
		//jButtonid_empleadoReferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoReferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferencia.jButtonid_empleadoReferencia.addActionListener(new ButtonActionListener(this,"id_empleadoReferencia"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_empleadoReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_empleadoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_parentezcoReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_parentezcoReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_parentezcoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_parentezcoReferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferencia.jButtonid_profesionReferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_profesionReferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonid_profesionReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_profesionReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtoncedulaReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"cedulaReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonapellidoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"apellidoReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtonnombreReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtondireccionReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"direccionReferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferencia.jButtontelefonoReferenciaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoReferenciaBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoReferencia.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoReferencia"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoReferencia.addActionListener(new ButtonActionListener(this,"id_empleadoReferencia"));

		this.jButtonFK_IdParentezcoReferencia.addActionListener(new ButtonActionListener(this,"FK_IdParentezcoReferencia"));

		this.jButtonFK_IdProfesionReferencia.addActionListener(new ButtonActionListener(this,"FK_IdProfesionReferencia"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionReferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionReferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarReferenciaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarReferencia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosReferencia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Referencia referenciaAux:this.referenciaLogic.getReferencias()) {
					referenciaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Referencia referenciaAux:referencias) {
					referenciaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosReferenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReferencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Referencia referenciaAux:this.referenciaLogic.getReferencias()) {
						referenciaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Referencia referenciaAux:referencias) {
						referenciaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Referencia referenciaAux:this.referenciaLogic.getReferencias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Referencia referenciaAux:referencias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaReferencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReferencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReferencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReferencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosReferenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReferencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosReferencia.getSelectedRows();
			
			Referencia referenciaLocal=new Referencia();
			
			//this.seleccionarTodosReferencia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciaLocal =(Referencia) this.referenciaLogic.getReferencias().toArray()[this.jTableDatosReferencia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					referenciaLocal =(Referencia) this.referencias.toArray()[this.jTableDatosReferencia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				referenciaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Referencia referenciaAux:this.referenciaLogic.getReferencias()) {
						referenciaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Referencia referenciaAux:referencias) {
						referenciaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaReferencia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReferencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReferencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReferencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualReferenciaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarReferenciaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralReferenciaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingReferencia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralReferencia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Referencia referenciaAux:this.referenciaLogic.getReferencias()) {
				
						if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_CEDULA)) {
							existe=true;
							referenciaAux.setcedula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							referenciaAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							referenciaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							referenciaAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							referenciaAux.settelefono(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Referencia referenciaAux:referencias) {
					
						if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_CEDULA)) {
							existe=true;
							referenciaAux.setcedula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							referenciaAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							referenciaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							referenciaAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							referenciaAux.settelefono(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaReferencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesReferenciaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingReferencia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioReferencia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesReferencia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteReferencia) {				
					conSplash=true;//false;										
					
					//this.startProcessReferencia(conSplash);
				
					this.generarReporteReferenciasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoReferenciasSeleccionados();
				//this.jComboBoxTiposAccionesReferencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReferenciasSeleccionados(false);
				//this.jComboBoxTiposAccionesReferencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReferenciasSeleccionados(true);
				//this.jComboBoxTiposAccionesReferencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReferencia();
				
				this.exportarReferenciasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionReferencias();
				//this.importarReferencias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReferencia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelReferenciasSeleccionados();
				//this.jComboBoxTiposAccionesReferencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Referencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessReferencia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoReferencia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyReferencia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Referencia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.setSelectedIndex(0);					
				}	
			} 			
			else if(ReferenciaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteReferencia) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessReferencia(conSplash);
					
						//this.actualizarParametrosGeneralReferencia();
						
						this.generarReporteProcesoAccionReferenciasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesReferencia.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ReferenciaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ReferenciaS SELECCIONADOS?", "MANTENIMIENTO DE Referencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessReferencia();
				
						this.actualizarParametrosGeneralReferencia();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.referenciaReturnGeneral=referenciaLogic.procesarAccionReferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.referenciaLogic.getReferencias(),this.referenciaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarReferenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReferencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralReferencia();
					
					ReferenciaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarReferenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReferencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReferencia.jComboBoxTiposAccionesFormularioReferencia.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessReferencia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesReferenciaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessReferencia();
			
			if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();		
			Referencia referencia=new Referencia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingReferencia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesReferencia.getSelectedItem();
			
			
			
			
			referenciasSeleccionados=this.getReferenciasSeleccionados(true);
			//this.sTipoAccion;
			
			if(referenciasSeleccionados.size()==1) {
				for(Referencia referenciaAux:referenciasSeleccionados) {
					referencia=referenciaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Telefono Referencia")) {
					jButtonTelefonoReferenciaActionPerformed(null,rowIndex,true,false,referencia);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessReferencia();
			
      		//this.finishProcessReferencia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarReferenciaReturnGeneral() throws Exception {
		if(this.referenciaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.referenciaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.referenciaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.referenciaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.referenciaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.referenciaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingReferencia(false);
		}
		
		if(this.referenciaReturnGeneral.getConRetornoLista() || this.referenciaReturnGeneral.getConRetornoObjeto()) {
			if(this.referenciaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.referenciaLogic.setReferencias(this.referenciaReturnGeneral.getReferencias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.referenciaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.referenciaLogic.setReferencia(this.referenciaReturnGeneral.getReferencia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingReferencia(false);
		}
	}
	
	public void actualizarParametrosGeneralReferencia() throws Exception {
		
		
	}
	
	public ArrayList<Referencia> getReferenciasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioReferencia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Referencia referenciaAux:referenciaLogic.getReferencias()) {
					if(referenciaAux.getIsSelected()) {
						referenciasSeleccionados.add(referenciaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Referencia referenciaAux:this.referencias) {
					if(referenciaAux.getIsSelected()) {
						referenciasSeleccionados.add(referenciaAux);				
					}
				}
			}
			
			if(referenciasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						referenciasSeleccionados.addAll(this.referenciaLogic.getReferencias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						referenciasSeleccionados.addAll(this.referencias);				
					}
				}
			}
		} else {
			referenciasSeleccionados.add(this.referencia);
		}
		
		return referenciasSeleccionados;
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
	
	public void generarReporteReferenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalReferenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoReferenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReferenciasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReferenciasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesReferenciasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Referencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesReferenciasSeleccionados() throws Exception {
		ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();		
		
		referenciasSeleccionados=this.getReferenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteReferencias("Todos",referenciasSeleccionados);
		
	}	
	
	public void generarReporteNormalReferenciasSeleccionados() throws Exception {
		ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();		
		
		referenciasSeleccionados=this.getReferenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteReferencias("Todos",referenciasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionReferenciasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();
		
		referenciasSeleccionados=this.getReferenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteReferencias("Todos",referenciasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoReferenciasSeleccionados() throws Exception {
		ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoReferencia();
		
		
		referenciasSeleccionados=this.getReferenciasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoReferencia();
		
		
		//this.generarReporteReferencias("Todos",referenciasSeleccionados ,referenciaImplementable,referenciaImplementableHome);
	}
	
	public void mostrarImportacionReferencias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionReferencia();
		
		this.abrirFrameImportacionReferencia();		
		
			
		//this.generarReporteReferencias("Todos",referenciasSeleccionados ,referenciaImplementable,referenciaImplementableHome);
	}
	
	public void importarReferencias() throws Exception {		
	
	}
	
	public void exportarReferenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelReferenciasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoReferenciasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlReferenciasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Referencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoReferenciasSeleccionados() throws Exception {
		ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();		
		
		referenciasSeleccionados=this.getReferenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referencia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarReferencia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Referencia referenciaAux:referenciasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarReferencia(referenciaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//referenciaAux.setsDetalleGeneralEntityReporte(referenciaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarReferencia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ReferenciaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaConstantesFunciones.LABEL_IDPROFESION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaConstantesFunciones.LABEL_CEDULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaConstantesFunciones.LABEL_TELEFONO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarReferencia(Referencia referencia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=referencia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=referencia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=referencia.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referencia.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referencia.getparentezco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referencia.getprofesion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referencia.getcedula();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referencia.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referencia.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referencia.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referencia.gettelefono();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelReferenciasSeleccionados() throws Exception {
		ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();		
		
		referenciasSeleccionados=this.getReferenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referencia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Referencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelReferencia(row);				
				iRow++;
			}				
			
			for(Referencia referenciaAux:referenciasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelReferencia(referenciaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlReferenciasSeleccionados() throws Exception {
		ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();		
		
		referenciasSeleccionados=this.getReferenciasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referencia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("referencias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("referencia");
			//elementRoot.appendChild(element);
		
			for(Referencia referenciaAux:referenciasSeleccionados) {
				element = document.createElement("referencia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlReferencia(referenciaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelReferencia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaConstantesFunciones.LABEL_IDPROFESION);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaConstantesFunciones.LABEL_CEDULA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaConstantesFunciones.LABEL_TELEFONO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelReferencia(Referencia referencia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(referencia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(referencia.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referencia.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referencia.getparentezco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referencia.getprofesion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referencia.getcedula());
		cell = row.createCell(iColumn++);cell.setCellValue(referencia.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(referencia.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(referencia.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(referencia.gettelefono());				
	}
	
	public void setFilaDatosExportarXmlReferencia(Referencia referencia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ReferenciaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(referencia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ReferenciaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(referencia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ReferenciaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(referencia.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(ReferenciaConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(referencia.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementparentezco_descripcion = document.createElement(ReferenciaConstantesFunciones.IDPARENTEZCO);
		elementparentezco_descripcion.appendChild(document.createTextNode(referencia.getparentezco_descripcion()));
		element.appendChild(elementparentezco_descripcion);

		Element elementprofesion_descripcion = document.createElement(ReferenciaConstantesFunciones.IDPROFESION);
		elementprofesion_descripcion.appendChild(document.createTextNode(referencia.getprofesion_descripcion()));
		element.appendChild(elementprofesion_descripcion);

		Element elementcedula = document.createElement(ReferenciaConstantesFunciones.CEDULA);
		elementcedula.appendChild(document.createTextNode(referencia.getcedula().trim()));
		element.appendChild(elementcedula);

		Element elementapellido = document.createElement(ReferenciaConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(referencia.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementnombre = document.createElement(ReferenciaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(referencia.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdireccion = document.createElement(ReferenciaConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(referencia.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementtelefono = document.createElement(ReferenciaConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(referencia.gettelefono().trim()));
		element.appendChild(elementtelefono);
	}
	
	public void generarReporteGroupGenericoReferenciasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Referencia> referenciasSeleccionados=new ArrayList<Referencia>();
		
		referenciasSeleccionados=this.getReferenciasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoReferencia(referenciasSeleccionados);
		
		this.generarReporteReferencias("Todos",referenciasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoReferencia(ArrayList<Referencia> referenciasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Referencia referenciaAux:referenciasSeleccionados) {
				referenciaAux.setsDetalleGeneralEntityReporte(referenciaAux.toString());
			
				if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					referenciaAux.setsDescripcionGeneralEntityReporte1(referenciaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					referenciaAux.setsDescripcionGeneralEntityReporte1(referenciaAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO)) {
					existe=true;
					referenciaAux.setsDescripcionGeneralEntityReporte1(referenciaAux.getparentezco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_IDPROFESION)) {
					existe=true;
					referenciaAux.setsDescripcionGeneralEntityReporte1(referenciaAux.getprofesion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_CEDULA)) {
					existe=true;
					referenciaAux.setsDescripcionGeneralEntityReporte1(referenciaAux.getcedula());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					referenciaAux.setsDescripcionGeneralEntityReporte1(referenciaAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					referenciaAux.setsDescripcionGeneralEntityReporte1(referenciaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					referenciaAux.setsDescripcionGeneralEntityReporte1(referenciaAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					referenciaAux.setsDescripcionGeneralEntityReporte1(referenciaAux.gettelefono());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesReferencia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoReferencia=true;
				this.isVisibilidadCeldaNuevoRelacionesReferencia=true;
				this.isVisibilidadCeldaGuardarCambiosReferencia=true;
			}
			
			this.isVisibilidadCeldaModificarReferencia=false;
			this.isVisibilidadCeldaActualizarReferencia=false;
			this.isVisibilidadCeldaEliminarReferencia=false;
			this.isVisibilidadCeldaCancelarReferencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarReferencia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoReferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosReferencia=false;
			this.isVisibilidadCeldaModificarReferencia=false;
			this.isVisibilidadCeldaActualizarReferencia=true;
			this.isVisibilidadCeldaEliminarReferencia=false;
			this.isVisibilidadCeldaCancelarReferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarReferencia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoReferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosReferencia=false;
			this.isVisibilidadCeldaModificarReferencia=false;
			this.isVisibilidadCeldaActualizarReferencia=true;
			this.isVisibilidadCeldaEliminarReferencia=true;
			this.isVisibilidadCeldaCancelarReferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarReferencia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoReferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosReferencia=false;
			this.isVisibilidadCeldaModificarReferencia=false;
			this.isVisibilidadCeldaActualizarReferencia=true;
			this.isVisibilidadCeldaEliminarReferencia=false;
			this.isVisibilidadCeldaCancelarReferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferencia=false;
				} else {
					this.isVisibilidadCeldaGuardarReferencia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoReferencia=true;
			this.isVisibilidadCeldaNuevoRelacionesReferencia=true;
			this.isVisibilidadCeldaGuardarCambiosReferencia=true;
			this.isVisibilidadCeldaModificarReferencia=false;
			this.isVisibilidadCeldaActualizarReferencia=false;
			this.isVisibilidadCeldaEliminarReferencia=false;
			this.isVisibilidadCeldaCancelarReferencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarReferencia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoReferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosReferencia=false;
			this.isVisibilidadCeldaActualizarReferencia=false;
			this.isVisibilidadCeldaEliminarReferencia=false;
			this.isVisibilidadCeldaCancelarReferencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferencia=false;
				} else {
					this.isVisibilidadCeldaGuardarReferencia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoReferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosReferencia=false;
			this.isVisibilidadCeldaModificarReferencia=true;
			this.isVisibilidadCeldaActualizarReferencia=false;
			this.isVisibilidadCeldaEliminarReferencia=false;
			this.isVisibilidadCeldaCancelarReferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferencia=false;
				} else {
					this.isVisibilidadCeldaGuardarReferencia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ReferenciaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoReferencia=true;
			this.isVisibilidadCeldaNuevoRelacionesReferencia=true;
			this.isVisibilidadCeldaGuardarCambiosReferencia=true;
		} else {
			this.actualizarEstadoPanelsReferencia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarReferencia=false;
			//this.isVisibilidadCeldaVerFormReferencia=false;
			this.isVisibilidadCeldaDuplicarReferencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!referenciaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesReferencia=false;
		} else {
			this.isVisibilidadCeldaNuevoReferencia=false;
			this.isVisibilidadCeldaGuardarCambiosReferencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(referenciaSessionBean.getEsGuardarRelacionado()) {
			if(!referenciaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesReferencia=false;												
			}
			
			this.jButtonCerrarReferencia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesReferencia=false;
		}
		
		if(!this.permiteMantenimiento(this.referencia)) {
			this.isVisibilidadCeldaActualizarReferencia=false;
			this.isVisibilidadCeldaEliminarReferencia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesReferencia() {
		this.isVisibilidadCeldaNuevoReferencia=false;
		this.isVisibilidadCeldaGuardarCambiosReferencia=false;
	}
	
	public void actualizarEstadoPanelsReferencia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionReferencia!=null) {
				this.jScrollPanelDatosEdicionReferencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferencia!=null) {
				this.jTabbedPaneBusquedasReferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferencia!=null) {
				this.jScrollPanelDatosReferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferencia!=null) {
				this.jPanelPaginacionReferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferencia!=null) {
				this.jPanelParametrosReportesReferencia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionReferencia!=null) {
				this.jScrollPanelDatosEdicionReferencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferencia!=null) {
				this.jTabbedPaneBusquedasReferencia.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosReferencia!=null) {
				this.jScrollPanelDatosReferencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferencia!=null) {
				this.jPanelPaginacionReferencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferencia!=null) {
				this.jPanelParametrosReportesReferencia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionReferencia!=null) {
				this.jScrollPanelDatosEdicionReferencia.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferencia!=null) {
				this.jTabbedPaneBusquedasReferencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReferencia!=null) {
				this.jScrollPanelDatosReferencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferencia!=null) {
				this.jPanelPaginacionReferencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferencia!=null) {
				this.jPanelParametrosReportesReferencia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionReferencia!=null) {
				this.jScrollPanelDatosEdicionReferencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferencia!=null) {
				this.jTabbedPaneBusquedasReferencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReferencia!=null) {
				this.jScrollPanelDatosReferencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferencia!=null) {
				this.jPanelPaginacionReferencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferencia!=null) {
				this.jPanelParametrosReportesReferencia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionReferencia!=null) {
				this.jScrollPanelDatosEdicionReferencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferencia!=null) {
				this.jTabbedPaneBusquedasReferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferencia!=null) {
				this.jScrollPanelDatosReferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferencia!=null) {
				this.jPanelPaginacionReferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferencia!=null) {
				this.jPanelParametrosReportesReferencia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionReferencia!=null) {
				this.jScrollPanelDatosEdicionReferencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferencia!=null) {
				this.jTabbedPaneBusquedasReferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferencia!=null) {
				this.jScrollPanelDatosReferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferencia!=null) {
				this.jPanelPaginacionReferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferencia!=null) {
				this.jPanelParametrosReportesReferencia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionReferencia!=null) {
				this.jScrollPanelDatosEdicionReferencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferencia!=null) {
				this.jTabbedPaneBusquedasReferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferencia!=null) {
				this.jScrollPanelDatosReferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferencia!=null) {
				this.jPanelPaginacionReferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferencia!=null) {
				this.jPanelParametrosReportesReferencia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.referenciaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasReferencia!=null) {
					this.jTabbedPaneBusquedasReferencia.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesReferencia!=null) {
				this.jPanelParametrosReportesReferencia.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.referenciaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferencia!=null) {
				this.jTabbedPaneBusquedasReferencia.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesReferencia!=null) {
				this.jPanelParametrosReportesReferencia.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdEmpleadoReferencia);}

			this.isVisibilidadFK_IdParentezco=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdParentezco) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdParentezcoReferencia);}

			this.isVisibilidadFK_IdProfesion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProfesion) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdProfesionReferencia);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdEmpleadoReferencia);}

			this.isVisibilidadFK_IdParentezco=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdParentezco) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdParentezcoReferencia);}

			this.isVisibilidadFK_IdProfesion=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdProfesion) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdProfesionReferencia);}
		}
		
	}

	public void setVisibilidadBusquedasParaParentezco(Boolean isParaParentezco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaParentezcoNegation=!isParaParentezco;

			this.isVisibilidadFK_IdEmpleado=isParaParentezcoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdEmpleadoReferencia);}

			this.isVisibilidadFK_IdParentezco=isParaParentezco;
			if(!this.isVisibilidadFK_IdParentezco) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdParentezcoReferencia);}

			this.isVisibilidadFK_IdProfesion=isParaParentezcoNegation;
			if(!this.isVisibilidadFK_IdProfesion) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdProfesionReferencia);}
		}
		
	}

	public void setVisibilidadBusquedasParaProfesion(Boolean isParaProfesion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProfesionNegation=!isParaProfesion;

			this.isVisibilidadFK_IdEmpleado=isParaProfesionNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdEmpleadoReferencia);}

			this.isVisibilidadFK_IdParentezco=isParaProfesionNegation;
			if(!this.isVisibilidadFK_IdParentezco) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdParentezcoReferencia);}

			this.isVisibilidadFK_IdProfesion=isParaProfesion;
			if(!this.isVisibilidadFK_IdProfesion) {this.jTabbedPaneBusquedasReferencia.remove(jPanelFK_IdProfesionReferencia);}
		}
		
	}
	
	

	public String registrarSesionReferenciaParaTelefonoReferencias() throws Exception {
		Boolean isPaginaPopupTelefonoReferencia=false;

		try {

			if(this.referenciaSessionBean==null) {
				this.referenciaSessionBean=new ReferenciaSessionBean();
			}

			if(this.jInternalFrameDetalleFormReferencia.telefonoreferenciaSessionBean==null) {
				this.jInternalFrameDetalleFormReferencia.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
			}

			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaSessionBean.setsPathNavegacionActual(referenciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TelefonoReferenciaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTelefonoReferencia=this.jInternalFrameDetalleFormReferencia.telefonoreferenciaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTelefonoReferencia(true);
			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTelefonoReferencia(ReferenciaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaSessionBean.setisBusquedaDesdeForeignKeySesionReferencia(true);
			this.jInternalFrameDetalleFormReferencia.telefonoreferenciaSessionBean.setlidReferenciaActual(this.idReferenciaActual);

			referenciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyReferencia(true);
			referenciaSessionBean.setlIdReferenciaActualForeignKey(this.idReferenciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionReferenciaParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(referenciaSessionBean==null) {
				referenciaSessionBean=new ReferenciaSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(referenciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.referenciaFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(ReferenciaConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionReferencia(true);
			//empleadoSessionBean.setlidReferenciaActual(this.idReferenciaActual);

			referenciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyReferencia(true);
			referenciaSessionBean.setlIdReferenciaActualForeignKey(this.idReferenciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ReferenciaSessionBean referenciaSessionBean=new ReferenciaSessionBean();
		
		if(this.referenciaSessionBean==null) {
			this.referenciaSessionBean=new ReferenciaSessionBean();
		}
		
		this.referenciaSessionBean.setsUltimaBusquedaReferencia(this.getsAccionBusqueda());
		this.referenciaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.referenciaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			referenciaSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			referenciaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdParentezco")) {
			referenciaSessionBean.setid_parentezco(this.getid_parentezcoFK_IdParentezco());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProfesion")) {
			referenciaSessionBean.setid_profesion(this.getid_profesionFK_IdProfesion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ReferenciaSessionBean referenciaSessionBean=new ReferenciaSessionBean();
		
		if(this.referenciaSessionBean==null) {
			this.referenciaSessionBean=new ReferenciaSessionBean();
		}
		
		if(this.referenciaSessionBean.getsUltimaBusquedaReferencia()!=null&&!this.referenciaSessionBean.getsUltimaBusquedaReferencia().equals("")) {
			this.setsAccionBusqueda(referenciaSessionBean.getsUltimaBusquedaReferencia());
			this.setiNumeroPaginacion(referenciaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(referenciaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(referenciaSessionBean.getid_empleado());
				referenciaSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(referenciaSessionBean.getid_empresa());
				referenciaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdParentezco")) {
				this.setid_parentezcoFK_IdParentezco(referenciaSessionBean.getid_parentezco());
				referenciaSessionBean.setid_parentezco(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProfesion")) {
				this.setid_profesionFK_IdProfesion(referenciaSessionBean.getid_profesion());
				referenciaSessionBean.setid_profesion(-1L);
			}
		}
		
		this.referenciaSessionBean.setsUltimaBusquedaReferencia("");
		this.referenciaSessionBean.setiNumeroPaginacion(ReferenciaConstantesFunciones.INUMEROPAGINACION);
		this.referenciaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaReferencia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioReferencia() {
		this.updateBorderResaltarBusquedasFormularioReferencia();
		this.updateVisibilidadBusquedasFormularioReferencia();
		this.updateHabilitarBusquedasFormularioReferencia();
	}
	
	public void updateBorderResaltarBusquedasFormularioReferencia() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasReferencia.getComponents().length>0) {
	

		if(this.referenciaConstantesFunciones.resaltarFK_IdEmpleadoReferencia!=null) {
			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdEmpleadoReferencia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);
				jPanel.setBorder(this.referenciaConstantesFunciones.resaltarFK_IdEmpleadoReferencia);
			}
		}

		if(this.referenciaConstantesFunciones.resaltarFK_IdParentezcoReferencia!=null) {
			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdParentezcoReferencia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);
				jPanel.setBorder(this.referenciaConstantesFunciones.resaltarFK_IdParentezcoReferencia);
			}
		}

		if(this.referenciaConstantesFunciones.resaltarFK_IdProfesionReferencia!=null) {
			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdProfesionReferencia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);
				jPanel.setBorder(this.referenciaConstantesFunciones.resaltarFK_IdProfesionReferencia);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioReferencia() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasReferencia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdEmpleadoReferencia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciaConstantesFunciones.mostrarFK_IdEmpleadoReferencia);
			if(!this.referenciaConstantesFunciones.mostrarFK_IdEmpleadoReferencia && index>-1) {
				this.jTabbedPaneBusquedasReferencia.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdParentezcoReferencia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciaConstantesFunciones.mostrarFK_IdParentezcoReferencia);
			if(!this.referenciaConstantesFunciones.mostrarFK_IdParentezcoReferencia && index>-1) {
				this.jTabbedPaneBusquedasReferencia.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdProfesionReferencia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciaConstantesFunciones.mostrarFK_IdProfesionReferencia);
			if(!this.referenciaConstantesFunciones.mostrarFK_IdProfesionReferencia && index>-1) {
				this.jTabbedPaneBusquedasReferencia.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioReferencia() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasReferencia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdEmpleadoReferencia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciaConstantesFunciones.activarFK_IdEmpleadoReferencia);
				this.jTabbedPaneBusquedasReferencia.setEnabledAt(index,this.referenciaConstantesFunciones.activarFK_IdEmpleadoReferencia);
			}

			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdParentezcoReferencia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciaConstantesFunciones.activarFK_IdParentezcoReferencia);
				this.jTabbedPaneBusquedasReferencia.setEnabledAt(index,this.referenciaConstantesFunciones.activarFK_IdParentezcoReferencia);
			}

			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdProfesionReferencia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciaConstantesFunciones.activarFK_IdProfesionReferencia);
				this.jTabbedPaneBusquedasReferencia.setEnabledAt(index,this.referenciaConstantesFunciones.activarFK_IdProfesionReferencia);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaReferencia(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdEmpleadoReferencia);

			this.jTabbedPaneBusquedasReferencia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);

			this.referenciaConstantesFunciones.setResaltarFK_IdEmpleadoReferencia(resaltar);

			jPanel.setBorder(this.referenciaConstantesFunciones.resaltarFK_IdEmpleadoReferencia);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdParentezco")) {
			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdParentezcoReferencia);

			this.jTabbedPaneBusquedasReferencia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);

			this.referenciaConstantesFunciones.setResaltarFK_IdParentezcoReferencia(resaltar);

			jPanel.setBorder(this.referenciaConstantesFunciones.resaltarFK_IdParentezcoReferencia);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProfesion")) {
			index= this.jTabbedPaneBusquedasReferencia.indexOfComponent(this.jPanelFK_IdProfesionReferencia);

			this.jTabbedPaneBusquedasReferencia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferencia.getComponent(index);

			this.referenciaConstantesFunciones.setResaltarFK_IdProfesionReferencia(resaltar);

			jPanel.setBorder(this.referenciaConstantesFunciones.resaltarFK_IdProfesionReferencia);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarReferencia.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioReferencia() throws Exception {

		if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioReferencia();
		this.updateVisibilidadResaltarControlesFormularioReferencia();
		this.updateHabilitarResaltarControlesFormularioReferencia();
		
	}
	
	public void updateBorderResaltarControlesFormularioReferencia() throws Exception {
		if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.referenciaConstantesFunciones.resaltaridReferencia!=null && this.jInternalFrameDetalleFormReferencia!=null) {this.jInternalFrameDetalleFormReferencia.jLabelidReferencia.setBorder(this.referenciaConstantesFunciones.resaltaridReferencia);}
		if(this.referenciaConstantesFunciones.resaltarid_empresaReferencia!=null && this.jInternalFrameDetalleFormReferencia!=null) {this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.setBorder(this.referenciaConstantesFunciones.resaltarid_empresaReferencia);}
		if(this.referenciaConstantesFunciones.resaltarid_empleadoReferencia!=null && this.jInternalFrameDetalleFormReferencia!=null) {this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.setBorder(this.referenciaConstantesFunciones.resaltarid_empleadoReferencia);}
		if(this.referenciaConstantesFunciones.resaltarid_parentezcoReferencia!=null && this.jInternalFrameDetalleFormReferencia!=null) {this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.setBorder(this.referenciaConstantesFunciones.resaltarid_parentezcoReferencia);}
		if(this.referenciaConstantesFunciones.resaltarid_profesionReferencia!=null && this.jInternalFrameDetalleFormReferencia!=null) {this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.setBorder(this.referenciaConstantesFunciones.resaltarid_profesionReferencia);}
		if(this.referenciaConstantesFunciones.resaltarcedulaReferencia!=null && this.jInternalFrameDetalleFormReferencia!=null) {this.jInternalFrameDetalleFormReferencia.jTextFieldcedulaReferencia.setBorder(this.referenciaConstantesFunciones.resaltarcedulaReferencia);}
		if(this.referenciaConstantesFunciones.resaltarapellidoReferencia!=null && this.jInternalFrameDetalleFormReferencia!=null) {this.jInternalFrameDetalleFormReferencia.jTextFieldapellidoReferencia.setBorder(this.referenciaConstantesFunciones.resaltarapellidoReferencia);}
		if(this.referenciaConstantesFunciones.resaltarnombreReferencia!=null && this.jInternalFrameDetalleFormReferencia!=null) {this.jInternalFrameDetalleFormReferencia.jTextFieldnombreReferencia.setBorder(this.referenciaConstantesFunciones.resaltarnombreReferencia);}
		if(this.referenciaConstantesFunciones.resaltardireccionReferencia!=null && this.jInternalFrameDetalleFormReferencia!=null) {this.jInternalFrameDetalleFormReferencia.jTextAreadireccionReferencia.setBorder(this.referenciaConstantesFunciones.resaltardireccionReferencia);}
		if(this.referenciaConstantesFunciones.resaltartelefonoReferencia!=null && this.jInternalFrameDetalleFormReferencia!=null) {this.jInternalFrameDetalleFormReferencia.jTextFieldtelefonoReferencia.setBorder(this.referenciaConstantesFunciones.resaltartelefonoReferencia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioReferencia() throws Exception {		
		if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReferencia!=null) {
	
		//this.jInternalFrameDetalleFormReferencia.jLabelidReferencia.setVisible(this.referenciaConstantesFunciones.mostraridReferencia);
		this.jInternalFrameDetalleFormReferencia.jPanelidReferencia.setVisible(this.referenciaConstantesFunciones.mostraridReferencia);
		//this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.setVisible(this.referenciaConstantesFunciones.mostrarid_empresaReferencia);
		this.jInternalFrameDetalleFormReferencia.jPanelid_empresaReferencia.setVisible(this.referenciaConstantesFunciones.mostrarid_empresaReferencia);
		//this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.setVisible(this.referenciaConstantesFunciones.mostrarid_empleadoReferencia);
		this.jInternalFrameDetalleFormReferencia.jPanelid_empleadoReferencia.setVisible(this.referenciaConstantesFunciones.mostrarid_empleadoReferencia);
			this.jInternalFrameDetalleFormReferencia.jButtonid_empleadoReferencia.setVisible(this.referenciaConstantesFunciones.mostrarid_empleadoReferencia);
		//this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.setVisible(this.referenciaConstantesFunciones.mostrarid_parentezcoReferencia);
		this.jInternalFrameDetalleFormReferencia.jPanelid_parentezcoReferencia.setVisible(this.referenciaConstantesFunciones.mostrarid_parentezcoReferencia);
		//this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.setVisible(this.referenciaConstantesFunciones.mostrarid_profesionReferencia);
		this.jInternalFrameDetalleFormReferencia.jPanelid_profesionReferencia.setVisible(this.referenciaConstantesFunciones.mostrarid_profesionReferencia);
		//this.jInternalFrameDetalleFormReferencia.jTextFieldcedulaReferencia.setVisible(this.referenciaConstantesFunciones.mostrarcedulaReferencia);
		this.jInternalFrameDetalleFormReferencia.jPanelcedulaReferencia.setVisible(this.referenciaConstantesFunciones.mostrarcedulaReferencia);
		//this.jInternalFrameDetalleFormReferencia.jTextFieldapellidoReferencia.setVisible(this.referenciaConstantesFunciones.mostrarapellidoReferencia);
		this.jInternalFrameDetalleFormReferencia.jPanelapellidoReferencia.setVisible(this.referenciaConstantesFunciones.mostrarapellidoReferencia);
		//this.jInternalFrameDetalleFormReferencia.jTextFieldnombreReferencia.setVisible(this.referenciaConstantesFunciones.mostrarnombreReferencia);
		this.jInternalFrameDetalleFormReferencia.jPanelnombreReferencia.setVisible(this.referenciaConstantesFunciones.mostrarnombreReferencia);
		//this.jInternalFrameDetalleFormReferencia.jTextAreadireccionReferencia.setVisible(this.referenciaConstantesFunciones.mostrardireccionReferencia);
		this.jInternalFrameDetalleFormReferencia.jPaneldireccionReferencia.setVisible(this.referenciaConstantesFunciones.mostrardireccionReferencia);
		//this.jInternalFrameDetalleFormReferencia.jTextFieldtelefonoReferencia.setVisible(this.referenciaConstantesFunciones.mostrartelefonoReferencia);
		this.jInternalFrameDetalleFormReferencia.jPaneltelefonoReferencia.setVisible(this.referenciaConstantesFunciones.mostrartelefonoReferencia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioReferencia() throws Exception {
		if(this.jInternalFrameDetalleFormReferencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReferencia!=null) {
	
		this.jInternalFrameDetalleFormReferencia.jLabelidReferencia.setEnabled(this.referenciaConstantesFunciones.activaridReferencia);
		this.jInternalFrameDetalleFormReferencia.jComboBoxid_empresaReferencia.setEnabled(this.referenciaConstantesFunciones.activarid_empresaReferencia);
		this.jInternalFrameDetalleFormReferencia.jComboBoxid_empleadoReferencia.setEnabled(this.referenciaConstantesFunciones.activarid_empleadoReferencia);
			this.jInternalFrameDetalleFormReferencia.jButtonid_empleadoReferencia.setEnabled(this.referenciaConstantesFunciones.activarid_empleadoReferencia);
		this.jInternalFrameDetalleFormReferencia.jComboBoxid_parentezcoReferencia.setEnabled(this.referenciaConstantesFunciones.activarid_parentezcoReferencia);
		this.jInternalFrameDetalleFormReferencia.jComboBoxid_profesionReferencia.setEnabled(this.referenciaConstantesFunciones.activarid_profesionReferencia);
		this.jInternalFrameDetalleFormReferencia.jTextFieldcedulaReferencia.setEnabled(this.referenciaConstantesFunciones.activarcedulaReferencia);
		this.jInternalFrameDetalleFormReferencia.jTextFieldapellidoReferencia.setEnabled(this.referenciaConstantesFunciones.activarapellidoReferencia);
		this.jInternalFrameDetalleFormReferencia.jTextFieldnombreReferencia.setEnabled(this.referenciaConstantesFunciones.activarnombreReferencia);
		this.jInternalFrameDetalleFormReferencia.jTextAreadireccionReferencia.setEnabled(this.referenciaConstantesFunciones.activardireccionReferencia);
		this.jInternalFrameDetalleFormReferencia.jTextFieldtelefonoReferencia.setEnabled(this.referenciaConstantesFunciones.activartelefonoReferencia);
		}
	}
	
		
}