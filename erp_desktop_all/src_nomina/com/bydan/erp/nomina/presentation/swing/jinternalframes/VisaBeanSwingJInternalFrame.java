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

import com.bydan.erp.nomina.util.VisaConstantesFunciones;
import com.bydan.erp.nomina.util.VisaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.VisaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.VisaBean;
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
public class VisaBeanSwingJInternalFrame extends VisaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VisaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Visa> visaValidator = new ClassValidator<Visa>(Visa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Visa visa;	
	public Visa visaAux;
	public Visa visaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Visa visaTotales;
	public Long idVisaActual;
	public Long iIdNuevoVisa=0L;
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

	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
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
	
	public Boolean isPermisoTodoVisa;
	public Boolean isPermisoNuevoVisa;
	public Boolean isPermisoActualizarVisa;
	public Boolean isPermisoActualizarOriginalVisa;
	public Boolean isPermisoEliminarVisa;
	public Boolean isPermisoGuardarCambiosVisa;
	public Boolean isPermisoConsultaVisa;
	public Boolean isPermisoBusquedaVisa;
	public Boolean isPermisoReporteVisa;
	public Boolean isPermisoPaginacionMedioVisa;
	public Boolean isPermisoPaginacionAltoVisa;
	public Boolean isPermisoPaginacionTodoVisa;
	public Boolean isPermisoCopiarVisa;
	public Boolean isPermisoVerFormVisa;
	public Boolean isPermisoDuplicarVisa;
	public Boolean isPermisoOrdenVisa;
	
	
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
	
	public VisaParameterReturnGeneral visaReturnGeneral;
	public VisaParameterReturnGeneral visaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVisa=false;
	public Boolean esParaAccionDesdeFormularioVisa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VisaSessionBeanAdditional visaSessionBeanAdditional=null;
	
	public VisaSessionBeanAdditional getVisaSessionBeanAdditional() {
		return this.visaSessionBeanAdditional;
	}
	
	public void setVisaSessionBeanAdditional(VisaSessionBeanAdditional visaSessionBeanAdditional) {
		try {
			this.visaSessionBeanAdditional=visaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VisaBeanSwingJInternalFrameAdditional visaBeanSwingJInternalFrameAdditional=null;
	//public class VisaBeanSwingJInternalFrame
	
	public VisaBeanSwingJInternalFrameAdditional getVisaBeanSwingJInternalFrameAdditional() {
		return this.visaBeanSwingJInternalFrameAdditional;
	}
	
	public void setVisaBeanSwingJInternalFrameAdditional(VisaBeanSwingJInternalFrameAdditional visaBeanSwingJInternalFrameAdditional) {
		try {
			this.visaBeanSwingJInternalFrameAdditional=visaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VisaLogic visaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Visa visaBean;
	public VisaConstantesFunciones visaConstantesFunciones;
	//public VisaParameterReturnGeneral visaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public PaisLogic paisLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<Visa> visas;	
	//public List<Visa> visasEliminados;
	//public List<Visa> visasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVisa=false;
	public Boolean isVisibilidadCeldaDuplicarVisa=true;
	public Boolean isVisibilidadCeldaCopiarVisa=true;
	public Boolean isVisibilidadCeldaVerFormVisa=true;
	public Boolean isVisibilidadCeldaOrdenVisa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVisa=false;
	public Boolean isVisibilidadCeldaModificarVisa=false;
	public Boolean isVisibilidadCeldaActualizarVisa=false;
	public Boolean isVisibilidadCeldaEliminarVisa=false;
	public Boolean isVisibilidadCeldaCancelarVisa=false;
	public Boolean isVisibilidadCeldaGuardarVisa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVisa=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoVisa() {
		return this.iIdNuevoVisa;
	}

	public void setiIdNuevoVisa(Long iIdNuevoVisa) {
		this.iIdNuevoVisa = iIdNuevoVisa;
	}
	
	public Long getidVisaActual() {
		return this.idVisaActual;
	}

	public void setidVisaActual(Long idVisaActual) {
		this.idVisaActual = idVisaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Visa getvisa() {
		return this.visa;
	}

	public void setvisa(Visa visa) {
		this.visa = visa;
	}
	
	public Visa getvisaAux() {
		return this.visaAux;
	}

	public void setvisaAux(Visa visaAux) {
		this.visaAux = visaAux;
	}				
	
	public Visa getvisaAnterior() {
		return this.visaAnterior;
	}

	public void setvisaAnterior(Visa visaAnterior) {
		this.visaAnterior = visaAnterior;
	}	
	
	public Visa getvisaTotales() {
		return this.visaTotales;
	}

	public void setvisaTotales(Visa visaTotales) {
		this.visaTotales = visaTotales;
	}	
	
	public Visa getvisaBean() {
		return this.visaBean;
	}

	public void setvisaBean(Visa visaBean) {
		this.visaBean = visaBean;
	}	
	
	public VisaParameterReturnGeneral getvisaReturnGeneral() {
		return this.visaReturnGeneral;
	}

	public void setvisaReturnGeneral(VisaParameterReturnGeneral visaReturnGeneral) {
		this.visaReturnGeneral = visaReturnGeneral;
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

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VisaLogic getVisaLogic()	{		
		return visaLogic;
	}

	public void setVisaLogic(VisaLogic visaLogic) {
		this.visaLogic = visaLogic;
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
	
	public Boolean getIsEsNuevoVisa() {
		return isEsNuevoVisa;
	}

	public void setIsEsNuevoVisa(Boolean isEsNuevoVisa) {
		this.isEsNuevoVisa = isEsNuevoVisa;
	}

	public Boolean getEsParaAccionDesdeFormularioVisa() {
		return esParaAccionDesdeFormularioVisa;
	}
	
	public void setEsParaAccionDesdeFormularioVisa(Boolean esParaAccionDesdeFormularioVisa) {
		this.esParaAccionDesdeFormularioVisa = esParaAccionDesdeFormularioVisa;
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

			if(this.visaSessionBean==null) {
				this.visaSessionBean=new VisaSessionBean();
			}

			if(!this.visaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(visaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.visaSessionBean==null) {
				this.visaSessionBean=new VisaSessionBean();
			}

			if(!this.visaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(visaSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

			if(this.visaSessionBean==null) {
				this.visaSessionBean=new VisaSessionBean();
			}

			if(!this.visaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(visaSessionBean.getlidEmpleadoActual());
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

					if(this.visa!=null) {
						this.visa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVisa!=null) {
						this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVisa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVisa!=null) {
						if(this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.getItemCount()>0) {
							this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVisaGenerico)throws Exception
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
				jComboBoxid_empresaVisaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVisaGenerico!=null && jComboBoxid_empresaVisaGenerico.getItemCount()>0) {
					jComboBoxid_empresaVisaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.visa!=null) {
						this.visa.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormVisa!=null) {
						this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisVisa.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormVisa!=null) {
						if(this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.getItemCount()>0) {
							this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisVisa!=null) {
						jComboBoxid_paisFK_IdPaisVisa.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisVisa!=null) {
							//jComboBoxid_paisFK_IdPaisVisa.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisVisa.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisVisa.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisVisaGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisVisaGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisVisaGenerico!=null && jComboBoxid_paisVisaGenerico.getItemCount()>0) {
					jComboBoxid_paisVisaGenerico.setSelectedIndex(0);
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

					if(this.visa!=null) {
						this.visa.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormVisa!=null) {
						this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoVisa.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormVisa!=null) {
						if(this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.getItemCount()>0) {
							this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoVisa!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoVisa.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoVisa!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoVisa.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoVisa.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoVisa.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoVisaGenerico)throws Exception
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
				jComboBoxid_empleadoVisaGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoVisaGenerico!=null && jComboBoxid_empleadoVisaGenerico.getItemCount()>0) {
					jComboBoxid_empleadoVisaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Visa visa,JComboBox jComboBoxid_empresaVisaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVisaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVisaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				visa.setid_empresa(empresaAux.getId());
				visa.setempresa_descripcion(VisaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				visa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(Visa visa,JComboBox jComboBoxid_paisVisaGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisVisaGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisVisaGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				visa.setid_pais(paisAux.getId());
				visa.setpais_descripcion(VisaConstantesFunciones.getPaisDescripcion(paisAux));
				visa.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(Visa visa,JComboBox jComboBoxid_empleadoVisaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoVisaGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoVisaGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				visa.setid_empleado(empleadoAux.getId());
				visa.setempleado_descripcion(VisaConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				visa.setEmpleado(empleadoAux);			}
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

					if(!VisaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVisa!=null) { 
							this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVisa!=null) { 
					}

					if(!VisaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VisaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVisa!=null) { 
							this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVisa!=null) { 
					}

					if(!VisaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VisaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisVisa.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisVisa.addItem(pais);
							}
						}

						if(!VisaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!VisaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVisa!=null) { 
							this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVisa!=null) { 
					}

					if(!VisaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VisaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoVisa.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoVisa.addItem(empleado);
							}
						}

						if(!VisaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVisa!=null) {
							this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVisa!=null) {
							this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVisa!=null) {
							this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormVisa!=null) {
							this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisVisa.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisVisa.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormVisa!=null) {
							this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormVisa!=null) {
							this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoVisa.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoVisa.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesVisa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			VisaConstantesFunciones.refrescarForeignKeysDescripcionesVisa(this.visaLogic.getVisas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			VisaConstantesFunciones.refrescarForeignKeysDescripcionesVisa(this.visas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//visaLogic.setVisas(this.visas);
			visaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public VisaParameterReturnGeneral getVisaParameterGeneral() {
		return this.visaParameterGeneral;
	}
	
	public void setVisaParameterGeneral(VisaParameterReturnGeneral visaParameterGeneral) {
		this.visaParameterGeneral = visaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVisa() {
		return isPermisoTodoVisa;
	}

	public void setIsPermisoTodoVisa(Boolean isPermisoTodoVisa) {
		this.isPermisoTodoVisa = isPermisoTodoVisa;
	}

	public Boolean getIsPermisoNuevoVisa() {
		return isPermisoNuevoVisa;
	}

	public void setIsPermisoNuevoVisa(Boolean isPermisoNuevoVisa) {
		this.isPermisoNuevoVisa = isPermisoNuevoVisa;
	}

	public Boolean getIsPermisoActualizarVisa() {
		return isPermisoActualizarVisa;
	}

	public void setIsPermisoActualizarVisa(Boolean isPermisoActualizarVisa) {
		this.isPermisoActualizarVisa = isPermisoActualizarVisa;
	}

	public Boolean getIsPermisoEliminarVisa() {
		return isPermisoEliminarVisa;
	}

	public void setIsPermisoEliminarVisa(Boolean isPermisoEliminarVisa) {
		this.isPermisoEliminarVisa = isPermisoEliminarVisa;
	}

	public Boolean getIsPermisoGuardarCambiosVisa() {
		return isPermisoGuardarCambiosVisa;
	}

	public void setIsPermisoGuardarCambiosVisa(Boolean isPermisoGuardarCambiosVisa) {
		this.isPermisoGuardarCambiosVisa = isPermisoGuardarCambiosVisa;
	}
	
	public Boolean getIsPermisoConsultaVisa() {
		return isPermisoConsultaVisa;
	}

	public void setIsPermisoConsultaVisa(Boolean isPermisoConsultaVisa) {
		this.isPermisoConsultaVisa = isPermisoConsultaVisa;
	}

	public Boolean getIsPermisoBusquedaVisa() {
		return isPermisoBusquedaVisa;
	}

	public void setIsPermisoBusquedaVisa(Boolean isPermisoBusquedaVisa) {
		this.isPermisoBusquedaVisa = isPermisoBusquedaVisa;
	}

	public Boolean getIsPermisoReporteVisa() {
		return isPermisoReporteVisa;
	}

	public void setIsPermisoReporteVisa(Boolean isPermisoReporteVisa) {
		this.isPermisoReporteVisa = isPermisoReporteVisa;
	}
	
	public Boolean getIsPermisoPaginacionMedioVisa() {
		return isPermisoPaginacionMedioVisa;
	}

	public void setIsPermisoPaginacionMedioVisa(Boolean isPermisoPaginacionMedioVisa) {
		this.isPermisoPaginacionMedioVisa = isPermisoPaginacionMedioVisa;
	}
	
	public Boolean getIsPermisoPaginacionTodoVisa() {
		return isPermisoPaginacionTodoVisa;
	}

	public void setIsPermisoPaginacionTodoVisa(Boolean isPermisoPaginacionTodoVisa) {
		this.isPermisoPaginacionTodoVisa = isPermisoPaginacionTodoVisa;
	}
	
	public Boolean getIsPermisoPaginacionAltoVisa() {
		return isPermisoPaginacionAltoVisa;
	}

	public void setIsPermisoPaginacionAltoVisa(Boolean isPermisoPaginacionAltoVisa) {
		this.isPermisoPaginacionAltoVisa = isPermisoPaginacionAltoVisa;
	}
	
	public Boolean getIsPermisoCopiarVisa() {
		return isPermisoCopiarVisa;
	}

	public void setIsPermisoCopiarVisa(Boolean isPermisoCopiarVisa) {
		this.isPermisoCopiarVisa = isPermisoCopiarVisa;
	}
	
	public Boolean getIsPermisoVerFormVisa() {
		return isPermisoVerFormVisa;
	}

	public void setIsPermisoVerFormVisa(Boolean isPermisoVerFormVisa) {
		this.isPermisoVerFormVisa = isPermisoVerFormVisa;
	}
	
	public Boolean getIsPermisoDuplicarVisa() {
		return isPermisoDuplicarVisa;
	}

	public void setIsPermisoDuplicarVisa(Boolean isPermisoDuplicarVisa) {
		this.isPermisoDuplicarVisa = isPermisoDuplicarVisa;
	}
	
	public Boolean getIsPermisoOrdenVisa() {
		return isPermisoOrdenVisa;
	}

	public void setIsPermisoOrdenVisa(Boolean isPermisoOrdenVisa) {
		this.isPermisoOrdenVisa = isPermisoOrdenVisa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVisa() {
		return isVisibilidadCeldaNuevoVisa;
	}

	public void setIsVisibilidadCeldaNuevoVisa(Boolean isVisibilidadCeldaNuevoVisa) {
		this.isVisibilidadCeldaNuevoVisa = isVisibilidadCeldaNuevoVisa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVisa() {
		return isVisibilidadCeldaDuplicarVisa;
	}

	public void setIsVisibilidadCeldaDuplicarVisa(Boolean isVisibilidadCeldaDuplicarVisa) {
		this.isVisibilidadCeldaDuplicarVisa = isVisibilidadCeldaDuplicarVisa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVisa() {
		return isVisibilidadCeldaCopiarVisa;
	}

	public void setIsVisibilidadCeldaCopiarVisa(Boolean isVisibilidadCeldaCopiarVisa) {
		this.isVisibilidadCeldaCopiarVisa = isVisibilidadCeldaCopiarVisa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVisa() {
		return isVisibilidadCeldaVerFormVisa;
	}

	public void setIsVisibilidadCeldaVerFormVisa(Boolean isVisibilidadCeldaVerFormVisa) {
		this.isVisibilidadCeldaVerFormVisa = isVisibilidadCeldaVerFormVisa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVisa() {
		return isVisibilidadCeldaOrdenVisa;
	}

	public void setIsVisibilidadCeldaOrdenVisa(Boolean isVisibilidadCeldaOrdenVisa) {
		this.isVisibilidadCeldaOrdenVisa = isVisibilidadCeldaOrdenVisa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVisa() {
		return isVisibilidadCeldaNuevoRelacionesVisa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVisa(Boolean isVisibilidadCeldaNuevoRelacionesVisa) {
		this.isVisibilidadCeldaNuevoRelacionesVisa = isVisibilidadCeldaNuevoRelacionesVisa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVisa() {
		return isVisibilidadCeldaModificarVisa;
	}

	public void setIsVisibilidadCeldaModificarVisa(Boolean isVisibilidadCeldaModificarVisa) {
		this.isVisibilidadCeldaModificarVisa = isVisibilidadCeldaModificarVisa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVisa() {
		return isVisibilidadCeldaActualizarVisa;
	}

	public void setIsVisibilidadCeldaActualizarVisa(Boolean isVisibilidadCeldaActualizarVisa) {
		this.isVisibilidadCeldaActualizarVisa = isVisibilidadCeldaActualizarVisa;
	}

	public Boolean getIsVisibilidadCeldaEliminarVisa() {
		return isVisibilidadCeldaEliminarVisa;
	}

	public void setIsVisibilidadCeldaEliminarVisa(Boolean isVisibilidadCeldaEliminarVisa) {
		this.isVisibilidadCeldaEliminarVisa = isVisibilidadCeldaEliminarVisa;
	}

	public Boolean getIsVisibilidadCeldaCancelarVisa() {
		return isVisibilidadCeldaCancelarVisa;
	}

	public void setIsVisibilidadCeldaCancelarVisa(Boolean isVisibilidadCeldaCancelarVisa) {
		this.isVisibilidadCeldaCancelarVisa = isVisibilidadCeldaCancelarVisa;
	}

	public Boolean getIsVisibilidadCeldaGuardarVisa() {
		return isVisibilidadCeldaGuardarVisa;
	}

	public void setIsVisibilidadCeldaGuardarVisa(Boolean isVisibilidadCeldaGuardarVisa) {
		this.isVisibilidadCeldaGuardarVisa = isVisibilidadCeldaGuardarVisa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVisa() {
		return isVisibilidadCeldaGuardarCambiosVisa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVisa(Boolean isVisibilidadCeldaGuardarCambiosVisa) {
		this.isVisibilidadCeldaGuardarCambiosVisa = isVisibilidadCeldaGuardarCambiosVisa;
	}
		
	public VisaSessionBean getvisaSessionBean() {
		return this.visaSessionBean;
	}
	
	public void setvisaSessionBean(VisaSessionBean visaSessionBean) {
		this.visaSessionBean=visaSessionBean;
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

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVisa(Visa visa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(visa,null);
				this.setActualParaGuardarPaisForeignKey(visa,null);
				this.setActualParaGuardarEmpleadoForeignKey(visa,null);
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
	
	public void bugActualizarReferenciaActual(Visa visa,Visa visaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVisa(visa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		visaAux.setId(visa.getId());
		visaAux.setVersionRow(visa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessVisa();
		
			int intSelectedRow = this.jTableDatosVisa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(VisaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualVisa(this.visa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = visaValidator.getInvalidValues(this.visa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			visaLogic.setDatosCliente(datosCliente);
			visaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				visaAux=new  Visa();
				
				visaAux.setIsNew(true);
				visaAux.setIsChanged(true);
				
				visaAux.setVisaOriginal(this.visa);
				
				visaAux.setId(this.visa.getId());	
				visaAux.setVersionRow(this.visa.getVersionRow());	
				visaAux.setid_empresa(this.visa.getid_empresa());	
				visaAux.setid_pais(this.visa.getid_pais());	
				visaAux.setid_empleado(this.visa.getid_empleado());	
				visaAux.setdescripcion(this.visa.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.visaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.visaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(visaAux,visaLogic.getVisas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(visaAux,visas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.visaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.visaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						visaLogic.saveVisas();//WithConnection
						//visaLogic.getSetVersionRowVisas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.visa,visaAux);
					
					this.refrescarForeignKeysDescripcionesVisa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.visaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.visaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								visaLogic.saveVisaRelaciones(visaAux);//WithConnection
								//visaLogic.getSetVersionRowVisas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.visa,visaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.visaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.visaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(visaAux,visaLogic.getVisas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(visaAux,visas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.visa,visaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				visaAux=new  Visa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.visaSessionBean.getEsGuardarRelacionado() 
					|| (this.visaSessionBean.getEsGuardarRelacionado() && this.visa.getId()>=0)) {
						
					visaAux.setIsNew(false);
				}
				
				visaAux.setIsDeleted(false);
			
				visaAux.setId(this.visa.getId());	
				visaAux.setVersionRow(this.visa.getVersionRow());	
				visaAux.setid_empresa(this.visa.getid_empresa());	
				visaAux.setid_pais(this.visa.getid_pais());	
				visaAux.setid_empleado(this.visa.getid_empleado());	
				visaAux.setdescripcion(this.visa.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(visaAux,visaLogic.getVisas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(visaAux,visas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.visaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.visaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						visaLogic.saveVisas();//WithConnection
						//visaLogic.getSetVersionRowVisas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.visa,visaAux);
					
					this.refrescarForeignKeysDescripcionesVisa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.visaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.visaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								visaLogic.saveVisaRelaciones(visaAux);//WithConnection
								//visaLogic.getSetVersionRowVisas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.visa,visaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.visaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.visaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(visaAux,visaLogic.getVisas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(visaAux,visas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.visa,visaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				visaAux=new  Visa();
				
				visaAux.setIsNew(false);
				visaAux.setIsChanged(false);
				
				visaAux.setIsDeleted(true);
				
				visaAux.setId(this.visa.getId());	
				visaAux.setVersionRow(this.visa.getVersionRow());	
				visaAux.setid_empresa(this.visa.getid_empresa());	
				visaAux.setid_pais(this.visa.getid_pais());	
				visaAux.setid_empleado(this.visa.getid_empleado());	
				visaAux.setdescripcion(this.visa.getdescripcion());	
				
				if(this.visaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.visaAux.getId()>=0) {	
						this.visasEliminados.add(visaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(visaAux,visaLogic.getVisas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(visaAux,visas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.visaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.visaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						visaLogic.saveVisas();//WithConnection
						//visaLogic.getSetVersionRowVisas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.visaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.visaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								visaLogic.saveVisaRelaciones(visaAux);//WithConnection
								//visaLogic.getSetVersionRowVisas();//WithConnection
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
							if(this.visaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.visaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(visaAux,visaLogic.getVisas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(visaAux,visas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.getVisas().addAll(this.visasEliminados);
					
					visaLogic.saveVisas();//WithConnection
					//visaLogic.getSetVersionRowVisas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesVisa();
				
				this.visasEliminados= new ArrayList<Visa>();		
			}
			
			if(this.visaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Visa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Visa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.visa=visaAux;
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
      		//this.finishProcessVisa();
      	}
		
	}	
	
	public void actualizarRelaciones(Visa visaLocal) throws Exception {
		
		if(this.visaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Visa visaLocal) throws Exception {	
		if(this.visaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				visaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				visaLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				visaLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVisaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVisa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = visaValidator.getInvalidValues(this.visa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Visa visa,List<Visa> visas) throws Exception {
		try	{		
			VisaConstantesFunciones.actualizarLista(visa,visas,this.visaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Visa visa,List<Visa> visas) throws Exception {
		try	{			
			VisaConstantesFunciones.actualizarSelectedLista(visa,visas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Visa> visasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				visasLocal=this.visaLogic.getVisas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				visasLocal=this.visas;
			}
			//ARCHITECTURE
		
			for(Visa visaLocal:visasLocal) {
				if(this.permiteMantenimiento(visaLocal) && visaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VisaConstantesFunciones.getVisaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VisaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisa.jLabelid_empresaVisa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisaConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisa.jLabelid_paisVisa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisaConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisa.jLabelid_empleadoVisa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisa.jLabeldescripcionVisa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVisa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisa.jLabelid_empresaVisa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisa.jLabelid_paisVisa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisa.jLabelid_empleadoVisa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisa.jLabeldescripcionVisa,"");
		
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
		this.iIdNuevoVisa--;	
		
		
		this.visaAux=new Visa();
		
		this.visaAux.setId(this.iIdNuevoVisa);
		this.visaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.visaLogic.getVisas().add(this.visaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.visas.add(this.visaAux);
		}
		//ARCHITECTURE
		
		this.visa=this.visaAux;
		
		if(VisaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVisa(this.visa);
			this.setVariablesObjetoActualToFormularioForeignKeyVisa(this.visa);
		}
				
		//this.setDefaultControlesVisa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVisa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVisa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVisa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVisa(this.visaBean,this.visa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(VisaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.visaSessionBean.getConGuardarRelaciones()) {
			classes=VisaConstantesFunciones.getClassesRelationshipsOfVisa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.visaReturnGeneral=visaLogic.procesarEventosVisasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.visaLogic.getVisas(),this.visa,this.visaParameterGeneral,this.isEsNuevoVisa,classes);//this.visaLogic.getVisa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVisa(this.visaReturnGeneral,this.visaBean,false);
		
		if(this.visaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVisa(this.visaReturnGeneral.getVisa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVisa(this.visaReturnGeneral.getVisa());
		}
		
		if(this.visaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVisa(this.visaReturnGeneral.getVisa(),classes);//this.visaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVisa(this.visa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVisa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVisa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VisaBeanSwingJInternalFrameAdditional.RecargarFormVisa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVisa(false);
						
			if(visaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VisaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVisa();
			}
			
			this.actualizarVisualTableDatosVisa();
			
			this.jTableDatosVisa.setRowSelectionInterval(this.getIndiceNuevoVisa(), this.getIndiceNuevoVisa());
			
			this.seleccionarFilaTablaVisaActual();
						
			this.actualizarEstadoCeldasBotonesVisa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVisa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVisa.jTextAreadescripcionVisa.setEnabled(isHabilitar && this.visaConstantesFunciones.activardescripcionVisa);	
		//
		this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.setEnabled(isHabilitar && this.visaConstantesFunciones.activarid_empresaVisa);
		this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.setEnabled(isHabilitar && this.visaConstantesFunciones.activarid_paisVisa);
		this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.setEnabled(isHabilitar && this.visaConstantesFunciones.activarid_empleadoVisa);
	};
	
	public void setDefaultControlesVisa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVisa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.visaSessionBean.setConGuardarRelaciones(true);			
			this.visaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVisa.jTabbedPaneRelacionesVisa.setVisible(true);
			
					
		} else {
			//this.visaSessionBean.setConGuardarRelaciones(false);			
			this.visaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVisa.jTabbedPaneRelacionesVisa.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVisa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Visa visaAux:this.visaLogic.getVisas()) {
				if(visaAux.getId().equals(this.iIdNuevoVisa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Visa visaAux:this.visas) {
				if(visaAux.getId().equals(this.iIdNuevoVisa)) {
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
	
	public int getIndiceActualVisa(Visa visa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Visa visaAux:this.visaLogic.getVisas()) {
				if(visaAux.getId().equals(visa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Visa visaAux:this.visas) {
				if(visaAux.getId().equals(visa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVisa(Visa visaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Visa visaAux:this.visaLogic.getVisas()) {
				if(visaAux.getVisaOriginal().getId().equals(visaOriginal.getId())) {
					existe=true;
					visaOriginal.setId(visaAux.getId());
					visaOriginal.setVersionRow(visaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Visa visaAux:this.visas) {
				if(visaAux.getVisaOriginal().getId().equals(visaOriginal.getId())) {
					existe=true;
					visaOriginal.setId(visaAux.getId());
					visaOriginal.setVersionRow(visaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVisa(Boolean esParaCancelar) throws Exception {
		visasAux=new ArrayList<Visa>();
		visaAux=new Visa();
		
		if(!this.visaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Visa visaAux:this.visaLogic.getVisas()) {
					if(visaAux.getId()<0) {
						visasAux.add(visaAux);
					}		
				}
				this.iIdNuevoVisa=0L;
				this.visaLogic.getVisas().removeAll(visasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Visa visaAux:this.visas) {
					if(visaAux.getId()<0) {
						visasAux.add(visaAux);
					}		
				}
				this.iIdNuevoVisa=0L;
				this.visas.removeAll(visasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVisa 
					&& this.visaLogic.getVisas().size()>0
					) {
					visaAux=this.visaLogic.getVisas().get(this.visaLogic.getVisas().size() - 1);
				
					if(visaAux.getId()<0) {
						this.visaLogic.getVisas().remove(visaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVisa && this.visas.size()>0) {
					visaAux=this.visas.get(this.visas.size() - 1);
				
					if(visaAux.getId()<0) {
						this.visas.remove(visaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVisa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(visa.getId()<0) {
				this.visaLogic.getVisas().remove(this.visa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(visa.getId()<0) {
				this.visas.remove(this.visa);
			}
		}			
	}
	
	public void setEstadosInicialesVisa(List<Visa> visasAux) throws Exception {
		VisaConstantesFunciones.setEstadosInicialesVisa(visasAux);
	}
	
	public void setEstadosInicialesVisa(Visa visaAux) throws Exception {
		VisaConstantesFunciones.setEstadosInicialesVisa(visaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVisaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVisa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVisaActual()) {
				if(!this.isEsNuevoVisa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVisa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVisa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVisaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Visa ?", "MANTENIMIENTO DE Visa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVisa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Visa visa) throws Exception {
		VisaConstantesFunciones.seleccionarAsignar(this.visa,visa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVisa=this.isPermisoActualizarOriginalVisa;
			
			
			this.seleccionarAsignar(visa);
			
			

			idEmpleadoActual=visa.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VisaConstantesFunciones.quitarEspaciosVisa(this.visa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesVisa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.visaSessionBean.setsFuncionBusquedaRapida(this.visaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoVisa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVisa(esParaCancelar);				
				this.cancelarNuevoVisa(esParaCancelar);								
			}
			
			this.visa=new Visa();
			
			this.inicializarVisa();
			
			this.actualizarEstadoCeldasBotonesVisa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVisa() throws Exception {
		try {
			VisaConstantesFunciones.inicializarVisa(this.visa);
			
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
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.visaLogic.getVisas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVisas(String sAccionBusqueda,List<Visa> visasParaReportes) throws Exception {
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
					sPathReporteFinal="Visa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VisaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VisaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Visa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Visas");		
		parameters.put("busquedapor", VisaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVisa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VisaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VisaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVisa=new JRBeanArrayDataSource(VisaJInternalFrame.TraerVisaBeans(visasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVisa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VisaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VisaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VisaBean.TraerVisaBeans(visasParaReportes).toArray()));
							
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
				this.generarExcelReporteVisas(sAccionBusqueda,sTipoArchivoReporte,visasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVisas(sAccionBusqueda,sTipoArchivoReporte,visasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVisaActionPerformed(null);
					//this.generarExcelReporteVisas(sAccionBusqueda,sTipoArchivoReporte,visasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVisas(sAccionBusqueda,sTipoArchivoReporte,visasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVisas(sAccionBusqueda,sTipoArchivoReporte,visasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVisas(sAccionBusqueda,sTipoArchivoReporte,visasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVisas(String sAccionBusqueda,String sTipoArchivoReporte,List<Visa> visasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Visas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVisa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Visa visa : visasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VisaConstantesFunciones.generarExcelReporteDataVisa("NORMAL",row,workbook,visa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVisa(String sTipo,Row row,Workbook workbook) {
		
		VisaConstantesFunciones.generarExcelReporteHeaderVisa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVisas(String sAccionBusqueda,String sTipoArchivoReporte,List<Visa> visasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Visas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Visa visa : visasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VisaConstantesFunciones.getVisaDescripcion(visa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(visa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisaConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisaConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(visa.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisaConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisaConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(visa.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(visa.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVisas(String sAccionBusqueda,String sTipoArchivoReporte,List<Visa> visasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Visa> visasRespaldo=null;
		
		classes=VisaConstantesFunciones.getClassesRelationshipsOfVisa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.visaLogic.setDatosCliente(this.datosCliente);
		this.visaLogic.setDatosDeep(this.datosDeep);
		this.visaLogic.setIsConDeep(true);
		
		visasRespaldo=this.visaLogic.getVisas();
		
		this.visaLogic.setVisas(visasParaReportes);	
		this.visaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		visasParaReportes=this.visaLogic.getVisas();
		this.visaLogic.setVisas(visasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Visas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVisa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Visa visa : visasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVisa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VisaConstantesFunciones.generarExcelReporteDataVisa("NORMAL",row,workbook,visa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VisaConstantesFunciones.getVisaDescripcion(visa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVisa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVisa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVisa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVisa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVisa() throws Exception {		
		this.startProcessVisa(true);
	}
	
	public void startProcessVisa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVisa ,this.jPanelParametrosReportesVisa, this.jScrollPanelDatosVisa,this.jPanelPaginacionVisa, this.jScrollPanelDatosEdicionVisa, this.jPanelAccionesVisa,this.jPanelAccionesFormularioVisa,this.jmenuBarVisa,this.jmenuBarDetalleVisa,this.jTtoolBarVisa,this.jTtoolBarDetalleVisa);		
		
		final JTabbedPane jTabbedPaneBusquedasVisa=this.jTabbedPaneBusquedasVisa; 
		
		final JPanel jPanelParametrosReportesVisa=this.jPanelParametrosReportesVisa;
		//final JScrollPane jScrollPanelDatosVisa=this.jScrollPanelDatosVisa;
		final JTable jTableDatosVisa=this.jTableDatosVisa;		
		final JPanel jPanelPaginacionVisa=this.jPanelPaginacionVisa;
		//final JScrollPane jScrollPanelDatosEdicionVisa=this.jScrollPanelDatosEdicionVisa;
		final JPanel jPanelAccionesVisa=this.jPanelAccionesVisa;
		
		JPanel jPanelCamposAuxiliarVisa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVisa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVisa!=null) {
			jPanelCamposAuxiliarVisa=this.jInternalFrameDetalleFormVisa.jPanelCamposVisa;
			jPanelAccionesFormularioAuxiliarVisa=this.jInternalFrameDetalleFormVisa.jPanelAccionesFormularioVisa;
		}
		
		final JPanel jPanelCamposVisa=jPanelCamposAuxiliarVisa;
		final JPanel jPanelAccionesFormularioVisa=jPanelAccionesFormularioAuxiliarVisa;
		
		
		final JMenuBar jmenuBarVisa=this.jmenuBarVisa;
		final JToolBar jTtoolBarVisa=this.jTtoolBarVisa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVisa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVisa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVisa!=null) {
			jmenuBarDetalleAuxiliarVisa=this.jInternalFrameDetalleFormVisa.jmenuBarDetalleVisa;
			jTtoolBarDetalleAuxiliarVisa=this.jInternalFrameDetalleFormVisa.jTtoolBarDetalleVisa;
		}
		
		final JMenuBar jmenuBarDetalleVisa=jmenuBarDetalleAuxiliarVisa;
		final JToolBar jTtoolBarDetalleVisa=jTtoolBarDetalleAuxiliarVisa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVisa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVisa;
			processRunnable.jTableDatos=jTableDatosVisa;
			processRunnable.jPanelCampos=jPanelCamposVisa;
			processRunnable.jPanelPaginacion=jPanelPaginacionVisa;
			processRunnable.jPanelAcciones=jPanelAccionesVisa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVisa;
			
			
			processRunnable.jmenuBar=jmenuBarVisa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVisa;
			processRunnable.jTtoolBar=jTtoolBarVisa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVisa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVisa ,jPanelParametrosReportesVisa,jTableDatosVisa, /*jScrollPanelDatosVisa,*/jPanelCamposVisa,jPanelPaginacionVisa, /*jScrollPanelDatosEdicionVisa,*/ jPanelAccionesVisa,jPanelAccionesFormularioVisa,jmenuBarVisa,jmenuBarDetalleVisa,jTtoolBarVisa,jTtoolBarDetalleVisa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVisa ,jPanelParametrosReportesVisa, jScrollPanelDatosVisa,jPanelPaginacionVisa, jScrollPanelDatosEdicionVisa, jPanelAccionesVisa,jPanelAccionesFormularioVisa,jmenuBarVisa,jmenuBarDetalleVisa,jTtoolBarVisa,jTtoolBarDetalleVisa);
						
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
	
	public void finishProcessVisa() {// throws Exception 
		this.finishProcessVisa(true);
	}
	
	public void finishProcessVisa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVisa ,this.jPanelParametrosReportesVisa, this.jScrollPanelDatosVisa,this.jPanelPaginacionVisa, this.jScrollPanelDatosEdicionVisa, this.jPanelAccionesVisa,this.jPanelAccionesFormularioVisa,this.jmenuBarVisa,this.jmenuBarDetalleVisa,this.jTtoolBarVisa,this.jTtoolBarDetalleVisa);		
		
		final JTabbedPane jTabbedPaneBusquedasVisa=this.jTabbedPaneBusquedasVisa; 
		
		final JPanel jPanelParametrosReportesVisa=this.jPanelParametrosReportesVisa;
		//final JScrollPane jScrollPanelDatosVisa=this.jScrollPanelDatosVisa;
		final JTable jTableDatosVisa=this.jTableDatosVisa;		
		final JPanel jPanelPaginacionVisa=this.jPanelPaginacionVisa;
		//final JScrollPane jScrollPanelDatosEdicionVisa=this.jScrollPanelDatosEdicionVisa;
		final JPanel jPanelAccionesVisa=this.jPanelAccionesVisa;
		
		JPanel jPanelCamposAuxiliarVisa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVisa=new JPanel();
		
		if(this.jInternalFrameDetalleFormVisa!=null) {
			jPanelCamposAuxiliarVisa=this.jInternalFrameDetalleFormVisa.jPanelCamposVisa;
			jPanelAccionesFormularioAuxiliarVisa=this.jInternalFrameDetalleFormVisa.jPanelAccionesFormularioVisa;
		}
		
		final JPanel jPanelCamposVisa=jPanelCamposAuxiliarVisa;
		final JPanel jPanelAccionesFormularioVisa=jPanelAccionesFormularioAuxiliarVisa;
		
		
		final JMenuBar jmenuBarVisa=this.jmenuBarVisa;		
		final JToolBar jTtoolBarVisa=this.jTtoolBarVisa;
				
		JMenuBar jmenuBarDetalleAuxiliarVisa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVisa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVisa!=null) {
			jmenuBarDetalleAuxiliarVisa=this.jInternalFrameDetalleFormVisa.jmenuBarDetalleVisa;
			jTtoolBarDetalleAuxiliarVisa=this.jInternalFrameDetalleFormVisa.jTtoolBarDetalleVisa;		
		}
		
		final JMenuBar jmenuBarDetalleVisa=jmenuBarDetalleAuxiliarVisa;
		final JToolBar jTtoolBarDetalleVisa=jTtoolBarDetalleAuxiliarVisa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVisa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVisa;
			processRunnable.jTableDatos=jTableDatosVisa;
			processRunnable.jPanelCampos=jPanelCamposVisa;
			processRunnable.jPanelPaginacion=jPanelPaginacionVisa;
			processRunnable.jPanelAcciones=jPanelAccionesVisa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVisa;
			
			
			processRunnable.jmenuBar=jmenuBarVisa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVisa;
			processRunnable.jTtoolBar=jTtoolBarVisa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVisa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVisa ,jPanelParametrosReportesVisa, jTableDatosVisa,/*jScrollPanelDatosVisa,*/jPanelCamposVisa,jPanelPaginacionVisa, /*jScrollPanelDatosEdicionVisa,*/ jPanelAccionesVisa,jPanelAccionesFormularioVisa,jmenuBarVisa,jmenuBarDetalleVisa,jTtoolBarVisa,jTtoolBarDetalleVisa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVisa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVisa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVisa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVisa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVisa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVisa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVisa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVisa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVisa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.visaConstantesFunciones.getsFinalQueryVisa();
		String  finalQueryPaginacionTodos=this.visaConstantesFunciones.getsFinalQueryVisa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VisaConstantesFunciones.getArrayColumnasGlobalesNoVisa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VisaConstantesFunciones.getArrayColumnasGlobalesVisa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VisaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.visasEliminados= new ArrayList<Visa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVisa();
		
				///*VisaSessionBean*/this.visaSessionBean=new VisaSessionBean();
			
			if(this.visaSessionBean==null) {
				this.visaSessionBean=new VisaSessionBean();
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
					this.iNumeroPaginacion=VisaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VisaConstantesFunciones.getClassesForeignKeysOfVisa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/visa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			visasAux= new ArrayList<Visa>();
			
				
			visaLogic.setDatosCliente(this.datosCliente);
			visaLogic.setDatosDeep(this.datosDeep);
			visaLogic.setIsConDeep(true);
			
			
			visaLogic.getVisaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					visaLogic.getTodosVisas(finalQueryGlobal,pagination);
					
					//visaLogic.getTodosVisasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(visaLogic.getVisas()==null|| visaLogic.getVisas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							visasAux= new ArrayList<Visa>();
							visasAux.addAll(visaLogic.getVisas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visasAux= new ArrayList<Visa>();
							visasAux.addAll(visas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							visaLogic.getTodosVisas(finalQueryGlobal+"",this.pagination);												
							
							//visaLogic.getTodosVisasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteVisas("Todos",visaLogic.getVisas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							visaLogic.setVisas(new ArrayList<Visa>());					
							visaLogic.getVisas().addAll(visasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visas=new ArrayList<Visa>();
							visas.addAll(visasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idVisa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idVisa=this.idActual;
				
				} else if(this.idVisaActual!=null && this.idVisaActual!=0L) {
					idVisa=idVisaActual;
				}
				
					
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndicePorId(idVisa);
				
				this.visas=new ArrayList<Visa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					visaLogic.getEntity(idVisa);
					
					//visaLogic.getEntityWithConnection(idVisa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					visaLogic.setVisas(new ArrayList<Visa>());
					visaLogic.getVisas().add(visaLogic.getVisa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.visas=new ArrayList<Visa>();
					this.visas.add(visa);
				}
				
				if(visaLogic.getVisa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					visaLogic.getVisasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=visaLogic.getVisas()==null||visaLogic.getVisas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=visas==null|| visas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						visasAux=new ArrayList<Visa>();
						visasAux.addAll(visaLogic.getVisas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visasAux=new ArrayList<Visa>();
							visasAux.addAll(visas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							visaLogic.getVisasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVisas("FK_IdEmpleado",visaLogic.getVisas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVisas("FK_IdEmpleado",visas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						visaLogic.setVisas(new ArrayList<Visa>());
						visaLogic.getVisas().addAll(visasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visas=new ArrayList<Visa>();
							visas.addAll(visasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					visaLogic.getVisasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=visaLogic.getVisas()==null||visaLogic.getVisas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=visas==null|| visas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						visasAux=new ArrayList<Visa>();
						visasAux.addAll(visaLogic.getVisas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visasAux=new ArrayList<Visa>();
							visasAux.addAll(visas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							visaLogic.getVisasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVisas("FK_IdEmpresa",visaLogic.getVisas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVisas("FK_IdEmpresa",visas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						visaLogic.setVisas(new ArrayList<Visa>());
						visaLogic.getVisas().addAll(visasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visas=new ArrayList<Visa>();
							visas.addAll(visasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					visaLogic.getVisasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=visaLogic.getVisas()==null||visaLogic.getVisas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=visas==null|| visas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						visasAux=new ArrayList<Visa>();
						visasAux.addAll(visaLogic.getVisas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visasAux=new ArrayList<Visa>();
							visasAux.addAll(visas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							visaLogic.getVisasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VisaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVisas("FK_IdPais",visaLogic.getVisas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVisas("FK_IdPais",visas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						visaLogic.setVisas(new ArrayList<Visa>());
						visaLogic.getVisas().addAll(visasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visas=new ArrayList<Visa>();
							visas.addAll(visasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVisa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVisa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=visaLogic.getVisas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=visas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=visaLogic.getVisas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=visas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Visa visa) {
		Boolean permite=true;
		
		if(this.visa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VisaConstantesFunciones.getOrderByListaVisa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VisaConstantesFunciones.getOrderByListaVisa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Visa visa:visaLogic.getVisas()) {
				if(visa.getsType().equals(Constantes2.S_TOTALES)) {
					visaTotales=visa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Visa visa:this.visas) {
				if(visa.getsType().equals(Constantes2.S_TOTALES)) {
					visaTotales=visa;
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
			this.visaAux=new Visa();
			this.visaAux.setsType(Constantes2.S_TOTALES);
			this.visaAux.setIsNew(false);
			this.visaAux.setIsChanged(false);
			this.visaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				VisaConstantesFunciones.TotalizarValoresFilaVisa(this.visaLogic.getVisas(),this.visaAux);
				
				this.visaLogic.getVisas().add(this.visaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VisaConstantesFunciones.TotalizarValoresFilaVisa(this.visas,this.visaAux);
				
				this.visas.add(this.visaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		visaTotales=new Visa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.visaLogic.getVisas().remove(visaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.visas.remove(visaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		visaTotales=new Visa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Visa visa:visaLogic.getVisas()) {
				if(visa.getsType().equals(Constantes2.S_TOTALES)) {
					visaTotales=visa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VisaConstantesFunciones.TotalizarValoresFilaVisa(this.visaLogic.getVisas(),visaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Visa visa:this.visas) {
				if(visa.getsType().equals(Constantes2.S_TOTALES)) {
					visaTotales=visa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VisaConstantesFunciones.TotalizarValoresFilaVisa(this.visas,visaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVisasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVisasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVisasFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVisasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					visaLogic.getVisasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVisasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					visaLogic.getVisasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVisasFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					visaLogic.getVisasFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
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
	
	public void inicializarPermisosVisa() {
		this.isPermisoTodoVisa=false;
		this.isPermisoNuevoVisa=false;
		this.isPermisoActualizarVisa=false;
		this.isPermisoActualizarOriginalVisa=false;
		this.isPermisoEliminarVisa=false;
		this.isPermisoGuardarCambiosVisa=false;
		this.isPermisoConsultaVisa=false;
		this.isPermisoBusquedaVisa=false;
		this.isPermisoReporteVisa=false;		
		this.isPermisoOrdenVisa=false;		
		this.isPermisoPaginacionMedioVisa=false;		
		this.isPermisoPaginacionAltoVisa=false;
		this.isPermisoPaginacionTodoVisa=false;
		this.isPermisoCopiarVisa=false;		
		this.isPermisoVerFormVisa=false;		
		this.isPermisoDuplicarVisa=false;		
		this.isPermisoOrdenVisa=false;		
	}
	
	public void setPermisosUsuarioVisa(Boolean isPermiso) {
		this.isPermisoTodoVisa=isPermiso;
		this.isPermisoNuevoVisa=isPermiso;
		this.isPermisoActualizarVisa=isPermiso;
		this.isPermisoActualizarOriginalVisa=isPermiso;
		this.isPermisoEliminarVisa=isPermiso;
		this.isPermisoGuardarCambiosVisa=isPermiso;
		this.isPermisoConsultaVisa=isPermiso;
		this.isPermisoBusquedaVisa=isPermiso;
		this.isPermisoReporteVisa=isPermiso;
		this.isPermisoOrdenVisa=isPermiso;		
		this.isPermisoPaginacionMedioVisa=isPermiso;		
		this.isPermisoPaginacionAltoVisa=isPermiso;		
		this.isPermisoPaginacionTodoVisa=isPermiso;		
		this.isPermisoCopiarVisa=isPermiso;		
		this.isPermisoVerFormVisa=isPermiso;		
		this.isPermisoDuplicarVisa=isPermiso;
		this.isPermisoOrdenVisa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVisa(Boolean isPermiso) {
		//this.isPermisoTodoVisa=isPermiso;
		this.isPermisoNuevoVisa=isPermiso;
		this.isPermisoActualizarVisa=isPermiso;
		this.isPermisoActualizarOriginalVisa=isPermiso;
		this.isPermisoEliminarVisa=isPermiso;
		this.isPermisoGuardarCambiosVisa=isPermiso;
		//this.isPermisoConsultaVisa=isPermiso;
		//this.isPermisoBusquedaVisa=isPermiso;
		//this.isPermisoReporteVisa=isPermiso;
		//this.isPermisoOrdenVisa=isPermiso;		
		//this.isPermisoPaginacionMedioVisa=isPermiso;		
		//this.isPermisoPaginacionAltoVisa=isPermiso;		
		//this.isPermisoPaginacionTodoVisa=isPermiso;		
		//this.isPermisoCopiarVisa=isPermiso;		
		//this.isPermisoDuplicarVisa=isPermiso;
		//this.isPermisoOrdenVisa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVisaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VisaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVisa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVisaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVisaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVisaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVisaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVisa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VisaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.visaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VisaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVisa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVisa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVisa=this.isPermisoActualizarVisa;
			this.isPermisoEliminarVisa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVisa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVisa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVisa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVisa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVisa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVisa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVisa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVisa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVisa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVisa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVisa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVisa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVisa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.visaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVisa.setToolTipText(this.jTableDatosVisa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVisa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVisa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VisaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VisaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVisa() throws Exception {
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
	public void inicializarCombosForeignKeyVisaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVisaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VisaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyVisaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyVisaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			VisaParameterReturnGeneral visaReturnGeneral=new VisaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.visaConstantesFunciones.cargarid_empresaVisa)
					 || (this.esRecargarFks && this.visaConstantesFunciones.cargarid_empresaVisa)) {

					if(!this.visaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+visaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.visaConstantesFunciones.cargarid_paisVisa)
					 || (this.esRecargarFks && this.visaConstantesFunciones.cargarid_paisVisa)) {

					if(!this.visaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+visaSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.visaConstantesFunciones.cargarid_empleadoVisa)
					 || (this.esRecargarFks && this.visaConstantesFunciones.cargarid_empleadoVisa)) {

					if(!this.visaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+visaSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				visaReturnGeneral=visaLogic.cargarCombosLoteForeignKeyVisa(finalQueryGlobalEmpresa,finalQueryGlobalPais,finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=visaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=visaReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=visaReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyVisa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.visaSessionBean==null) {
				this.visaSessionBean=new VisaSessionBean();
			}

			if(!this.visaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.visaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.visaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyVisa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVisa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVisa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVisa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVisa(Visa visa)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(visa.getid_pais(),false,"Formulario");
			this.setActualEmpleadoForeignKey(visa.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVisa(Visa visa,String sTipoEvento)throws Exception {	
		try {
			
			

				if(visa.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoVisa")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(visa.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVisa()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.visaConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.visaConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVisa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVisa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVisa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVisa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVisa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVisa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVisa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa!=null && this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.getItemCount()>0) {
				this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa!=null && this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.getItemCount()>0) {
				this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa!=null && this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.getItemCount()>0) {
				this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public VisaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VisaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VisaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.visaSessionBean=new VisaSessionBean(); 
		this.visaConstantesFunciones=new VisaConstantesFunciones(); 
		this.visaBean=new Visa();//(this.visaConstantesFunciones); 		
		this.visaReturnGeneral=new VisaParameterReturnGeneral(); 
		
		this.visaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.visaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VisaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VisaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VisaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVisa(true);
			
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
			
			this.visaConstantesFunciones=new VisaConstantesFunciones(); 
			this.visaBean=new Visa();//this.visaConstantesFunciones); 			
			this.visaReturnGeneral=new VisaParameterReturnGeneral(); 
		
			VisaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Visa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.visa=new Visa();
			this.visas = new ArrayList<Visa>();
			this.visasAux = new ArrayList<Visa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic=new VisaLogic();
				this.visaLogic.getNewConnexionToDeep("");
			}
			
			//this.visaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.visaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVisa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVisa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVisa);	
					}
					
					if(this.jInternalFrameImportacionVisa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVisa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVisa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVisa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVisa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVisa);
				this.jInternalFrameDetalleFormVisa.setVisible(false);
				this.jInternalFrameDetalleFormVisa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVisa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVisa);
					this.jInternalFrameReporteDinamicoVisa.setVisible(false);
					this.jInternalFrameReporteDinamicoVisa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVisa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVisa);
					this.jInternalFrameImportacionVisa.setVisible(false);
					this.jInternalFrameImportacionVisa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVisa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVisa);
					this.jInternalFrameOrderByVisa.setVisible(false);
					this.jInternalFrameOrderByVisa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVisaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VisaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.visaReturnGeneral=new VisaParameterReturnGeneral();
			
			this.visaParameterGeneral=new VisaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.visaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.visaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VisaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.visaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VisaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.visaSessionBean.getEsGuardarRelacionado(),this.visaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VisaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.visaSessionBean.getEsGuardarRelacionado(),this.visaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVisa=false;
			this.isVisibilidadCeldaDuplicarVisa=true;
			this.isVisibilidadCeldaCopiarVisa=true;
			this.isVisibilidadCeldaVerFormVisa=true;
			this.isVisibilidadCeldaOrdenVisa=true;
			this.isVisibilidadCeldaNuevoRelacionesVisa=false;
			this.isVisibilidadCeldaModificarVisa=false;
			this.isVisibilidadCeldaActualizarVisa=false;
			this.isVisibilidadCeldaEliminarVisa=false;
			this.isVisibilidadCeldaCancelarVisa=false;
			this.isVisibilidadCeldaGuardarVisa=false;
			this.isVisibilidadCeldaGuardarCambiosVisa=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVisa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVisa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVisa(false);
			
			this.setPermisosUsuarioVisa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.visaSessionBean.getEsGuardarRelacionado() 
				|| (this.visaSessionBean.getEsGuardarRelacionado() && this.visaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVisaClasesRelacionadas();
			}
			
			if(this.visaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVisaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VisaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVisa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVisa();
			}
			
			if(!this.isPermisoBusquedaVisa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVisa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.visaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioVisa,this.isPermisoPaginacionMedioVisa,this.isPermisoPaginacionTodoVisa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VisaConstantesFunciones.getTiposSeleccionarVisa());
				
				this.tiposColumnasSelect=VisaConstantesFunciones.getTiposSeleccionarVisa(true);
				
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
			//if(!this.visaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVisa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioVisa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioVisa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVisa() ;
			
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
			this.paisLogic=new PaisLogic();
			this.empleadoLogic=new EmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				visaImplementable= (VisaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VisaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				visaImplementableHome= (VisaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VisaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.visas= new ArrayList<Visa>();
			this.visasEliminados= new ArrayList<Visa>();
						
			this.isEsNuevoVisa=false;
			this.esParaAccionDesdeFormularioVisa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVisa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVisa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.visaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VisaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VisaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVisa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVisa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVisa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVisa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVisa();
			}
			
			VisaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVisa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVisa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVisa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVisa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Visa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVisa() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVisa")) {
				iIndex=this.jInternalFrameDetalleFormVisa.jTabbedPaneRelacionesVisa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVisa.jTabbedPaneRelacionesVisa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVisa.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVisa();	
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
	
	public void cargarCombosForeignKeyVisa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVisa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVisa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVisaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVisa();
		
		this.cargarCombosFrameForeignKeyVisa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVisa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVisa();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoVisaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.visaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
			
			if(jTableDatosVisa.getRowCount()>=1) {
				jTableDatosVisa.removeRowSelectionInterval(0, jTableDatosVisa.getRowCount()-1);						
			}
			
			this.isEsNuevoVisa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVisa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVisa(true);			
			//this.visa=new Visa();
			//this.visa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVisa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVisa() ;
			
			if(VisaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVisa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.visa);	
			this.actualizarInformacion("INFO_PADRE",false,this.visa);				
			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
			if(this.visaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Visa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVisaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVisa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVisa.getSelectedRows().length;			
			}
			
			visasSeleccionados=this.getVisasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVisa--;			
				//Visa visaAux= new Visa();			
				//visaAux.setId(this.iIdNuevoVisa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Visa visaOrigen=new Visa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Visa visaOrigen : visasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVisa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							visaOrigen =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visaOrigen =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVisa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.visa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVisa(visaOrigen,this.visa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.visaLogic.getVisas().add(this.visaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.visas.add(this.visaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVisa(false);
				
				this.jTableDatosVisa.setRowSelectionInterval(this.getIndiceNuevoVisa(), this.getIndiceNuevoVisa());
				
				int iLastRow =  this.jTableDatosVisa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVisa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVisa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVisa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVisaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();									
		
			Visa visaOrigen=new Visa();
			Visa visaDestino=new Visa();
				
			visasSeleccionados=this.getVisasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVisa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || visasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVisa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						visaOrigen =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						visaOrigen =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						visaDestino =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						visaDestino =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				visaOrigen =visasSeleccionados.get(0);
				visaDestino =visasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVisa(visaOrigen,visaDestino,true,false);
				
				visaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(visaDestino,visaLogic.getVisas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(visaDestino,visas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVisa(false);
				
				//this.jTableDatosVisa.setRowSelectionInterval(this.getIndiceNuevoVisa(), this.getIndiceNuevoVisa());
				
				int iLastRow =  this.jTableDatosVisa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVisa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVisa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVisa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVisaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVisa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVisaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVisa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVisa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVisa.setVisible(!isVisible);
			this.jPanelPaginacionVisa.setVisible(!isVisible);
			this.jPanelAccionesVisa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVisaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVisa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVisaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVisa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVisaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVisa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVisaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVisa();
			
			this.abrirFrameOrderByVisa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVisaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVisa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVisa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVisa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVisa.isMaximum()) {
					this.jInternalFrameDetalleFormVisa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVisa.setSize(this.jInternalFrameDetalleFormVisa.iWidthFormulario,this.jInternalFrameDetalleFormVisa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVisa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVisa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVisa.isMaximum()) {
						this.jInternalFrameDetalleFormVisa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVisa.jContentPaneDetalleVisa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVisa.jTabbedPaneRelacionesVisa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVisa.jContentPaneDetalleVisa.getWidth(),VisaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVisa.jTabbedPaneRelacionesVisa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVisa.jContentPaneDetalleVisa.getWidth(),VisaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVisa.jTabbedPaneRelacionesVisa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVisa.jContentPaneDetalleVisa.getWidth(),VisaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVisa.setVisible(true);
	        this.jInternalFrameDetalleFormVisa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVisa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVisa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVisa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVisa,false,this);
				} else {
					this.jInternalFrameOrderByVisa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVisa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVisa);
				this.jInternalFrameOrderByVisa.setVisible(false);
				this.jInternalFrameOrderByVisa.setSelected(false);
				
				this.jInternalFrameOrderByVisa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVisa"));
				
				this.inicializarActualizarBindingTablaOrderByVisa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVisa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVisa==null) {
				
				this.jInternalFrameImportacionVisa=new ImportacionJInternalFrame(VisaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVisa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVisa);
				this.jInternalFrameImportacionVisa.setVisible(false);
				this.jInternalFrameImportacionVisa.setSelected(false);


				this.jInternalFrameImportacionVisa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVisa"));
				this.jInternalFrameImportacionVisa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVisa"));
				this.jInternalFrameImportacionVisa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVisa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVisa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVisa==null) {
				this.jInternalFrameReporteDinamicoVisa=new ReporteDinamicoJInternalFrame(VisaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVisa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVisa);
				this.jInternalFrameReporteDinamicoVisa.setVisible(false);
				this.jInternalFrameReporteDinamicoVisa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVisa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVisa"));
				this.jInternalFrameReporteDinamicoVisa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVisa"));
				this.jInternalFrameReporteDinamicoVisa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVisa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVisa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVisa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVisa);
			
	       	this.jInternalFrameDetalleFormVisa.setVisible(false);
	        this.jInternalFrameDetalleFormVisa.setSelected(false);
			
			//this.jInternalFrameDetalleFormVisa.dispose();
			//this.jInternalFrameDetalleFormVisa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVisa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVisa.setVisible(true);
	        this.jInternalFrameReporteDinamicoVisa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVisa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVisa.setVisible(true);
	        this.jInternalFrameImportacionVisa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVisa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVisa.setVisible(true);
	        this.jInternalFrameOrderByVisa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVisa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVisa.setVisible(false);
	        this.jInternalFrameOrderByVisa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVisa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVisa.setVisible(false);
	        this.jInternalFrameReporteDinamicoVisa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVisa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVisa.setVisible(false);
	        this.jInternalFrameImportacionVisa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVisaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVisa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVisa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVisa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVisa(true);
			//this.isEsNuevoVisa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVisa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVisa(false) ;
			
			if(visaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VisaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVisa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVisa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVisaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVisa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVisa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVisa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVisa(true);
			//this.isEsNuevoVisa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.visa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVisa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVisa(false) ;
			
			if(VisaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVisa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVisa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.visaConstantesFunciones.cargarid_empleadoVisa) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingVisa(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosVisa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisa,VisaConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVisa.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosVisa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisa,VisaConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVisa.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarVisaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVisa(false);
			
			//if(!this.isEsNuevoVisa) {								
				int intSelectedRow = this.jTableDatosVisa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VisaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVisa(this.visa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
				
			}
			
			if(this.permiteMantenimiento(this.visa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.visaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVisa=true;
					this.inicializarActualizarBindingTablaVisa(false);
					this.isEsNuevoVisa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVisa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVisa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVisa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVisa(false);
				
				this.habilitarDeshabilitarControlesVisa(false);
			
												
				
				if(VisaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVisa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVisaActionPerformed(evt,visaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVisa(this.visa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVisa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,visaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.visa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Visa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Visa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVisaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVisa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				this.visa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				this.visa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.visa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.visaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VisaModel) this.jTableDatosVisa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVisa=true;
				this.inicializarActualizarBindingTablaVisa(false);
				this.isEsNuevoVisa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVisa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVisa(false);
				
				this.habilitarDeshabilitarControlesVisa(false);
				
				
				
				if(VisaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVisa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVisaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVisa.getRowCount()>=1) {
				jTableDatosVisa.removeRowSelectionInterval(0, jTableDatosVisa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVisa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVisa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVisa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVisa(false) ;
			
			this.isEsNuevoVisa=false;
			
			if(VisaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVisa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVisaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVisa(false);
				
				//SI ES MANUAL
				if(VisaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVisa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVisaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVisa--;			
			//Visa visaAux= new Visa();			
			//visaAux.setId(this.iIdNuevoVisa);
			
			if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVisa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
			
			this.visa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.visaLogic.getVisas().add(this.visaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.visas.add(this.visaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVisa(false);
			
			this.jTableDatosVisa.setRowSelectionInterval(this.getIndiceNuevoVisa(), this.getIndiceNuevoVisa());
			
			int iLastRow =  this.jTableDatosVisa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVisa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVisa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVisa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVisaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVisa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVisa(false);
			
			//SI ES MANUAL
			if(VisaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVisa();
			}
			
			//this.abrirFrameTreeVisa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVisaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE VisaS ?", "MANTENIMIENTO DE Visa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionVisa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralVisa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.visaReturnGeneral=visaLogic.procesarImportacionVisasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.visaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarVisaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVisaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVisa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVisa.setFileImportacion(this.jInternalFrameImportacionVisa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVisa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVisa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVisa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVisa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVisaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();		

		visasSeleccionados=this.getVisasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVisa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVisa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VisaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VisaBaseDesign.jrxml";
			
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
			
			this.generarReporteVisas("Todos",visasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVisa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVisa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VisaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisaConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisaConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoVisa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVisa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVisa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VisaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case VisaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case VisaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case VisaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVisa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VisaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case VisaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case VisaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case VisaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVisa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVisa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VisaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case VisaConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case VisaConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case VisaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoVisaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();		
		
		visasSeleccionados=this.getVisasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Visas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVisa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVisa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VisaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Visa visa:visasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisaConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisaConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(Visa visa:visasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visa.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisaConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisaConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(Visa visa:visasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visa.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Visa visa:visasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visa.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelVisa(row);				
			//	iRow++;
			//}				
			
			//for(Visa visaAux:visasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVisa(visaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visa",JOptionPane.INFORMATION_MESSAGE);
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
				this.visaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVisa(false);
			
			//SI ES MANUAL
			if(VisaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVisa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVisaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVisa(false);
			
			//SI ES MANUAL
			if(VisaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVisa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVisaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVisa(false);
			
			//SI ES MANUAL
			if(VisaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVisa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVisa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVisa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVisa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVisa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVisa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVisa.setMinimumSize(dimensionMinimum);
		this.jTableDatosVisa.setMaximumSize(dimensionMaximum);
		this.jTableDatosVisa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVisa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVisa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVisa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVisa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVisa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.visaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVisa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVisa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVisa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VisaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VisaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVisa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVisa();
		
		this.inicializarActualizarBindingBotonesManualVisa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.visaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVisa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVisa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVisa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVisa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVisa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVisa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVisa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVisa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVisa.jCheckBoxPostAccionNuevoVisa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVisa.jCheckBoxPostAccionSinCerrarVisa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVisa.jCheckBoxPostAccionSinMensajeVisa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVisa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVisa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVisa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVisa!=null) {
				this.jInternalFrameDetalleFormVisa.jCheckBoxPostAccionNuevoVisa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVisa.jCheckBoxPostAccionSinCerrarVisa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVisa.jCheckBoxPostAccionSinMensajeVisa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVisa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVisa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVisa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVisa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVisa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVisa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVisa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVisa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVisa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVisa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVisa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVisa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVisa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVisa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVisa(Boolean esInicializar) throws Exception {
		try	{	
			if(VisaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVisa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVisa() throws Exception {
		try	{
			if(VisaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVisa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVisa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVisa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVisa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVisa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVisa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVisa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVisa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVisa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVisa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVisa.addItem(reporte);
			}
			
			
			if(!this.visaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVisa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVisa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVisa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVisa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVisa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVisa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVisa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVisa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVisa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVisa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVisa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVisa!=null) {
				this.jInternalFrameReporteDinamicoVisa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVisa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVisa!=null) {
				this.jInternalFrameReporteDinamicoVisa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVisa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVisa!=null) {
				
				if(this.jInternalFrameReporteDinamicoVisa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVisa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVisa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVisa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVisa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVisa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVisa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoVisa.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoVisa.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisVisa.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisVisa.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVisa(Boolean esInicializar) throws Exception {				
		if(VisaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVisa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVisa() throws Exception {
		this.inicializarActualizarBindingTablaVisa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVisa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVisa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVisa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVisa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VisaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVisa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVisa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VisaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVisaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VisaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVisa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVisa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VisaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVisa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVisa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=visaLogic.getVisas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=visas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VisaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVisa.setModel(new VisaModel(this.visaLogic.getVisas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVisa.setModel(new VisaModel(this.visas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVisa!=null && this.jInternalFrameOrderByVisa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVisa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVisa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VisaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VisaConstantesFunciones.SCLASSWEBTITULO,visaConstantesFunciones.resaltarSeleccionarVisa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VisaConstantesFunciones.SCLASSWEBTITULO,visaConstantesFunciones.resaltarSeleccionarVisa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVisa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisa,VisaConstantesFunciones.LABEL_ID));

		if(this.visaConstantesFunciones.mostraridVisa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.visaConstantesFunciones.resaltaridVisa,this.visaConstantesFunciones.activaridVisa,this,true,"idVisa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.visaConstantesFunciones.resaltaridVisa,this.visaConstantesFunciones.activaridVisa,this,true,"idVisa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisa,VisaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.visaConstantesFunciones.mostrarid_empresaVisa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.visaConstantesFunciones.resaltarid_empresaVisa,this,this.visaConstantesFunciones.activarid_empresaVisa));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.visaConstantesFunciones.resaltarid_empresaVisa,this,this.visaConstantesFunciones.activarid_empresaVisa,false,"id_empresaVisa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VisaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisa,VisaConstantesFunciones.LABEL_IDPAIS));

		if(this.visaConstantesFunciones.mostrarid_paisVisa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisaConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.visaConstantesFunciones.resaltarid_paisVisa,this,this.visaConstantesFunciones.activarid_paisVisa));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.visaConstantesFunciones.resaltarid_paisVisa,this,this.visaConstantesFunciones.activarid_paisVisa,true,"id_paisVisa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VisaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisa,VisaConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.visaConstantesFunciones.mostrarid_empleadoVisa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisaConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.visaConstantesFunciones.resaltarid_empleadoVisa,this,this.visaConstantesFunciones.activarid_empleadoVisa));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.visaConstantesFunciones.resaltarid_empleadoVisa,this,this.visaConstantesFunciones.activarid_empleadoVisa,true,"id_empleadoVisa","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new VisaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisa,VisaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.visaConstantesFunciones.mostrardescripcionVisa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.visaConstantesFunciones.resaltardescripcionVisa,this.visaConstantesFunciones.activardescripcionVisa,this,true,"descripcionVisa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.visaConstantesFunciones.resaltardescripcionVisa,this.visaConstantesFunciones.activardescripcionVisa,this,true,"descripcionVisa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VisaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.visaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.visaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.visaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVisa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.visaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.visaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVisa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVisa && this.isPermisoGuardarCambiosVisa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.visaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.visaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVisa.addColumn(tableColumn);
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
			
			this.jTableDatosVisa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVisa && this.isPermisoGuardarCambiosVisa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVisa && this.isPermisoGuardarCambiosVisa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVisa.moveColumn(this.jTableDatosVisa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVisa.moveColumn(this.jTableDatosVisa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVisa.moveColumn(this.jTableDatosVisa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVisa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVisa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVisa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VisaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVisa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVisa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VisaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VisaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVisa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVisa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVisa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=visaLogic.getVisas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=visas.size()-1;
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
		//this.jTableDatosVisa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVisa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVisa();
			
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
				
				//this.isEsNuevoVisa=false;
					
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
				if(this.visaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVisa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVisa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVisa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.visa.getsType().equals("DUPLICADO")
				   || this.visa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVisa=true;
				
				} else {
					this.isEsNuevoVisa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.visaSessionBean.getEsGuardarRelacionado()) {
					if(this.visa.getId()>=0 && !this.visa.getIsNew()) {						
						this.isEsNuevoVisa=false;
						
					} else {
						this.isEsNuevoVisa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVisa(esRelaciones);						
				
				this.seleccionarVisa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.visa.getId()<0) {
					this.isEsNuevoVisa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVisa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVisa(evt,rowIndex);
				}	
				
				if(this.visaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Visa: " + this.dDif); 
					}
				}								
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVisa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.visa)) {
					if(this.visa.getId()>0) {
						this.visa.setIsDeleted(true);
						
						this.visasEliminados.add(this.visa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.visaLogic.getVisas().remove(this.visa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.visas.remove(this.visa);				
					}
					
					
					((VisaModel) this.jTableDatosVisa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVisa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVisa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVisa) {
			
			if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVisa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVisa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VisaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVisa(this.visa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.visaConstantesFunciones.cargarid_empresaVisa || this.visaConstantesFunciones.event_dependid_empresaVisa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.visa.getid_empresa());
									//this.inicializarActualizarBindingVisa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(visa.getEmpresa()!=null) {
							this.empresasForeignKey.add(visa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.visa.getid_empresa(),false,"Formulario");

					//Pais
					if(!this.visaConstantesFunciones.cargarid_paisVisa || this.visaConstantesFunciones.event_dependid_paisVisa) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.visa.getid_pais());
									//this.inicializarActualizarBindingVisa(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(visa.getPais()!=null) {
							this.paissForeignKey.add(visa.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.visa.getid_pais(),false,"Formulario");

					//Empleado
					if(!this.visaConstantesFunciones.cargarid_empleadoVisa || this.visaConstantesFunciones.event_dependid_empleadoVisa) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.visa.getid_empleado());
									//this.inicializarActualizarBindingVisa(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(visa.getEmpleado()!=null) {
							this.empleadosForeignKey.add(visa.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.visa.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVisa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVisa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVisa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVisa(Visa visa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVisa(visa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVisa(Visa visa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVisa(visa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVisa(visa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVisa(visa);
	}
	
	public void setVariablesObjetoActualToFormularioVisa(Visa visa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVisa.jLabelidVisa.setText(visa.getId().toString());
			this.jInternalFrameDetalleFormVisa.jTextAreadescripcionVisa.setText(visa.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Visa visaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,visaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Visa visaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				visaLocal=this.visa;
			} else {
				visaLocal=this.visaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(visaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVisa(visaLocal,true);
					
					if(visaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(visaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.visaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(visaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVisa(Visa visa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVisa(visa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVisa(visa);
	}
	
	public void setVariablesFormularioToObjetoActualVisa(Visa visa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVisa(visa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVisa(Visa visa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVisa.jLabelidVisa.getText()==null || this.jInternalFrameDetalleFormVisa.jLabelidVisa.getText()=="" || this.jInternalFrameDetalleFormVisa.jLabelidVisa.getText()=="Id") {
				this.jInternalFrameDetalleFormVisa.jLabelidVisa.setText("0");
			}

			if(conColumnasBase) {visa.setId(Long.parseLong(this.jInternalFrameDetalleFormVisa.jLabelidVisa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisa.jLabelIdVisa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			visa.setdescripcion(this.jInternalFrameDetalleFormVisa.jTextAreadescripcionVisa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisa.jLabeldescripcionVisa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVisa(Visa visaBean,Visa visa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && visaBean.getid_pais()!=null && !visaBean.getid_pais().equals(-1L))) {visa.setid_pais(visaBean.getid_pais());}
			if(conDefault || (!conDefault && visaBean.getid_empleado()!=null && !visaBean.getid_empleado().equals(-1L))) {visa.setid_empleado(visaBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVisa(Visa visaOrigen,Visa visa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && visaOrigen.getId()!=null && !visaOrigen.getId().equals(0L))) {visa.setId(visaOrigen.getId());}}
			if(conDefault || (!conDefault && visaOrigen.getid_pais()!=null && !visaOrigen.getid_pais().equals(-1L))) {visa.setid_pais(visaOrigen.getid_pais());}
			if(conDefault || (!conDefault && visaOrigen.getid_empleado()!=null && !visaOrigen.getid_empleado().equals(-1L))) {visa.setid_empleado(visaOrigen.getid_empleado());}
			if(conDefault || (!conDefault && visaOrigen.getdescripcion()!=null && !visaOrigen.getdescripcion().equals(""))) {visa.setdescripcion(visaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVisa(Visa visa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVisa.jLabelidVisa.setText(visa.getId().toString());
			this.jInternalFrameDetalleFormVisa.jTextAreadescripcionVisa.setText(visa.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVisa(VisaBean visaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVisa.jLabelidVisa.setText(visaBean.getId().toString());
			this.jInternalFrameDetalleFormVisa.jTextAreadescripcionVisa.setText(visaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVisa(VisaParameterReturnGeneral visaReturnGeneral,VisaBean visaBean,Boolean conDefault) throws Exception { 
		try {
			Visa visaLocal=new Visa();
			
			visaLocal=visaReturnGeneral.getVisa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && visaLocal.getId()!=null && !visaLocal.getId().equals(0L))) {visaBean.setId(visaLocal.getId());}}
			if(conDefault || (!conDefault && visaLocal.getid_pais()!=null && !visaLocal.getid_pais().equals(-1L))) {visaBean.setid_pais(visaLocal.getid_pais());}
			if(conDefault || (!conDefault && visaLocal.getid_empleado()!=null && !visaLocal.getid_empleado().equals(-1L))) {visaBean.setid_empleado(visaLocal.getid_empleado());}
			if(conDefault || (!conDefault && visaLocal.getdescripcion()!=null && !visaLocal.getdescripcion().equals(""))) {visaBean.setdescripcion(visaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVisaGenerico(Long idVisaSeleccionado,JComboBox jComboBoxVisa,List<Visa> visasLocal)throws Exception {
		try {
			Visa  visaTemp=null;

			for(Visa visaAux:visasLocal) {
				if(visaAux.getId()!=null && visaAux.getId().equals(idVisaSeleccionado)) {
					visaTemp=visaAux;
					break;
				}
			}

			jComboBoxVisa.setSelectedItem(visaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVisaGenerico(JComboBox jComboBoxVisa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVisa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVisa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVisa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVisa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			visa=(Visa) visaLogic.getVisas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			visa =(Visa) visas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!visa.getIsNew() && !visa.getIsChanged() && !visa.getIsDeleted()) {
				sDescripcion=visa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=visa.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!visa.getIsNew() && !visa.getIsChanged() && !visa.getIsDeleted()) {
				sDescripcion=visa.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=visa.getpais_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!visa.getIsNew() && !visa.getIsChanged() && !visa.getIsDeleted()) {
				sDescripcion=visa.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=visa.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Visa visaRow=new Visa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			visaRow=(Visa) visaLogic.getVisas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			visaRow=(Visa) visas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVisa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVisa.setVisible((this.isVisibilidadCeldaNuevoVisa && this.isPermisoNuevoVisa));			
			this.jButtonDuplicarVisa.setVisible((this.isVisibilidadCeldaDuplicarVisa && this.isPermisoDuplicarVisa));			
			this.jButtonCopiarVisa.setVisible((this.isVisibilidadCeldaCopiarVisa && this.isPermisoCopiarVisa));
			this.jButtonVerFormVisa.setVisible((this.isVisibilidadCeldaVerFormVisa && this.isPermisoVerFormVisa));
			
			this.jButtonAbrirOrderByVisa.setVisible((this.isVisibilidadCeldaOrdenVisa && this.isPermisoOrdenVisa));			
			
			this.jButtonNuevoRelacionesVisa.setVisible((this.isVisibilidadCeldaNuevoRelacionesVisa && this.isPermisoNuevoVisa));			
			this.jButtonNuevoGuardarCambiosVisa.setVisible((this.isVisibilidadCeldaNuevoVisa && this.isPermisoNuevoVisa && this.isPermisoGuardarCambiosVisa));
			
			if(this.jInternalFrameDetalleFormVisa!=null) {
			this.jInternalFrameDetalleFormVisa.jButtonModificarVisa.setVisible((this.isVisibilidadCeldaModificarVisa && this.isPermisoActualizarVisa));	
			this.jInternalFrameDetalleFormVisa.jButtonActualizarVisa.setVisible((this.isVisibilidadCeldaActualizarVisa && this.isPermisoActualizarVisa));	
			this.jInternalFrameDetalleFormVisa.jButtonEliminarVisa.setVisible((this.isVisibilidadCeldaEliminarVisa && this.isPermisoEliminarVisa));
			this.jInternalFrameDetalleFormVisa.jButtonCancelarVisa.setVisible(this.isVisibilidadCeldaCancelarVisa);							
			this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosVisa.setVisible((this.isVisibilidadCeldaGuardarVisa && this.isPermisoGuardarCambiosVisa));			
			
			}
						
			this.jButtonGuardarCambiosTablaVisa.setVisible((this.isVisibilidadCeldaGuardarCambiosVisa && this.isPermisoGuardarCambiosVisa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVisa.setVisible((this.isVisibilidadCeldaNuevoVisa && this.isPermisoNuevoVisa));						
			this.jButtonDuplicarToolBarVisa.setVisible((this.isVisibilidadCeldaDuplicarVisa && this.isPermisoDuplicarVisa));						
			this.jButtonCopiarToolBarVisa.setVisible((this.isVisibilidadCeldaCopiarVisa && this.isPermisoCopiarVisa));			
			this.jButtonVerFormToolBarVisa.setVisible((this.isVisibilidadCeldaVerFormVisa && this.isPermisoVerFormVisa));			
			this.jButtonAbrirOrderByToolBarVisa.setVisible((this.isVisibilidadCeldaOrdenVisa && this.isPermisoOrdenVisa));
			this.jButtonNuevoRelacionesToolBarVisa.setVisible((this.isVisibilidadCeldaNuevoRelacionesVisa && this.isPermisoNuevoVisa));			
			this.jButtonNuevoGuardarCambiosToolBarVisa.setVisible((this.isVisibilidadCeldaNuevoVisa && this.isPermisoNuevoVisa && this.isPermisoGuardarCambiosVisa));			
			
			if(this.jInternalFrameDetalleFormVisa!=null) {
			this.jInternalFrameDetalleFormVisa.jButtonModificarToolBarVisa.setVisible((this.isVisibilidadCeldaModificarVisa && this.isPermisoActualizarVisa));	
			this.jInternalFrameDetalleFormVisa.jButtonActualizarToolBarVisa.setVisible((this.isVisibilidadCeldaActualizarVisa  && this.isPermisoActualizarVisa));	
			this.jInternalFrameDetalleFormVisa.jButtonEliminarToolBarVisa.setVisible((this.isVisibilidadCeldaEliminarVisa && this.isPermisoEliminarVisa));
			this.jInternalFrameDetalleFormVisa.jButtonCancelarToolBarVisa.setVisible(this.isVisibilidadCeldaCancelarVisa);				
			this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosToolBarVisa.setVisible((this.isVisibilidadCeldaGuardarVisa && this.isPermisoGuardarCambiosVisa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVisa.setVisible((this.isVisibilidadCeldaGuardarCambiosVisa && this.isPermisoGuardarCambiosVisa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVisa.setVisible((this.isVisibilidadCeldaNuevoVisa && this.isPermisoNuevoVisa));			
			this.jMenuItemDuplicarVisa.setVisible((this.isVisibilidadCeldaDuplicarVisa && this.isPermisoDuplicarVisa));			
			this.jMenuItemCopiarVisa.setVisible((this.isVisibilidadCeldaCopiarVisa && this.isPermisoCopiarVisa));			
			this.jMenuItemVerFormVisa.setVisible((this.isVisibilidadCeldaVerFormVisa && this.isPermisoVerFormVisa));			
			this.jMenuItemAbrirOrderByVisa.setVisible((this.isVisibilidadCeldaOrdenVisa && this.isPermisoOrdenVisa));			
			//this.jMenuItemMostrarOcultarVisa.setVisible((this.isVisibilidadCeldaOrdenVisa && this.isPermisoOrdenVisa));
			this.jMenuItemDetalleAbrirOrderByVisa.setVisible((this.isVisibilidadCeldaOrdenVisa && this.isPermisoOrdenVisa));			
			//this.jMenuItemDetalleMostrarOcultarVisa.setVisible((this.isVisibilidadCeldaOrdenVisa && this.isPermisoOrdenVisa));			
			this.jMenuItemNuevoRelacionesVisa.setVisible((this.isVisibilidadCeldaNuevoRelacionesVisa && this.isPermisoNuevoVisa));			
			this.jMenuItemNuevoGuardarCambiosVisa.setVisible((this.isVisibilidadCeldaNuevoVisa && this.isPermisoNuevoVisa && this.isPermisoGuardarCambiosVisa));									
			
			if(this.jInternalFrameDetalleFormVisa!=null) {
			this.jInternalFrameDetalleFormVisa.jMenuItemModificarVisa.setVisible((this.isVisibilidadCeldaModificarVisa && this.isPermisoActualizarVisa));	
			this.jInternalFrameDetalleFormVisa.jMenuItemActualizarVisa.setVisible((this.isVisibilidadCeldaActualizarVisa && this.isPermisoActualizarVisa));	
			this.jInternalFrameDetalleFormVisa.jMenuItemEliminarVisa.setVisible((this.isVisibilidadCeldaEliminarVisa && this.isPermisoEliminarVisa));
			this.jInternalFrameDetalleFormVisa.jMenuItemCancelarVisa.setVisible(this.isVisibilidadCeldaCancelarVisa);				
			}
			
			this.jMenuItemGuardarCambiosVisa.setVisible((this.isVisibilidadCeldaGuardarVisa && this.isPermisoGuardarCambiosVisa));						
			this.jMenuItemGuardarCambiosTablaVisa.setVisible((this.isVisibilidadCeldaGuardarCambiosVisa && this.isPermisoGuardarCambiosVisa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVisa=this.jButtonNuevoVisa.isVisible();
			this.isVisibilidadCeldaDuplicarVisa=this.jButtonDuplicarVisa.isVisible();
			this.isVisibilidadCeldaCopiarVisa=this.jButtonCopiarVisa.isVisible();
			this.isVisibilidadCeldaVerFormVisa=this.jButtonVerFormVisa.isVisible();
			
			this.isVisibilidadCeldaOrdenVisa=this.jButtonAbrirOrderByVisa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVisa=this.jButtonNuevoRelacionesVisa.isVisible();
			this.isVisibilidadCeldaModificarVisa=this.jButtonModificarVisa.isVisible();
			
			if(this.jInternalFrameDetalleFormVisa!=null) {
			this.isVisibilidadCeldaActualizarVisa=this.jInternalFrameDetalleFormVisa.jButtonActualizarVisa.isVisible();
			this.isVisibilidadCeldaEliminarVisa=this.jInternalFrameDetalleFormVisa.jButtonEliminarVisa.isVisible();
			this.isVisibilidadCeldaCancelarVisa=this.jInternalFrameDetalleFormVisa.jButtonCancelarVisa.isVisible();
			this.isVisibilidadCeldaGuardarVisa=this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosVisa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVisa=this.jButtonGuardarCambiosTablaVisa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVisa=this.jButtonNuevoToolBarVisa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVisa=this.jButtonNuevoRelacionesToolBarVisa.isVisible();
			
			if(this.jInternalFrameDetalleFormVisa!=null) {
			this.isVisibilidadCeldaModificarVisa=this.jInternalFrameDetalleFormVisa.jButtonModificarToolBarVisa.isVisible();
			this.isVisibilidadCeldaActualizarVisa=this.jInternalFrameDetalleFormVisa.jButtonActualizarToolBarVisa.isVisible();
			this.isVisibilidadCeldaEliminarVisa=this.jInternalFrameDetalleFormVisa.jButtonEliminarToolBarVisa.isVisible();
			this.isVisibilidadCeldaCancelarVisa=this.jInternalFrameDetalleFormVisa.jButtonCancelarToolBarVisa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVisa=this.jButtonGuardarCambiosToolBarVisa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVisa=this.jButtonGuardarCambiosTablaToolBarVisa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVisa=this.jMenuItemNuevoVisa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVisa=this.jMenuItemNuevoRelacionesVisa.isVisible();
			
			if(this.jInternalFrameDetalleFormVisa!=null) {
			this.isVisibilidadCeldaModificarVisa=this.jInternalFrameDetalleFormVisa.jMenuItemModificarVisa.isVisible();
			this.isVisibilidadCeldaActualizarVisa=this.jInternalFrameDetalleFormVisa.jMenuItemActualizarVisa.isVisible();
			this.isVisibilidadCeldaEliminarVisa=this.jInternalFrameDetalleFormVisa.jMenuItemEliminarVisa.isVisible();
			this.isVisibilidadCeldaCancelarVisa=this.jInternalFrameDetalleFormVisa.jMenuItemCancelarVisa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVisa=this.jMenuItemGuardarCambiosVisa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVisa=this.jMenuItemGuardarCambiosTablaVisa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVisa(Boolean esInicializar) {
		if(VisaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.visaSessionBean.getConGuardarRelaciones()) {
				//if(this.visaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVisa();
			}
			
			this.inicializarActualizarBindingBotonesManualVisa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVisa() {
		this.jButtonNuevoVisa.setVisible(this.isPermisoNuevoVisa);			
		this.jButtonDuplicarVisa.setVisible(this.isPermisoDuplicarVisa);			
		this.jButtonCopiarVisa.setVisible(this.isPermisoCopiarVisa);			
		this.jButtonVerFormVisa.setVisible(this.isPermisoVerFormVisa);			
		
		this.jButtonAbrirOrderByVisa.setVisible(this.isPermisoOrdenVisa);					
		
		this.jButtonNuevoRelacionesVisa.setVisible(this.isPermisoNuevoVisa);			
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jButtonModificarVisa.setVisible(this.isPermisoActualizarVisa);	
			this.jInternalFrameDetalleFormVisa.jButtonActualizarVisa.setVisible(this.isPermisoActualizarVisa);	
			this.jInternalFrameDetalleFormVisa.jButtonEliminarVisa.setVisible(this.isPermisoEliminarVisa);
			this.jInternalFrameDetalleFormVisa.jButtonCancelarVisa.setVisible(this.isVisibilidadCeldaCancelarVisa);						
			this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosVisa.setVisible(this.isPermisoGuardarCambiosVisa);							
		}
		
		this.jButtonGuardarCambiosTablaVisa.setVisible(this.isPermisoActualizarVisa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVisa() {
		this.jInternalFrameDetalleFormVisa.jButtonModificarVisa.setVisible(this.isPermisoActualizarVisa);	
		this.jInternalFrameDetalleFormVisa.jButtonActualizarVisa.setVisible(this.isPermisoActualizarVisa);	
		this.jInternalFrameDetalleFormVisa.jButtonEliminarVisa.setVisible(this.isPermisoEliminarVisa);
		this.jInternalFrameDetalleFormVisa.jButtonCancelarVisa.setVisible(this.isVisibilidadCeldaCancelarVisa);							
		this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosVisa.setVisible((this.isVisibilidadCeldaGuardarVisa && this.isPermisoGuardarCambiosVisa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVisa() {
		if(VisaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVisa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVisa() {
	}
	
	public void jTableDatosVisaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVisa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVisaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisa(this.getvisa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visa==null) {
						this.visa = new Visa();
					}

					this.setVariablesFormularioToObjetoActualVisa(this.visa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
				}

				if(this.visa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.visa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVisaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVisa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVisa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVisa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVisa(this.getvisa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.visaLogic.getConnexion());

				if(this.visa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.visa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVisa=(TitledBorder)this.jScrollPanelDatosVisa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVisa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVisaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisa(this.getvisa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visa==null) {
						this.visa = new Visa();
					}

					this.setVariablesFormularioToObjetoActualVisa(this.visa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
				}

				if(this.visa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.visa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisVisaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebVisa(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVisa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVisa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVisa(this.getvisa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.visaLogic.getConnexion());

				if(this.visa.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.visa.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVisa=(TitledBorder)this.jScrollPanelDatosVisa.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderVisa.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisVisaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisa(this.getvisa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visa==null) {
						this.visa = new Visa();
					}

					this.setVariablesFormularioToObjetoActualVisa(this.visa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
				}

				if(this.visa.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.visa.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoVisaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderVisa=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosVisa.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderVisa=(TitledBorder)this.jScrollPanelDatosVisa.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderVisa.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoVisaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebVisa(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVisa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVisa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVisa(this.getvisa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.visaLogic.getConnexion());

				if(this.visa.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.visa.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVisa=(TitledBorder)this.jScrollPanelDatosVisa.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderVisa.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoVisaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisa(this.getvisa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visa==null) {
						this.visa = new Visa();
					}

					this.setVariablesFormularioToObjetoActualVisa(this.visa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
				}

				if(this.visa.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.visa.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionVisaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisa(this.getvisa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visa==null) {
						this.visa = new Visa();
					}

					this.setVariablesFormularioToObjetoActualVisa(this.visa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);
				}

				if(this.visa.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.visa.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoVisaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVisa(false,false);

			this.getVisasFK_IdEmpleado();

			this.inicializarActualizarBindingVisa(false);

			//if(VisaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVisa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVisaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVisa(false,false);

			this.getVisasFK_IdEmpresa();

			this.inicializarActualizarBindingVisa(false);

			//if(VisaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVisa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisVisaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVisa(false,false);

			this.getVisasFK_IdPais();

			this.inicializarActualizarBindingVisa(false);

			//if(VisaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVisa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVisa() {
		if(this.jInternalFrameDetalleFormVisa!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVisa!=null) {
			this.jInternalFrameDetalleFormVisa.setVisible(false);	    			
			this.jInternalFrameDetalleFormVisa.dispose();
			this.jInternalFrameDetalleFormVisa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVisa!=null) {
			this.jInternalFrameReporteDinamicoVisa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVisa.dispose();
			this.jInternalFrameReporteDinamicoVisa=null;
		}
		
		if(this.jInternalFrameImportacionVisa!=null) {
			this.jInternalFrameImportacionVisa.setVisible(false);	    			
			this.jInternalFrameImportacionVisa.dispose();
			this.jInternalFrameImportacionVisa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVisa();
			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
			
			if(sTipo.equals("NuevoVisa")) {
				jButtonNuevoVisaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVisa")) {
				jButtonDuplicarVisaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVisa")) {
				jButtonCopiarVisaActionPerformed(evt);
			} else if(sTipo.equals("VerFormVisa")) {
				jButtonVerFormVisaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVisa")) {
				jButtonNuevoVisaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVisa")) {
				jButtonDuplicarVisaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVisa")) {
				jButtonNuevoVisaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVisa")) {
				jButtonDuplicarVisaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVisa")) {
				jButtonNuevoVisaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVisa")) {
				jButtonNuevoVisaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVisa")) {
				jButtonNuevoVisaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVisa")) {
				jButtonModificarVisaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVisa")) {
				jButtonModificarVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVisa")) {
				jButtonModificarVisaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVisa")) {
				jButtonActualizarVisaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVisa")) {
				jButtonActualizarVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVisa")) {
				jButtonActualizarVisaActionPerformed(evt);
			} else if(sTipo.equals("EliminarVisa")) {
				jButtonEliminarVisaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVisa")) {
				jButtonEliminarVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVisa")) {
				jButtonEliminarVisaActionPerformed(evt);
			} else if(sTipo.equals("CancelarVisa")) {
				jButtonCancelarVisaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVisa")) {
				jButtonCancelarVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVisa")) {
				jButtonCancelarVisaActionPerformed(evt);
			} else if(sTipo.equals("CerrarVisa")) {
				jButtonCerrarVisaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVisa")) {
				jButtonCerrarVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVisa")) {
				jButtonCerrarVisaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVisa")) {
				jButtonMostrarOcultarVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVisa")) {
				jButtonCancelarVisaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVisa")) {
				jButtonGuardarCambiosVisaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVisa")) {
				jButtonGuardarCambiosVisaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVisa")) {
				jButtonCopiarVisaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVisa")) {
				jButtonVerFormVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVisa")) {
				jButtonGuardarCambiosVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVisa")) {
				jButtonCopiarVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVisa")) {
				jButtonVerFormVisaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVisa")) {
				jButtonGuardarCambiosVisaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVisa")) {
				jButtonGuardarCambiosVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVisa")) {
				jButtonGuardarCambiosVisaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVisa")) {
				jButtonRecargarInformacionVisaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVisa")) {
				jButtonRecargarInformacionVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVisa")) {
				jButtonRecargarInformacionVisaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVisa")) {
				jButtonAnterioresVisaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVisa")) {
				jButtonAnterioresVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVisa")) {
				jButtonAnterioresVisaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVisa")) {
				jButtonSiguientesVisaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVisa")) {
				jButtonSiguientesVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVisa")) {
				jButtonSiguientesVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVisa") || sTipo.equals("MenuItemDetalleAbrirOrderByVisa")) {
				jButtonAbrirOrderByVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVisa") || sTipo.equals("MenuItemDetalleMostrarOcultarVisa")) {
				jButtonMostrarOcultarVisaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVisa")) {
				jButtonNuevoGuardarCambiosVisaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVisa")) {
				jButtonNuevoGuardarCambiosVisaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVisa")) {
				jButtonNuevoGuardarCambiosVisaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVisa")) {
				jButtonCerrarReporteDinamicoVisaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVisa")) {
				jButtonGenerarReporteDinamicoVisaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVisa")) {
				
				jButtonGenerarExcelReporteDinamicoVisaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVisa")) {
				jButtonCerrarImportacionVisaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVisa")) {
				
				jButtonGenerarImportacionVisaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVisa")) {
				
				jButtonAbrirImportacionVisaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVisa")) {
				jComboBoxTiposAccionesVisaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVisa")) {
				jComboBoxTiposRelacionesVisaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVisa")) {
				jComboBoxTiposAccionesVisaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVisa")) {
				
				jComboBoxTiposSeleccionarVisaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVisa")) {
				jTextFieldValorCampoGeneralVisaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVisa")) {
				jButtonAbrirOrderByVisaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVisa")) {
				jButtonAbrirOrderByVisaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVisa")) {
				jButtonCerrarOrderByVisaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVisaBusqueda")) {
				this.jButtonidVisaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVisaUpdate")) {
				this.jButtonid_empresaVisaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVisaBusqueda")) {
				this.jButtonid_empresaVisaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisVisaUpdate")) {
				this.jButtonid_paisVisaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisVisaBusqueda")) {
				this.jButtonid_paisVisaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoVisa")) {
				this.jButtonid_empleadoVisaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoVisaUpdate")) {
				this.jButtonid_empleadoVisaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoVisaBusqueda")) {
				this.jButtonid_empleadoVisaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionVisaBusqueda")) {
				this.jButtondescripcionVisaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoVisa")) {
				this.jButtonid_empleadoVisaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoVisa")) {
				this.jButtonFK_IdEmpleadoVisaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisVisa")) {
				this.jButtonFK_IdPaisVisaActionPerformed(evt);
			}
			
			;
			
			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVisa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				


				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Visa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Visa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Visa visaLocal=null;
			
			if(!this.getEsControlTabla()) {
				visaLocal=this.visa;
			} else {
				visaLocal=this.visaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
							
				
				


				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Visa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Visa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVisa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaAnterior =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visaAnterior =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
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
			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
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
			
			


			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
								
						
				


				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Visa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Visa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
								
				
				


				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Visa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Visa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVisa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaAnterior =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visaAnterior =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVisa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaAnterior =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visaAnterior =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
							
				
				


				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Visa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Visa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVisa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visaAnterior =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.visaAnterior =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
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
			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
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
			
			


			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
								
				
				


				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Visa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Visa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVisa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaAnterior =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visaAnterior =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVisa")) {
					jCheckBoxSeleccionarTodosVisaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVisa")) {
					jCheckBoxSeleccionadosVisaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVisa")) {
					
				}
				
				


				
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Visa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Visa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
												
				
				


				
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Visa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Visa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVisa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visaAnterior =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.visaAnterior =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
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
			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
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
			
			


			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Visa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Visa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visa);
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
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
				
				


				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Visa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Visa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVisa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visaAnterior =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visaAnterior =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVisa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVisaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVisa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.visa =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.visa =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.visa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVisa")) {
				
				}
				
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVisa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVisa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVisa")) {
			
			}
			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVisa();
			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
			if(sTipo.equals("NuevoVisa")) {
				jButtonNuevoVisaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVisa")) {
				jButtonDuplicarVisaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVisa")) {
				jButtonCopiarVisaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVisa")) {
				jButtonVerFormVisaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVisa")) {
				jButtonNuevoVisaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVisa")) {
				jButtonModificarVisaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVisa")) {
				jButtonActualizarVisaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVisa")) {
				jButtonEliminarVisaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVisa")) {
				jButtonGuardarCambiosVisaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVisa")) {
				jButtonCancelarVisaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVisa")) {
				jButtonCerrarVisaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVisa")) {
				jButtonGuardarCambiosVisaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVisa")) {
				jButtonNuevoGuardarCambiosVisaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVisa")) {
				jButtonAbrirOrderByVisaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVisa")) {
				jButtonRecargarInformacionVisaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVisa")) {
				jButtonAnterioresVisaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVisa")) {
				jButtonSiguientesVisaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVisaBusqueda")) {
				this.jButtonidVisaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVisaUpdate")) {
				this.jButtonid_empresaVisaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVisaBusqueda")) {
				this.jButtonid_empresaVisaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisVisaUpdate")) {
				this.jButtonid_paisVisaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisVisaBusqueda")) {
				this.jButtonid_paisVisaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoVisa")) {
				this.jButtonid_empleadoVisaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoVisaUpdate")) {
				this.jButtonid_empleadoVisaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoVisaBusqueda")) {
				this.jButtonid_empleadoVisaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionVisaBusqueda")) {
				this.jButtondescripcionVisaBusquedaActionPerformed(evt);
			}
			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVisa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVisa")) {
				closingInternalFrameVisa();
				
			} else if(sTipo.equals("jButtonCancelarVisa")) {
				JInternalFrameBase jInternalFrameDetalleFormVisa = (JInternalFrameBase)evt.getSource();
	            	
	            VisaBeanSwingJInternalFrame jInternalFrameParent=(VisaBeanSwingJInternalFrame)jInternalFrameDetalleFormVisa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVisaActionPerformed(null);
			}
			
			VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.visa,new Object(),this.visaParameterGeneral,this.visaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVisa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVisa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVisa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.visa)) {
			if(!esControlTabla) {
				if(VisaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVisa(this.visa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);			
				}
				
				if(this.visaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVisa(this.visa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.visaReturnGeneral=visaLogic.procesarEventosVisasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.visaLogic.getVisas(),this.visa,this.visaParameterGeneral,this.isEsNuevoVisa,classes);//this.visaLogic.getVisa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVisa(this.visaReturnGeneral,this.visaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.visaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVisa(classes,this.visaReturnGeneral,this.visaBean,false);
					}
						
					if(this.visaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVisa(this.visaReturnGeneral.getVisa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVisa(this.visaReturnGeneral.getVisa());	
					}
						
					if(this.visaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVisa(this.visaReturnGeneral.getVisa(),classes);//this.visaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVisa(this.visa,classes);//this.visaBean);									
				}
			
				if(VisaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVisa(this.visa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVisa(this.visa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.visaAnterior!=null) {
						this.visa=this.visaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.visaReturnGeneral=visaLogic.procesarEventosVisasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.visaLogic.getVisas(),this.visa,this.visaParameterGeneral,this.isEsNuevoVisa,classes);//this.visaLogic.getVisa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.visaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.visaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.visaReturnGeneral.getVisa(),visaLogic.getVisas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.visaReturnGeneral.getVisa(),this.visas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVisa.repaint();
				
				//((AbstractTableModel) this.jTableDatosVisa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVisa();
			}
		}
	}
	
	public void actualizarVisualTableDatosVisa() throws Exception {
		
		VisaModel visaModel=(VisaModel)this.jTableDatosVisa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			visaModel.visas=this.visaLogic.getVisas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			visaModel.visas=this.visas;
		}
		
		
		((VisaModel) this.jTableDatosVisa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVisa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvisaAnterior(),this.visaLogic.getVisas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvisaAnterior(),this.visas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVisa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVisa(Visa visa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
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
										
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.visa,new Object(),generalEntityParameterGeneral,this.visaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.visaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VisaConstantesFunciones.getClassesRelationshipsOfVisa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VisaConstantesFunciones.getClassesRelationshipsFromStringsOfVisa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVisa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VisaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.visa,new Object(),generalEntityParameterGeneral,this.visaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVisa(VisaBean visaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVisa(ArrayList<Classe> classes,VisaReturnGeneral visaReturnGeneral,VisaBean visaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVisa(Visa visa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.visa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVisa = new VisaDetalleFormJInternalFrame(jDesktopPane,this.visaSessionBean.getConGuardarRelaciones(),this.visaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVisa);
		this.jInternalFrameDetalleFormVisa.setVisible(false);
		this.jInternalFrameDetalleFormVisa.setSelected(false);						
		
		this.jInternalFrameDetalleFormVisa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVisa.visaLogic=this.visaLogic;
		
		this.cargarCombosFrameForeignKeyVisa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVisa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVisa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVisa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVisa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVisa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVisa"));
		
		this.jInternalFrameDetalleFormVisa.jButtonModificarVisa.addActionListener(new ButtonActionListener(this,"ModificarVisa"));

		
		this.jInternalFrameDetalleFormVisa.jButtonModificarToolBarVisa.addActionListener(new ButtonActionListener(this,"ModificarToolBarVisa"));
					
		this.jInternalFrameDetalleFormVisa.jMenuItemModificarVisa.addActionListener(new ButtonActionListener(this,"MenuItemModificarVisa"));		
		
		
		
		this.jInternalFrameDetalleFormVisa.jButtonActualizarVisa.addActionListener (new ButtonActionListener(this,"ActualizarVisa"));
		
		
		this.jInternalFrameDetalleFormVisa.jButtonActualizarToolBarVisa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVisa"));
						
		this.jInternalFrameDetalleFormVisa.jMenuItemActualizarVisa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVisa"));		
		
		
		
		this.jInternalFrameDetalleFormVisa.jButtonEliminarVisa.addActionListener (new ButtonActionListener(this,"EliminarVisa"));
		
		
		this.jInternalFrameDetalleFormVisa.jButtonEliminarToolBarVisa.addActionListener (new ButtonActionListener(this,"EliminarToolBarVisa"));
								
		this.jInternalFrameDetalleFormVisa.jMenuItemEliminarVisa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVisa"));		
		
		
		
		this.jInternalFrameDetalleFormVisa.jButtonCancelarVisa.addActionListener (new ButtonActionListener(this,"CancelarVisa"));
		
		
		this.jInternalFrameDetalleFormVisa.jButtonCancelarToolBarVisa.addActionListener (new ButtonActionListener(this,"CancelarToolBarVisa"));
					
		this.jInternalFrameDetalleFormVisa.jMenuItemCancelarVisa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVisa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVisa.jMenuItemDetalleCerrarVisa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVisa"));		
		
		
		
		this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosToolBarVisa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVisa"));
		
		
		
		this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosToolBarVisa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVisa"));
		
		
		
		this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVisa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonidVisaBusqueda.addActionListener(new ButtonActionListener(this,"idVisaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisa.jButtonid_empresaVisaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVisaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonid_empresaVisaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVisaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisa.jButtonid_paisVisaUpdate.addActionListener(new ButtonActionListener(this,"id_paisVisaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonid_paisVisaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisVisaBusqueda"));
		//jButtonid_empleadoVisa.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoVisaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVisa.jButtonid_empleadoVisa.addActionListener(new ButtonActionListener(this,"id_empleadoVisa"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisa.jButtonid_empleadoVisaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoVisaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonid_empleadoVisaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoVisaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtondescripcionVisaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionVisaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVisa.jTabbedPaneRelacionesVisa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVisa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVisa"));
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVisa"));
		}
		
		this.jTableDatosVisa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVisa"));
		
		this.jTableDatosVisa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVisa"));
		
		this.jButtonNuevoVisa.addActionListener(new ButtonActionListener(this,"NuevoVisa"));
		
		this.jButtonDuplicarVisa.addActionListener(new ButtonActionListener(this,"DuplicarVisa"));
		
		this.jButtonCopiarVisa.addActionListener(new ButtonActionListener(this,"CopiarVisa"));
		
		this.jButtonVerFormVisa.addActionListener(new ButtonActionListener(this,"VerFormVisa"));
		
		
		this.jButtonNuevoToolBarVisa.addActionListener(new ButtonActionListener(this,"NuevoToolBarVisa"));
			
		this.jButtonDuplicarToolBarVisa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVisa"));
			
		this.jMenuItemNuevoVisa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVisa"));
			
		this.jMenuItemDuplicarVisa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVisa"));		
		
		
		this.jButtonNuevoRelacionesVisa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVisa"));
		
		
		this.jButtonNuevoRelacionesToolBarVisa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVisa"));
			
		this.jMenuItemNuevoRelacionesVisa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVisa"));		
		
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jButtonModificarVisa.addActionListener(new ButtonActionListener(this,"ModificarVisa"));
		}
		
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jButtonModificarToolBarVisa.addActionListener(new ButtonActionListener(this,"ModificarToolBarVisa"));
			
			this.jInternalFrameDetalleFormVisa.jMenuItemModificarVisa.addActionListener(new ButtonActionListener(this,"MenuItemModificarVisa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVisa.jButtonActualizarVisa.addActionListener (new ButtonActionListener(this,"ActualizarVisa"));
		}
		
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jButtonActualizarToolBarVisa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVisa"));
				
			this.jInternalFrameDetalleFormVisa.jMenuItemActualizarVisa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVisa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jButtonEliminarVisa.addActionListener (new ButtonActionListener(this,"EliminarVisa"));
		}
		
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jButtonEliminarToolBarVisa.addActionListener (new ButtonActionListener(this,"EliminarToolBarVisa"));
						
			this.jInternalFrameDetalleFormVisa.jMenuItemEliminarVisa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVisa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jButtonCancelarVisa.addActionListener (new ButtonActionListener(this,"CancelarVisa"));
		}
		
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jButtonCancelarToolBarVisa.addActionListener (new ButtonActionListener(this,"CancelarToolBarVisa"));
			
			this.jInternalFrameDetalleFormVisa.jMenuItemCancelarVisa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVisa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVisa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVisa"));		
		
		
		this.jButtonCerrarVisa.addActionListener (new ButtonActionListener(this,"CerrarVisa"));
		
		
		this.jButtonCerrarToolBarVisa.addActionListener (new ButtonActionListener(this,"CerrarToolBarVisa"));
			
		this.jMenuItemCerrarVisa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVisa"));
			
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jMenuItemDetalleCerrarVisa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVisa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosVisa.addActionListener (new ButtonActionListener(this,"GuardarCambiosVisa"));
		}
		
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosToolBarVisa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVisa"));
		}
		
		this.jButtonCopiarToolBarVisa.addActionListener (new ButtonActionListener(this,"CopiarToolBarVisa"));
			
		this.jButtonVerFormToolBarVisa.addActionListener (new ButtonActionListener(this,"VerFormToolBarVisa"));
		
		this.jMenuItemGuardarCambiosVisa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVisa"));
			
		this.jMenuItemCopiarVisa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVisa"));		
		
		this.jMenuItemVerFormVisa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVisa"));		
		
		
		this.jButtonGuardarCambiosTablaVisa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVisa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVisa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVisa"));
			
		this.jMenuItemGuardarCambiosTablaVisa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVisa"));		
		
		
		
		this.jButtonRecargarInformacionVisa.addActionListener (new ButtonActionListener(this,"RecargarInformacionVisa"));
					
		this.jButtonRecargarInformacionToolBarVisa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVisa"));
		
		this.jMenuItemRecargarInformacionVisa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVisa"));		
		
		
		
		this.jButtonAnterioresVisa.addActionListener (new ButtonActionListener(this,"AnterioresVisa"));
		
		
		this.jButtonAnterioresToolBarVisa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVisa"));
		
		this.jMenuItemAnterioresVisa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVisa"));		
		
		
		this.jButtonSiguientesVisa.addActionListener (new ButtonActionListener(this,"SiguientesVisa"));
		
		
		this.jButtonSiguientesToolBarVisa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVisa"));
			
		this.jMenuItemSiguientesVisa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVisa"));
			
		this.jMenuItemAbrirOrderByVisa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVisa"));
			
		this.jMenuItemMostrarOcultarVisa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVisa"));
			
		this.jMenuItemDetalleAbrirOrderByVisa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVisa"));
			
		this.jMenuItemDetalleMostarOcultarVisa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVisa"));		
		
		
		this.jButtonNuevoGuardarCambiosVisa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVisa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVisa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVisa"));
			
		this.jMenuItemNuevoGuardarCambiosVisa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVisa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVisa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVisa"));

		this.jCheckBoxSeleccionadosVisa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVisa"));
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVisa"));
		}
		
		
		this.jComboBoxTiposRelacionesVisa.addActionListener (new ButtonActionListener(this,"TiposRelacionesVisa"));
			
		this.jComboBoxTiposAccionesVisa.addActionListener (new ButtonActionListener(this,"TiposAccionesVisa"));
					
		this.jComboBoxTiposSeleccionarVisa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVisa"));
			
		this.jTextFieldValorCampoGeneralVisa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVisa"));		
		
		
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonidVisaBusqueda.addActionListener(new ButtonActionListener(this,"idVisaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisa.jButtonid_empresaVisaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVisaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonid_empresaVisaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVisaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisa.jButtonid_paisVisaUpdate.addActionListener(new ButtonActionListener(this,"id_paisVisaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonid_paisVisaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisVisaBusqueda"));
		//jButtonid_empleadoVisa.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoVisaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVisa.jButtonid_empleadoVisa.addActionListener(new ButtonActionListener(this,"id_empleadoVisa"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisa.jButtonid_empleadoVisaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoVisaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonid_empleadoVisaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoVisaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtondescripcionVisaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionVisaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoVisa.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoVisa"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoVisa.addActionListener(new ButtonActionListener(this,"id_empleadoVisa"));

			this.jButtonFK_IdPaisVisa.addActionListener(new ButtonActionListener(this,"FK_IdPaisVisa"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVisa!=null) {
				this.jInternalFrameReporteDinamicoVisa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVisa"));
				this.jInternalFrameReporteDinamicoVisa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVisa"));
				this.jInternalFrameReporteDinamicoVisa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVisa"));
			}
			
			//this.jButtonCerrarReporteDinamicoVisa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVisa"));				
			//this.jButtonGenerarReporteDinamicoVisa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVisa"));
			//this.jButtonGenerarExcelReporteDinamicoVisa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVisa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVisa!=null) {
				this.jInternalFrameImportacionVisa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVisa"));
				this.jInternalFrameImportacionVisa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVisa"));
				this.jInternalFrameImportacionVisa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVisa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVisa.addActionListener (new ButtonActionListener(this,"AbrirOrderByVisa"));
			
			this.jButtonAbrirOrderByToolBarVisa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVisa"));			
			
			if(this.jInternalFrameOrderByVisa!=null) {
				this.jInternalFrameOrderByVisa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVisa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVisa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisa.jTabbedPaneRelacionesVisa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVisa"));
		
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
            		closingInternalFrameVisa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVisa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVisa = (JInternalFrameBase)event.getSource();
	            	
	            VisaBeanSwingJInternalFrame jInternalFrameParent=(VisaBeanSwingJInternalFrame)jInternalFrameDetalleFormVisa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVisaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVisa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVisaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVisa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVisa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVisa";
		inputMap = this.jButtonNuevoVisa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVisa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVisaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVisa";
		inputMap = this.jButtonNuevoRelacionesVisa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVisa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVisaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVisa";
		inputMap = this.jButtonModificarVisa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVisa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVisaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVisa";
		inputMap = this.jButtonActualizarVisa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVisa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVisaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVisa";
		inputMap = this.jButtonEliminarVisa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVisa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVisaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVisa";
		inputMap = this.jButtonCancelarVisa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVisa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVisaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVisa";
		inputMap = this.jButtonCerrarVisa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVisa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVisaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVisa";
		inputMap = this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosVisa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVisa.jButtonGuardarCambiosVisa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVisaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVisa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVisaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVisa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVisaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVisa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVisaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVisa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVisaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonidVisaBusqueda.addActionListener(new ButtonActionListener(this,"idVisaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisa.jButtonid_empresaVisaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVisaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonid_empresaVisaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVisaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisa.jButtonid_paisVisaUpdate.addActionListener(new ButtonActionListener(this,"id_paisVisaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonid_paisVisaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisVisaBusqueda"));
		//jButtonid_empleadoVisa.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoVisaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVisa.jButtonid_empleadoVisa.addActionListener(new ButtonActionListener(this,"id_empleadoVisa"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisa.jButtonid_empleadoVisaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoVisaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtonid_empleadoVisaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoVisaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisa.jButtondescripcionVisaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionVisaBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoVisa.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoVisa"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoVisa.addActionListener(new ButtonActionListener(this,"id_empleadoVisa"));

		this.jButtonFK_IdPaisVisa.addActionListener(new ButtonActionListener(this,"FK_IdPaisVisa"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVisa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVisaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVisaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVisa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVisa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Visa visaAux:this.visaLogic.getVisas()) {
					visaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Visa visaAux:visas) {
					visaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVisaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVisa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Visa visaAux:this.visaLogic.getVisas()) {
						visaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Visa visaAux:visas) {
						visaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Visa visaAux:this.visaLogic.getVisas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Visa visaAux:visas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVisa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVisa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVisa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVisa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVisaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVisa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVisa.getSelectedRows();
			
			Visa visaLocal=new Visa();
			
			//this.seleccionarTodosVisa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					visaLocal =(Visa) this.visaLogic.getVisas().toArray()[this.jTableDatosVisa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					visaLocal =(Visa) this.visas.toArray()[this.jTableDatosVisa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				visaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Visa visaAux:this.visaLogic.getVisas()) {
						visaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Visa visaAux:visas) {
						visaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVisa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVisa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVisa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVisa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVisaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVisaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVisaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVisa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVisa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Visa visaAux:this.visaLogic.getVisas()) {
				
						if(sTipoSeleccionar.equals(VisaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							visaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Visa visaAux:visas) {
					
						if(sTipoSeleccionar.equals(VisaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							visaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVisa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVisaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVisa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVisa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVisa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVisa) {				
					conSplash=true;//false;										
					
					//this.startProcessVisa(conSplash);
				
					this.generarReporteVisasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVisa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVisasSeleccionados();
				//this.jComboBoxTiposAccionesVisa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVisasSeleccionados(false);
				//this.jComboBoxTiposAccionesVisa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVisasSeleccionados(true);
				//this.jComboBoxTiposAccionesVisa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVisa();
				
				this.exportarVisasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVisa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVisas();
				//this.importarVisas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVisa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVisa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVisasSeleccionados();
				//this.jComboBoxTiposAccionesVisa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Visa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVisa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVisa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVisa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Visa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVisa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.setSelectedIndex(0);					
				}	
			} 			
			else if(VisaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVisa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVisa(conSplash);
					
						//this.actualizarParametrosGeneralVisa();
						
						this.generarReporteProcesoAccionVisasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVisa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VisaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO VisaS SELECCIONADOS?", "MANTENIMIENTO DE Visa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVisa();
				
						this.actualizarParametrosGeneralVisa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.visaReturnGeneral=visaLogic.procesarAccionVisasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.visaLogic.getVisas(),this.visaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVisaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVisa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVisa();
					
					VisaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVisaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVisa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVisa.jComboBoxTiposAccionesFormularioVisa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVisa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVisaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVisa();
			
			if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();		
			Visa visa=new Visa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVisa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVisa.getSelectedItem();
			
			
			
			
			visasSeleccionados=this.getVisasSeleccionados(true);
			//this.sTipoAccion;
			
			if(visasSeleccionados.size()==1) {
				for(Visa visaAux:visasSeleccionados) {
					visa=visaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVisa();
			
      		//this.finishProcessVisa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVisaReturnGeneral() throws Exception {
		if(this.visaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.visaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.visaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.visaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.visaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.visaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVisa(false);
		}
		
		if(this.visaReturnGeneral.getConRetornoLista() || this.visaReturnGeneral.getConRetornoObjeto()) {
			if(this.visaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.visaLogic.setVisas(this.visaReturnGeneral.getVisas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.visaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.visaLogic.setVisa(this.visaReturnGeneral.getVisa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingVisa(false);
		}
	}
	
	public void actualizarParametrosGeneralVisa() throws Exception {
		
		
	}
	
	public ArrayList<Visa> getVisasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVisa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Visa visaAux:visaLogic.getVisas()) {
					if(visaAux.getIsSelected()) {
						visasSeleccionados.add(visaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Visa visaAux:this.visas) {
					if(visaAux.getIsSelected()) {
						visasSeleccionados.add(visaAux);				
					}
				}
			}
			
			if(visasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						visasSeleccionados.addAll(this.visaLogic.getVisas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						visasSeleccionados.addAll(this.visas);				
					}
				}
			}
		} else {
			visasSeleccionados.add(this.visa);
		}
		
		return visasSeleccionados;
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
	
	public void generarReporteVisasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVisasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVisasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVisasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVisasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Visa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVisasSeleccionados() throws Exception {
		ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();		
		
		visasSeleccionados=this.getVisasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVisas("Todos",visasSeleccionados);
		
	}	
	
	public void generarReporteNormalVisasSeleccionados() throws Exception {
		ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();		
		
		visasSeleccionados=this.getVisasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVisas("Todos",visasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVisasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();
		
		visasSeleccionados=this.getVisasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVisas("Todos",visasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVisasSeleccionados() throws Exception {
		ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVisa();
		
		
		visasSeleccionados=this.getVisasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVisa();
		
		
		//this.generarReporteVisas("Todos",visasSeleccionados ,visaImplementable,visaImplementableHome);
	}
	
	public void mostrarImportacionVisas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVisa();
		
		this.abrirFrameImportacionVisa();		
		
			
		//this.generarReporteVisas("Todos",visasSeleccionados ,visaImplementable,visaImplementableHome);
	}
	
	public void importarVisas() throws Exception {		
	
	}
	
	public void exportarVisasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVisasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVisasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVisasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Visa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVisasSeleccionados() throws Exception {
		ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();		
		
		visasSeleccionados=this.getVisasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVisa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Visa visaAux:visasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVisa(visaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//visaAux.setsDetalleGeneralEntityReporte(visaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVisa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VisaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisaConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisaConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVisa(Visa visa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=visa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=visa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=visa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visa.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visa.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visa.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVisasSeleccionados() throws Exception {
		ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();		
		
		visasSeleccionados=this.getVisasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Visas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVisa(row);				
				iRow++;
			}				
			
			for(Visa visaAux:visasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVisa(visaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVisasSeleccionados() throws Exception {
		ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();		
		
		visasSeleccionados=this.getVisasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("visas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("visa");
			//elementRoot.appendChild(element);
		
			for(Visa visaAux:visasSeleccionados) {
				element = document.createElement("visa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVisa(visaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVisa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VisaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VisaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VisaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VisaConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(VisaConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(VisaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVisa(Visa visa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(visa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(visa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(visa.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(visa.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(visa.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlVisa(Visa visa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VisaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(visa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VisaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(visa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VisaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(visa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementpais_descripcion = document.createElement(VisaConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(visa.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementempleado_descripcion = document.createElement(VisaConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(visa.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementdescripcion = document.createElement(VisaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(visa.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoVisasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Visa> visasSeleccionados=new ArrayList<Visa>();
		
		visasSeleccionados=this.getVisasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVisa(visasSeleccionados);
		
		this.generarReporteVisas("Todos",visasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVisa(ArrayList<Visa> visasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Visa visaAux:visasSeleccionados) {
				visaAux.setsDetalleGeneralEntityReporte(visaAux.toString());
			
				if(sTipoSeleccionar.equals(VisaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					visaAux.setsDescripcionGeneralEntityReporte1(visaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VisaConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					visaAux.setsDescripcionGeneralEntityReporte1(visaAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VisaConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					visaAux.setsDescripcionGeneralEntityReporte1(visaAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VisaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					visaAux.setsDescripcionGeneralEntityReporte1(visaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVisa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVisa=true;
				this.isVisibilidadCeldaNuevoRelacionesVisa=true;
				this.isVisibilidadCeldaGuardarCambiosVisa=true;
			}
			
			this.isVisibilidadCeldaModificarVisa=false;
			this.isVisibilidadCeldaActualizarVisa=false;
			this.isVisibilidadCeldaEliminarVisa=false;
			this.isVisibilidadCeldaCancelarVisa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisa=true;
				} else {
					this.isVisibilidadCeldaGuardarVisa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVisa=false;
			this.isVisibilidadCeldaNuevoRelacionesVisa=false;
			this.isVisibilidadCeldaGuardarCambiosVisa=false;
			this.isVisibilidadCeldaModificarVisa=false;
			this.isVisibilidadCeldaActualizarVisa=true;
			this.isVisibilidadCeldaEliminarVisa=false;
			this.isVisibilidadCeldaCancelarVisa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisa=true;
				} else {
					this.isVisibilidadCeldaGuardarVisa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVisa=false;
			this.isVisibilidadCeldaNuevoRelacionesVisa=false;
			this.isVisibilidadCeldaGuardarCambiosVisa=false;
			this.isVisibilidadCeldaModificarVisa=false;
			this.isVisibilidadCeldaActualizarVisa=true;
			this.isVisibilidadCeldaEliminarVisa=true;
			this.isVisibilidadCeldaCancelarVisa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisa=true;
				} else {
					this.isVisibilidadCeldaGuardarVisa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVisa=false;
			this.isVisibilidadCeldaNuevoRelacionesVisa=false;
			this.isVisibilidadCeldaGuardarCambiosVisa=false;
			this.isVisibilidadCeldaModificarVisa=false;
			this.isVisibilidadCeldaActualizarVisa=true;
			this.isVisibilidadCeldaEliminarVisa=false;
			this.isVisibilidadCeldaCancelarVisa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisa=false;
				} else {
					this.isVisibilidadCeldaGuardarVisa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVisa=true;
			this.isVisibilidadCeldaNuevoRelacionesVisa=true;
			this.isVisibilidadCeldaGuardarCambiosVisa=true;
			this.isVisibilidadCeldaModificarVisa=false;
			this.isVisibilidadCeldaActualizarVisa=false;
			this.isVisibilidadCeldaEliminarVisa=false;
			this.isVisibilidadCeldaCancelarVisa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisa=true;
				} else {
					this.isVisibilidadCeldaGuardarVisa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVisa=false;
			this.isVisibilidadCeldaNuevoRelacionesVisa=false;
			this.isVisibilidadCeldaGuardarCambiosVisa=false;
			this.isVisibilidadCeldaActualizarVisa=false;
			this.isVisibilidadCeldaEliminarVisa=false;
			this.isVisibilidadCeldaCancelarVisa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisa=false;
				} else {
					this.isVisibilidadCeldaGuardarVisa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVisa=false;
			this.isVisibilidadCeldaNuevoRelacionesVisa=false;
			this.isVisibilidadCeldaGuardarCambiosVisa=false;
			this.isVisibilidadCeldaModificarVisa=true;
			this.isVisibilidadCeldaActualizarVisa=false;
			this.isVisibilidadCeldaEliminarVisa=false;
			this.isVisibilidadCeldaCancelarVisa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisa=false;
				} else {
					this.isVisibilidadCeldaGuardarVisa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VisaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVisa=true;
			this.isVisibilidadCeldaNuevoRelacionesVisa=true;
			this.isVisibilidadCeldaGuardarCambiosVisa=true;
		} else {
			this.actualizarEstadoPanelsVisa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVisa=false;
			//this.isVisibilidadCeldaVerFormVisa=false;
			this.isVisibilidadCeldaDuplicarVisa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!visaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVisa=false;
		} else {
			this.isVisibilidadCeldaNuevoVisa=false;
			this.isVisibilidadCeldaGuardarCambiosVisa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(visaSessionBean.getEsGuardarRelacionado()) {
			if(!visaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVisa=false;												
			}
			
			this.jButtonCerrarVisa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVisa=false;
		}
		
		if(!this.permiteMantenimiento(this.visa)) {
			this.isVisibilidadCeldaActualizarVisa=false;
			this.isVisibilidadCeldaEliminarVisa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVisa() {
	}
	
	public void actualizarEstadoPanelsVisa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVisa!=null) {
				this.jScrollPanelDatosEdicionVisa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisa!=null) {
				this.jTabbedPaneBusquedasVisa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVisa!=null) {
				this.jScrollPanelDatosVisa.setVisible(true);
			}
			
			if(this.jPanelPaginacionVisa!=null) {
				this.jPanelPaginacionVisa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVisa!=null) {
				this.jPanelParametrosReportesVisa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVisa!=null) {
				this.jScrollPanelDatosEdicionVisa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisa!=null) {
				this.jTabbedPaneBusquedasVisa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVisa!=null) {
				this.jScrollPanelDatosVisa.setVisible(false);
			}
			
			if(this.jPanelPaginacionVisa!=null) {
				this.jPanelPaginacionVisa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVisa!=null) {
				this.jPanelParametrosReportesVisa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVisa!=null) {
				this.jScrollPanelDatosEdicionVisa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisa!=null) {
				this.jTabbedPaneBusquedasVisa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVisa!=null) {
				this.jScrollPanelDatosVisa.setVisible(false);
			}
			
			if(this.jPanelPaginacionVisa!=null) {
				this.jPanelPaginacionVisa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVisa!=null) {
				this.jPanelParametrosReportesVisa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVisa!=null) {
				this.jScrollPanelDatosEdicionVisa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisa!=null) {
				this.jTabbedPaneBusquedasVisa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVisa!=null) {
				this.jScrollPanelDatosVisa.setVisible(false);
			}
			
			if(this.jPanelPaginacionVisa!=null) {
				this.jPanelPaginacionVisa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVisa!=null) {
				this.jPanelParametrosReportesVisa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVisa!=null) {
				this.jScrollPanelDatosEdicionVisa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisa!=null) {
				this.jTabbedPaneBusquedasVisa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVisa!=null) {
				this.jScrollPanelDatosVisa.setVisible(true);
			}
			
			if(this.jPanelPaginacionVisa!=null) {
				this.jPanelPaginacionVisa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVisa!=null) {
				this.jPanelParametrosReportesVisa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVisa!=null) {
				this.jScrollPanelDatosEdicionVisa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisa!=null) {
				this.jTabbedPaneBusquedasVisa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVisa!=null) {
				this.jScrollPanelDatosVisa.setVisible(true);
			}
			
			if(this.jPanelPaginacionVisa!=null) {
				this.jPanelPaginacionVisa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVisa!=null) {
				this.jPanelParametrosReportesVisa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVisa!=null) {
				this.jScrollPanelDatosEdicionVisa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisa!=null) {
				this.jTabbedPaneBusquedasVisa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVisa!=null) {
				this.jScrollPanelDatosVisa.setVisible(true);
			}
			
			if(this.jPanelPaginacionVisa!=null) {
				this.jPanelPaginacionVisa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVisa!=null) {
				this.jPanelParametrosReportesVisa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.visaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVisa!=null) {
					this.jTabbedPaneBusquedasVisa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVisa!=null) {
				this.jPanelParametrosReportesVisa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.visaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisa!=null) {
				this.jTabbedPaneBusquedasVisa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVisa!=null) {
				this.jPanelParametrosReportesVisa.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasVisa.remove(jPanelFK_IdEmpleadoVisa);}

			this.isVisibilidadFK_IdPais=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasVisa.remove(jPanelFK_IdPaisVisa);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdEmpleado=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasVisa.remove(jPanelFK_IdEmpleadoVisa);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasVisa.remove(jPanelFK_IdPaisVisa);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasVisa.remove(jPanelFK_IdEmpleadoVisa);}

			this.isVisibilidadFK_IdPais=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasVisa.remove(jPanelFK_IdPaisVisa);}
		}
		
	}
	
	
	
	

	public String registrarSesionVisaParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(visaSessionBean==null) {
				visaSessionBean=new VisaSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(visaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.visaFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(VisaConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionVisa(true);
			//empleadoSessionBean.setlidVisaActual(this.idVisaActual);

			visaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyVisa(true);
			visaSessionBean.setlIdVisaActualForeignKey(this.idVisaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//VisaSessionBean visaSessionBean=new VisaSessionBean();
		
		if(this.visaSessionBean==null) {
			this.visaSessionBean=new VisaSessionBean();
		}
		
		this.visaSessionBean.setsUltimaBusquedaVisa(this.getsAccionBusqueda());
		this.visaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.visaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			visaSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			visaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			visaSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//VisaSessionBean visaSessionBean=new VisaSessionBean();
		
		if(this.visaSessionBean==null) {
			this.visaSessionBean=new VisaSessionBean();
		}
		
		if(this.visaSessionBean.getsUltimaBusquedaVisa()!=null&&!this.visaSessionBean.getsUltimaBusquedaVisa().equals("")) {
			this.setsAccionBusqueda(visaSessionBean.getsUltimaBusquedaVisa());
			this.setiNumeroPaginacion(visaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(visaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(visaSessionBean.getid_empleado());
				visaSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(visaSessionBean.getid_empresa());
				visaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(visaSessionBean.getid_pais());
				visaSessionBean.setid_pais(-1L);
			}
		}
		
		this.visaSessionBean.setsUltimaBusquedaVisa("");
		this.visaSessionBean.setiNumeroPaginacion(VisaConstantesFunciones.INUMEROPAGINACION);
		this.visaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaVisa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVisa() {
		this.updateBorderResaltarBusquedasFormularioVisa();
		this.updateVisibilidadBusquedasFormularioVisa();
		this.updateHabilitarBusquedasFormularioVisa();
	}
	
	public void updateBorderResaltarBusquedasFormularioVisa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVisa.getComponents().length>0) {
	

		if(this.visaConstantesFunciones.resaltarFK_IdEmpleadoVisa!=null) {
			index= this.jTabbedPaneBusquedasVisa.indexOfComponent(this.jPanelFK_IdEmpleadoVisa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVisa.getComponent(index);
				jPanel.setBorder(this.visaConstantesFunciones.resaltarFK_IdEmpleadoVisa);
			}
		}

		if(this.visaConstantesFunciones.resaltarFK_IdPaisVisa!=null) {
			index= this.jTabbedPaneBusquedasVisa.indexOfComponent(this.jPanelFK_IdPaisVisa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVisa.getComponent(index);
				jPanel.setBorder(this.visaConstantesFunciones.resaltarFK_IdPaisVisa);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVisa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVisa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVisa.indexOfComponent(this.jPanelFK_IdEmpleadoVisa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVisa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.visaConstantesFunciones.mostrarFK_IdEmpleadoVisa);
			if(!this.visaConstantesFunciones.mostrarFK_IdEmpleadoVisa && index>-1) {
				this.jTabbedPaneBusquedasVisa.remove(index);
			}

			index= this.jTabbedPaneBusquedasVisa.indexOfComponent(this.jPanelFK_IdPaisVisa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVisa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.visaConstantesFunciones.mostrarFK_IdPaisVisa);
			if(!this.visaConstantesFunciones.mostrarFK_IdPaisVisa && index>-1) {
				this.jTabbedPaneBusquedasVisa.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVisa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVisa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVisa.indexOfComponent(this.jPanelFK_IdEmpleadoVisa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVisa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.visaConstantesFunciones.activarFK_IdEmpleadoVisa);
				this.jTabbedPaneBusquedasVisa.setEnabledAt(index,this.visaConstantesFunciones.activarFK_IdEmpleadoVisa);
			}

			index= this.jTabbedPaneBusquedasVisa.indexOfComponent(this.jPanelFK_IdPaisVisa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVisa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.visaConstantesFunciones.activarFK_IdPaisVisa);
				this.jTabbedPaneBusquedasVisa.setEnabledAt(index,this.visaConstantesFunciones.activarFK_IdPaisVisa);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVisa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasVisa.indexOfComponent(this.jPanelFK_IdEmpleadoVisa);

			this.jTabbedPaneBusquedasVisa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVisa.getComponent(index);

			this.visaConstantesFunciones.setResaltarFK_IdEmpleadoVisa(resaltar);

			jPanel.setBorder(this.visaConstantesFunciones.resaltarFK_IdEmpleadoVisa);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasVisa.indexOfComponent(this.jPanelFK_IdPaisVisa);

			this.jTabbedPaneBusquedasVisa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVisa.getComponent(index);

			this.visaConstantesFunciones.setResaltarFK_IdPaisVisa(resaltar);

			jPanel.setBorder(this.visaConstantesFunciones.resaltarFK_IdPaisVisa);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVisa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVisa() throws Exception {

		if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVisa();
		this.updateVisibilidadResaltarControlesFormularioVisa();
		this.updateHabilitarResaltarControlesFormularioVisa();
		
	}
	
	public void updateBorderResaltarControlesFormularioVisa() throws Exception {
		if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.visaConstantesFunciones.resaltaridVisa!=null && this.jInternalFrameDetalleFormVisa!=null) {this.jInternalFrameDetalleFormVisa.jLabelidVisa.setBorder(this.visaConstantesFunciones.resaltaridVisa);}
		if(this.visaConstantesFunciones.resaltarid_empresaVisa!=null && this.jInternalFrameDetalleFormVisa!=null) {this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.setBorder(this.visaConstantesFunciones.resaltarid_empresaVisa);}
		if(this.visaConstantesFunciones.resaltarid_paisVisa!=null && this.jInternalFrameDetalleFormVisa!=null) {this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.setBorder(this.visaConstantesFunciones.resaltarid_paisVisa);}
		if(this.visaConstantesFunciones.resaltarid_empleadoVisa!=null && this.jInternalFrameDetalleFormVisa!=null) {this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.setBorder(this.visaConstantesFunciones.resaltarid_empleadoVisa);}
		if(this.visaConstantesFunciones.resaltardescripcionVisa!=null && this.jInternalFrameDetalleFormVisa!=null) {this.jInternalFrameDetalleFormVisa.jTextAreadescripcionVisa.setBorder(this.visaConstantesFunciones.resaltardescripcionVisa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVisa() throws Exception {		
		if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVisa!=null) {
	
		//this.jInternalFrameDetalleFormVisa.jLabelidVisa.setVisible(this.visaConstantesFunciones.mostraridVisa);
		this.jInternalFrameDetalleFormVisa.jPanelidVisa.setVisible(this.visaConstantesFunciones.mostraridVisa);
		//this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.setVisible(this.visaConstantesFunciones.mostrarid_empresaVisa);
		this.jInternalFrameDetalleFormVisa.jPanelid_empresaVisa.setVisible(this.visaConstantesFunciones.mostrarid_empresaVisa);
		//this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.setVisible(this.visaConstantesFunciones.mostrarid_paisVisa);
		this.jInternalFrameDetalleFormVisa.jPanelid_paisVisa.setVisible(this.visaConstantesFunciones.mostrarid_paisVisa);
		//this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.setVisible(this.visaConstantesFunciones.mostrarid_empleadoVisa);
		this.jInternalFrameDetalleFormVisa.jPanelid_empleadoVisa.setVisible(this.visaConstantesFunciones.mostrarid_empleadoVisa);
			this.jInternalFrameDetalleFormVisa.jButtonid_empleadoVisa.setVisible(this.visaConstantesFunciones.mostrarid_empleadoVisa);
		//this.jInternalFrameDetalleFormVisa.jTextAreadescripcionVisa.setVisible(this.visaConstantesFunciones.mostrardescripcionVisa);
		this.jInternalFrameDetalleFormVisa.jPaneldescripcionVisa.setVisible(this.visaConstantesFunciones.mostrardescripcionVisa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVisa() throws Exception {
		if(this.jInternalFrameDetalleFormVisa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVisa!=null) {
	
		this.jInternalFrameDetalleFormVisa.jLabelidVisa.setEnabled(this.visaConstantesFunciones.activaridVisa);
		this.jInternalFrameDetalleFormVisa.jComboBoxid_empresaVisa.setEnabled(this.visaConstantesFunciones.activarid_empresaVisa);
		this.jInternalFrameDetalleFormVisa.jComboBoxid_paisVisa.setEnabled(this.visaConstantesFunciones.activarid_paisVisa);
		this.jInternalFrameDetalleFormVisa.jComboBoxid_empleadoVisa.setEnabled(this.visaConstantesFunciones.activarid_empleadoVisa);
			this.jInternalFrameDetalleFormVisa.jButtonid_empleadoVisa.setEnabled(this.visaConstantesFunciones.activarid_empleadoVisa);
		this.jInternalFrameDetalleFormVisa.jTextAreadescripcionVisa.setEnabled(this.visaConstantesFunciones.activardescripcionVisa);
		}
	}
	
		
}