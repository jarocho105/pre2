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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.NivelCuentaContableConstantesFunciones;
import com.bydan.erp.contabilidad.util.NivelCuentaContableParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.NivelCuentaContableParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.NivelCuentaContableBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class NivelCuentaContableBeanSwingJInternalFrame extends NivelCuentaContableJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NivelCuentaContableBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<NivelCuentaContable> nivelcuentacontableValidator = new ClassValidator<NivelCuentaContable>(NivelCuentaContable.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public NivelCuentaContable nivelcuentacontable;	
	public NivelCuentaContable nivelcuentacontableAux;
	public NivelCuentaContable nivelcuentacontableAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public NivelCuentaContable nivelcuentacontableTotales;
	public Long idNivelCuentaContableActual;
	public Long iIdNuevoNivelCuentaContable=0L;
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
	
	public Boolean isPermisoTodoNivelCuentaContable;
	public Boolean isPermisoNuevoNivelCuentaContable;
	public Boolean isPermisoActualizarNivelCuentaContable;
	public Boolean isPermisoActualizarOriginalNivelCuentaContable;
	public Boolean isPermisoEliminarNivelCuentaContable;
	public Boolean isPermisoGuardarCambiosNivelCuentaContable;
	public Boolean isPermisoConsultaNivelCuentaContable;
	public Boolean isPermisoBusquedaNivelCuentaContable;
	public Boolean isPermisoReporteNivelCuentaContable;
	public Boolean isPermisoPaginacionMedioNivelCuentaContable;
	public Boolean isPermisoPaginacionAltoNivelCuentaContable;
	public Boolean isPermisoPaginacionTodoNivelCuentaContable;
	public Boolean isPermisoCopiarNivelCuentaContable;
	public Boolean isPermisoVerFormNivelCuentaContable;
	public Boolean isPermisoDuplicarNivelCuentaContable;
	public Boolean isPermisoOrdenNivelCuentaContable;
	
	
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
	
	public NivelCuentaContableParameterReturnGeneral nivelcuentacontableReturnGeneral;
	public NivelCuentaContableParameterReturnGeneral nivelcuentacontableParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNivelCuentaContable=false;
	public Boolean esParaAccionDesdeFormularioNivelCuentaContable=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NivelCuentaContableSessionBeanAdditional nivelcuentacontableSessionBeanAdditional=null;
	
	public NivelCuentaContableSessionBeanAdditional getNivelCuentaContableSessionBeanAdditional() {
		return this.nivelcuentacontableSessionBeanAdditional;
	}
	
	public void setNivelCuentaContableSessionBeanAdditional(NivelCuentaContableSessionBeanAdditional nivelcuentacontableSessionBeanAdditional) {
		try {
			this.nivelcuentacontableSessionBeanAdditional=nivelcuentacontableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NivelCuentaContableBeanSwingJInternalFrameAdditional nivelcuentacontableBeanSwingJInternalFrameAdditional=null;
	//public class NivelCuentaContableBeanSwingJInternalFrame
	
	public NivelCuentaContableBeanSwingJInternalFrameAdditional getNivelCuentaContableBeanSwingJInternalFrameAdditional() {
		return this.nivelcuentacontableBeanSwingJInternalFrameAdditional;
	}
	
	public void setNivelCuentaContableBeanSwingJInternalFrameAdditional(NivelCuentaContableBeanSwingJInternalFrameAdditional nivelcuentacontableBeanSwingJInternalFrameAdditional) {
		try {
			this.nivelcuentacontableBeanSwingJInternalFrameAdditional=nivelcuentacontableBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NivelCuentaContableLogic nivelcuentacontableLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public NivelCuentaContable nivelcuentacontableBean;
	public NivelCuentaContableConstantesFunciones nivelcuentacontableConstantesFunciones;
	//public NivelCuentaContableParameterReturnGeneral nivelcuentacontableReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<NivelCuentaContable> nivelcuentacontables;	
	//public List<NivelCuentaContable> nivelcuentacontablesEliminados;
	//public List<NivelCuentaContable> nivelcuentacontablesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNivelCuentaContable=false;
	public Boolean isVisibilidadCeldaDuplicarNivelCuentaContable=true;
	public Boolean isVisibilidadCeldaCopiarNivelCuentaContable=true;
	public Boolean isVisibilidadCeldaVerFormNivelCuentaContable=true;
	public Boolean isVisibilidadCeldaOrdenNivelCuentaContable=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=false;
	public Boolean isVisibilidadCeldaModificarNivelCuentaContable=false;
	public Boolean isVisibilidadCeldaActualizarNivelCuentaContable=false;
	public Boolean isVisibilidadCeldaEliminarNivelCuentaContable=false;
	public Boolean isVisibilidadCeldaCancelarNivelCuentaContable=false;
	public Boolean isVisibilidadCeldaGuardarNivelCuentaContable=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNivelCuentaContable=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoNivelCuentaContable() {
		return this.iIdNuevoNivelCuentaContable;
	}

	public void setiIdNuevoNivelCuentaContable(Long iIdNuevoNivelCuentaContable) {
		this.iIdNuevoNivelCuentaContable = iIdNuevoNivelCuentaContable;
	}
	
	public Long getidNivelCuentaContableActual() {
		return this.idNivelCuentaContableActual;
	}

	public void setidNivelCuentaContableActual(Long idNivelCuentaContableActual) {
		this.idNivelCuentaContableActual = idNivelCuentaContableActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public NivelCuentaContable getnivelcuentacontable() {
		return this.nivelcuentacontable;
	}

	public void setnivelcuentacontable(NivelCuentaContable nivelcuentacontable) {
		this.nivelcuentacontable = nivelcuentacontable;
	}
	
	public NivelCuentaContable getnivelcuentacontableAux() {
		return this.nivelcuentacontableAux;
	}

	public void setnivelcuentacontableAux(NivelCuentaContable nivelcuentacontableAux) {
		this.nivelcuentacontableAux = nivelcuentacontableAux;
	}				
	
	public NivelCuentaContable getnivelcuentacontableAnterior() {
		return this.nivelcuentacontableAnterior;
	}

	public void setnivelcuentacontableAnterior(NivelCuentaContable nivelcuentacontableAnterior) {
		this.nivelcuentacontableAnterior = nivelcuentacontableAnterior;
	}	
	
	public NivelCuentaContable getnivelcuentacontableTotales() {
		return this.nivelcuentacontableTotales;
	}

	public void setnivelcuentacontableTotales(NivelCuentaContable nivelcuentacontableTotales) {
		this.nivelcuentacontableTotales = nivelcuentacontableTotales;
	}	
	
	public NivelCuentaContable getnivelcuentacontableBean() {
		return this.nivelcuentacontableBean;
	}

	public void setnivelcuentacontableBean(NivelCuentaContable nivelcuentacontableBean) {
		this.nivelcuentacontableBean = nivelcuentacontableBean;
	}	
	
	public NivelCuentaContableParameterReturnGeneral getnivelcuentacontableReturnGeneral() {
		return this.nivelcuentacontableReturnGeneral;
	}

	public void setnivelcuentacontableReturnGeneral(NivelCuentaContableParameterReturnGeneral nivelcuentacontableReturnGeneral) {
		this.nivelcuentacontableReturnGeneral = nivelcuentacontableReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public NivelCuentaContableLogic getNivelCuentaContableLogic()	{		
		return nivelcuentacontableLogic;
	}

	public void setNivelCuentaContableLogic(NivelCuentaContableLogic nivelcuentacontableLogic) {
		this.nivelcuentacontableLogic = nivelcuentacontableLogic;
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
	
	public Boolean getIsEsNuevoNivelCuentaContable() {
		return isEsNuevoNivelCuentaContable;
	}

	public void setIsEsNuevoNivelCuentaContable(Boolean isEsNuevoNivelCuentaContable) {
		this.isEsNuevoNivelCuentaContable = isEsNuevoNivelCuentaContable;
	}

	public Boolean getEsParaAccionDesdeFormularioNivelCuentaContable() {
		return esParaAccionDesdeFormularioNivelCuentaContable;
	}
	
	public void setEsParaAccionDesdeFormularioNivelCuentaContable(Boolean esParaAccionDesdeFormularioNivelCuentaContable) {
		this.esParaAccionDesdeFormularioNivelCuentaContable = esParaAccionDesdeFormularioNivelCuentaContable;
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

			if(this.nivelcuentacontableSessionBean==null) {
				this.nivelcuentacontableSessionBean=new NivelCuentaContableSessionBean();
			}

			if(!this.nivelcuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(nivelcuentacontableSessionBean.getlidEmpresaActual());
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

					if(this.nivelcuentacontable!=null) {
						this.nivelcuentacontable.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
						this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaNivelCuentaContable.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
						if(this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaNivelCuentaContableGenerico)throws Exception
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
				jComboBoxid_empresaNivelCuentaContableGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaNivelCuentaContableGenerico!=null && jComboBoxid_empresaNivelCuentaContableGenerico.getItemCount()>0) {
					jComboBoxid_empresaNivelCuentaContableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(NivelCuentaContable nivelcuentacontable,JComboBox jComboBoxid_empresaNivelCuentaContableGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaNivelCuentaContableGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaNivelCuentaContableGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				nivelcuentacontable.setid_empresa(empresaAux.getId());
				nivelcuentacontable.setempresa_descripcion(NivelCuentaContableConstantesFunciones.getEmpresaDescripcion(empresaAux));
				nivelcuentacontable.setEmpresa(empresaAux);			}
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

					if(!NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { 
							this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { 
					}

					if(!NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
							this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
							this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesNivelCuentaContable() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			NivelCuentaContableConstantesFunciones.refrescarForeignKeysDescripcionesNivelCuentaContable(this.nivelcuentacontableLogic.getNivelCuentaContables());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			NivelCuentaContableConstantesFunciones.refrescarForeignKeysDescripcionesNivelCuentaContable(this.nivelcuentacontables);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//nivelcuentacontableLogic.setNivelCuentaContables(this.nivelcuentacontables);
			nivelcuentacontableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public NivelCuentaContableParameterReturnGeneral getNivelCuentaContableParameterGeneral() {
		return this.nivelcuentacontableParameterGeneral;
	}
	
	public void setNivelCuentaContableParameterGeneral(NivelCuentaContableParameterReturnGeneral nivelcuentacontableParameterGeneral) {
		this.nivelcuentacontableParameterGeneral = nivelcuentacontableParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNivelCuentaContable() {
		return isPermisoTodoNivelCuentaContable;
	}

	public void setIsPermisoTodoNivelCuentaContable(Boolean isPermisoTodoNivelCuentaContable) {
		this.isPermisoTodoNivelCuentaContable = isPermisoTodoNivelCuentaContable;
	}

	public Boolean getIsPermisoNuevoNivelCuentaContable() {
		return isPermisoNuevoNivelCuentaContable;
	}

	public void setIsPermisoNuevoNivelCuentaContable(Boolean isPermisoNuevoNivelCuentaContable) {
		this.isPermisoNuevoNivelCuentaContable = isPermisoNuevoNivelCuentaContable;
	}

	public Boolean getIsPermisoActualizarNivelCuentaContable() {
		return isPermisoActualizarNivelCuentaContable;
	}

	public void setIsPermisoActualizarNivelCuentaContable(Boolean isPermisoActualizarNivelCuentaContable) {
		this.isPermisoActualizarNivelCuentaContable = isPermisoActualizarNivelCuentaContable;
	}

	public Boolean getIsPermisoEliminarNivelCuentaContable() {
		return isPermisoEliminarNivelCuentaContable;
	}

	public void setIsPermisoEliminarNivelCuentaContable(Boolean isPermisoEliminarNivelCuentaContable) {
		this.isPermisoEliminarNivelCuentaContable = isPermisoEliminarNivelCuentaContable;
	}

	public Boolean getIsPermisoGuardarCambiosNivelCuentaContable() {
		return isPermisoGuardarCambiosNivelCuentaContable;
	}

	public void setIsPermisoGuardarCambiosNivelCuentaContable(Boolean isPermisoGuardarCambiosNivelCuentaContable) {
		this.isPermisoGuardarCambiosNivelCuentaContable = isPermisoGuardarCambiosNivelCuentaContable;
	}
	
	public Boolean getIsPermisoConsultaNivelCuentaContable() {
		return isPermisoConsultaNivelCuentaContable;
	}

	public void setIsPermisoConsultaNivelCuentaContable(Boolean isPermisoConsultaNivelCuentaContable) {
		this.isPermisoConsultaNivelCuentaContable = isPermisoConsultaNivelCuentaContable;
	}

	public Boolean getIsPermisoBusquedaNivelCuentaContable() {
		return isPermisoBusquedaNivelCuentaContable;
	}

	public void setIsPermisoBusquedaNivelCuentaContable(Boolean isPermisoBusquedaNivelCuentaContable) {
		this.isPermisoBusquedaNivelCuentaContable = isPermisoBusquedaNivelCuentaContable;
	}

	public Boolean getIsPermisoReporteNivelCuentaContable() {
		return isPermisoReporteNivelCuentaContable;
	}

	public void setIsPermisoReporteNivelCuentaContable(Boolean isPermisoReporteNivelCuentaContable) {
		this.isPermisoReporteNivelCuentaContable = isPermisoReporteNivelCuentaContable;
	}
	
	public Boolean getIsPermisoPaginacionMedioNivelCuentaContable() {
		return isPermisoPaginacionMedioNivelCuentaContable;
	}

	public void setIsPermisoPaginacionMedioNivelCuentaContable(Boolean isPermisoPaginacionMedioNivelCuentaContable) {
		this.isPermisoPaginacionMedioNivelCuentaContable = isPermisoPaginacionMedioNivelCuentaContable;
	}
	
	public Boolean getIsPermisoPaginacionTodoNivelCuentaContable() {
		return isPermisoPaginacionTodoNivelCuentaContable;
	}

	public void setIsPermisoPaginacionTodoNivelCuentaContable(Boolean isPermisoPaginacionTodoNivelCuentaContable) {
		this.isPermisoPaginacionTodoNivelCuentaContable = isPermisoPaginacionTodoNivelCuentaContable;
	}
	
	public Boolean getIsPermisoPaginacionAltoNivelCuentaContable() {
		return isPermisoPaginacionAltoNivelCuentaContable;
	}

	public void setIsPermisoPaginacionAltoNivelCuentaContable(Boolean isPermisoPaginacionAltoNivelCuentaContable) {
		this.isPermisoPaginacionAltoNivelCuentaContable = isPermisoPaginacionAltoNivelCuentaContable;
	}
	
	public Boolean getIsPermisoCopiarNivelCuentaContable() {
		return isPermisoCopiarNivelCuentaContable;
	}

	public void setIsPermisoCopiarNivelCuentaContable(Boolean isPermisoCopiarNivelCuentaContable) {
		this.isPermisoCopiarNivelCuentaContable = isPermisoCopiarNivelCuentaContable;
	}
	
	public Boolean getIsPermisoVerFormNivelCuentaContable() {
		return isPermisoVerFormNivelCuentaContable;
	}

	public void setIsPermisoVerFormNivelCuentaContable(Boolean isPermisoVerFormNivelCuentaContable) {
		this.isPermisoVerFormNivelCuentaContable = isPermisoVerFormNivelCuentaContable;
	}
	
	public Boolean getIsPermisoDuplicarNivelCuentaContable() {
		return isPermisoDuplicarNivelCuentaContable;
	}

	public void setIsPermisoDuplicarNivelCuentaContable(Boolean isPermisoDuplicarNivelCuentaContable) {
		this.isPermisoDuplicarNivelCuentaContable = isPermisoDuplicarNivelCuentaContable;
	}
	
	public Boolean getIsPermisoOrdenNivelCuentaContable() {
		return isPermisoOrdenNivelCuentaContable;
	}

	public void setIsPermisoOrdenNivelCuentaContable(Boolean isPermisoOrdenNivelCuentaContable) {
		this.isPermisoOrdenNivelCuentaContable = isPermisoOrdenNivelCuentaContable;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNivelCuentaContable() {
		return isVisibilidadCeldaNuevoNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaNuevoNivelCuentaContable(Boolean isVisibilidadCeldaNuevoNivelCuentaContable) {
		this.isVisibilidadCeldaNuevoNivelCuentaContable = isVisibilidadCeldaNuevoNivelCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNivelCuentaContable() {
		return isVisibilidadCeldaDuplicarNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaDuplicarNivelCuentaContable(Boolean isVisibilidadCeldaDuplicarNivelCuentaContable) {
		this.isVisibilidadCeldaDuplicarNivelCuentaContable = isVisibilidadCeldaDuplicarNivelCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNivelCuentaContable() {
		return isVisibilidadCeldaCopiarNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaCopiarNivelCuentaContable(Boolean isVisibilidadCeldaCopiarNivelCuentaContable) {
		this.isVisibilidadCeldaCopiarNivelCuentaContable = isVisibilidadCeldaCopiarNivelCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNivelCuentaContable() {
		return isVisibilidadCeldaVerFormNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaVerFormNivelCuentaContable(Boolean isVisibilidadCeldaVerFormNivelCuentaContable) {
		this.isVisibilidadCeldaVerFormNivelCuentaContable = isVisibilidadCeldaVerFormNivelCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNivelCuentaContable() {
		return isVisibilidadCeldaOrdenNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaOrdenNivelCuentaContable(Boolean isVisibilidadCeldaOrdenNivelCuentaContable) {
		this.isVisibilidadCeldaOrdenNivelCuentaContable = isVisibilidadCeldaOrdenNivelCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNivelCuentaContable() {
		return isVisibilidadCeldaNuevoRelacionesNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNivelCuentaContable(Boolean isVisibilidadCeldaNuevoRelacionesNivelCuentaContable) {
		this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable = isVisibilidadCeldaNuevoRelacionesNivelCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNivelCuentaContable() {
		return isVisibilidadCeldaModificarNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaModificarNivelCuentaContable(Boolean isVisibilidadCeldaModificarNivelCuentaContable) {
		this.isVisibilidadCeldaModificarNivelCuentaContable = isVisibilidadCeldaModificarNivelCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNivelCuentaContable() {
		return isVisibilidadCeldaActualizarNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaActualizarNivelCuentaContable(Boolean isVisibilidadCeldaActualizarNivelCuentaContable) {
		this.isVisibilidadCeldaActualizarNivelCuentaContable = isVisibilidadCeldaActualizarNivelCuentaContable;
	}

	public Boolean getIsVisibilidadCeldaEliminarNivelCuentaContable() {
		return isVisibilidadCeldaEliminarNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaEliminarNivelCuentaContable(Boolean isVisibilidadCeldaEliminarNivelCuentaContable) {
		this.isVisibilidadCeldaEliminarNivelCuentaContable = isVisibilidadCeldaEliminarNivelCuentaContable;
	}

	public Boolean getIsVisibilidadCeldaCancelarNivelCuentaContable() {
		return isVisibilidadCeldaCancelarNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaCancelarNivelCuentaContable(Boolean isVisibilidadCeldaCancelarNivelCuentaContable) {
		this.isVisibilidadCeldaCancelarNivelCuentaContable = isVisibilidadCeldaCancelarNivelCuentaContable;
	}

	public Boolean getIsVisibilidadCeldaGuardarNivelCuentaContable() {
		return isVisibilidadCeldaGuardarNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaGuardarNivelCuentaContable(Boolean isVisibilidadCeldaGuardarNivelCuentaContable) {
		this.isVisibilidadCeldaGuardarNivelCuentaContable = isVisibilidadCeldaGuardarNivelCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNivelCuentaContable() {
		return isVisibilidadCeldaGuardarCambiosNivelCuentaContable;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNivelCuentaContable(Boolean isVisibilidadCeldaGuardarCambiosNivelCuentaContable) {
		this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable = isVisibilidadCeldaGuardarCambiosNivelCuentaContable;
	}
		
	public NivelCuentaContableSessionBean getnivelcuentacontableSessionBean() {
		return this.nivelcuentacontableSessionBean;
	}
	
	public void setnivelcuentacontableSessionBean(NivelCuentaContableSessionBean nivelcuentacontableSessionBean) {
		this.nivelcuentacontableSessionBean=nivelcuentacontableSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(NivelCuentaContable nivelcuentacontable)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(nivelcuentacontable,null);
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
	
	public void bugActualizarReferenciaActual(NivelCuentaContable nivelcuentacontable,NivelCuentaContable nivelcuentacontableAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNivelCuentaContable(nivelcuentacontable);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		nivelcuentacontableAux.setId(nivelcuentacontable.getId());
		nivelcuentacontableAux.setVersionRow(nivelcuentacontable.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessNivelCuentaContable();
		
			int intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.nivelcuentacontable,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = nivelcuentacontableValidator.getInvalidValues(this.nivelcuentacontable);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			nivelcuentacontableLogic.setDatosCliente(datosCliente);
			nivelcuentacontableLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				nivelcuentacontableAux=new  NivelCuentaContable();
				
				nivelcuentacontableAux.setIsNew(true);
				nivelcuentacontableAux.setIsChanged(true);
				
				nivelcuentacontableAux.setNivelCuentaContableOriginal(this.nivelcuentacontable);
				
				nivelcuentacontableAux.setId(this.nivelcuentacontable.getId());	
				nivelcuentacontableAux.setVersionRow(this.nivelcuentacontable.getVersionRow());	
				nivelcuentacontableAux.setid_empresa(this.nivelcuentacontable.getid_empresa());	
				nivelcuentacontableAux.setnivel(this.nivelcuentacontable.getnivel());	
				nivelcuentacontableAux.setnumero_digitos(this.nivelcuentacontable.getnumero_digitos());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.nivelcuentacontableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(nivelcuentacontableAux,nivelcuentacontableLogic.getNivelCuentaContables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcuentacontableAux,nivelcuentacontables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentacontableLogic.saveNivelCuentaContables();//WithConnection
						//nivelcuentacontableLogic.getSetVersionRowNivelCuentaContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.nivelcuentacontable,nivelcuentacontableAux);
					
					this.refrescarForeignKeysDescripcionesNivelCuentaContable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivelcuentacontableLogic.saveNivelCuentaContableRelaciones(nivelcuentacontableAux);//WithConnection
								//nivelcuentacontableLogic.getSetVersionRowNivelCuentaContables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.nivelcuentacontable,nivelcuentacontableAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.nivelcuentacontableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(nivelcuentacontableAux,nivelcuentacontableLogic.getNivelCuentaContables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(nivelcuentacontableAux,nivelcuentacontables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.nivelcuentacontable,nivelcuentacontableAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				nivelcuentacontableAux=new  NivelCuentaContable();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado() 
					|| (this.nivelcuentacontableSessionBean.getEsGuardarRelacionado() && this.nivelcuentacontable.getId()>=0)) {
						
					nivelcuentacontableAux.setIsNew(false);
				}
				
				nivelcuentacontableAux.setIsDeleted(false);
			
				nivelcuentacontableAux.setId(this.nivelcuentacontable.getId());	
				nivelcuentacontableAux.setVersionRow(this.nivelcuentacontable.getVersionRow());	
				nivelcuentacontableAux.setid_empresa(this.nivelcuentacontable.getid_empresa());	
				nivelcuentacontableAux.setnivel(this.nivelcuentacontable.getnivel());	
				nivelcuentacontableAux.setnumero_digitos(this.nivelcuentacontable.getnumero_digitos());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(nivelcuentacontableAux,nivelcuentacontableLogic.getNivelCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcuentacontableAux,nivelcuentacontables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentacontableLogic.saveNivelCuentaContables();//WithConnection
						//nivelcuentacontableLogic.getSetVersionRowNivelCuentaContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.nivelcuentacontable,nivelcuentacontableAux);
					
					this.refrescarForeignKeysDescripcionesNivelCuentaContable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivelcuentacontableLogic.saveNivelCuentaContableRelaciones(nivelcuentacontableAux);//WithConnection
								//nivelcuentacontableLogic.getSetVersionRowNivelCuentaContables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.nivelcuentacontable,nivelcuentacontableAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.nivelcuentacontableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(nivelcuentacontableAux,nivelcuentacontableLogic.getNivelCuentaContables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(nivelcuentacontableAux,nivelcuentacontables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.nivelcuentacontable,nivelcuentacontableAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				nivelcuentacontableAux=new  NivelCuentaContable();
				
				nivelcuentacontableAux.setIsNew(false);
				nivelcuentacontableAux.setIsChanged(false);
				
				nivelcuentacontableAux.setIsDeleted(true);
				
				nivelcuentacontableAux.setId(this.nivelcuentacontable.getId());	
				nivelcuentacontableAux.setVersionRow(this.nivelcuentacontable.getVersionRow());	
				nivelcuentacontableAux.setid_empresa(this.nivelcuentacontable.getid_empresa());	
				nivelcuentacontableAux.setnivel(this.nivelcuentacontable.getnivel());	
				nivelcuentacontableAux.setnumero_digitos(this.nivelcuentacontable.getnumero_digitos());	
				
				if(this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.nivelcuentacontableAux.getId()>=0) {	
						this.nivelcuentacontablesEliminados.add(nivelcuentacontableAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(nivelcuentacontableAux,nivelcuentacontableLogic.getNivelCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcuentacontableAux,nivelcuentacontables);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentacontableLogic.saveNivelCuentaContables();//WithConnection
						//nivelcuentacontableLogic.getSetVersionRowNivelCuentaContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivelcuentacontableLogic.saveNivelCuentaContableRelaciones(nivelcuentacontableAux);//WithConnection
								//nivelcuentacontableLogic.getSetVersionRowNivelCuentaContables();//WithConnection
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
							if(this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones() 
								|| this.nivelcuentacontableSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(nivelcuentacontableAux,nivelcuentacontableLogic.getNivelCuentaContables());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(nivelcuentacontableAux,nivelcuentacontables);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.getNivelCuentaContables().addAll(this.nivelcuentacontablesEliminados);
					
					nivelcuentacontableLogic.saveNivelCuentaContables();//WithConnection
					//nivelcuentacontableLogic.getSetVersionRowNivelCuentaContables();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesNivelCuentaContable();
				
				this.nivelcuentacontablesEliminados= new ArrayList<NivelCuentaContable>();		
			}
			
			if(this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Nivel Cuenta Contable GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Nivel Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.nivelcuentacontable=nivelcuentacontableAux;
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
      		//this.finishProcessNivelCuentaContable();
      	}
		
	}	
	
	public void actualizarRelaciones(NivelCuentaContable nivelcuentacontableLocal) throws Exception {
		
		if(this.nivelcuentacontableSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(NivelCuentaContable nivelcuentacontableLocal) throws Exception {	
		if(this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				nivelcuentacontableLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarNivelCuentaContableActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = nivelcuentacontableValidator.getInvalidValues(this.nivelcuentacontable);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(NivelCuentaContable nivelcuentacontable,List<NivelCuentaContable> nivelcuentacontables) throws Exception {
		try	{		
			NivelCuentaContableConstantesFunciones.actualizarLista(nivelcuentacontable,nivelcuentacontables,this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(NivelCuentaContable nivelcuentacontable,List<NivelCuentaContable> nivelcuentacontables) throws Exception {
		try	{			
			NivelCuentaContableConstantesFunciones.actualizarSelectedLista(nivelcuentacontable,nivelcuentacontables);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<NivelCuentaContable> nivelcuentacontablesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				nivelcuentacontablesLocal=this.nivelcuentacontableLogic.getNivelCuentaContables();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				nivelcuentacontablesLocal=this.nivelcuentacontables;
			}
			//ARCHITECTURE
		
			for(NivelCuentaContable nivelcuentacontableLocal:nivelcuentacontablesLocal) {
				if(this.permiteMantenimiento(nivelcuentacontableLocal) && nivelcuentacontableLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NivelCuentaContableConstantesFunciones.getNivelCuentaContableLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NivelCuentaContableConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCuentaContable.jLabelid_empresaNivelCuentaContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NivelCuentaContableConstantesFunciones.NIVEL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCuentaContable.jLabelnivelNivelCuentaContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NivelCuentaContableConstantesFunciones.NUMERODIGITOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCuentaContable.jLabelnumero_digitosNivelCuentaContable,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNivelCuentaContable.jLabelid_empresaNivelCuentaContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNivelCuentaContable.jLabelnivelNivelCuentaContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNivelCuentaContable.jLabelnumero_digitosNivelCuentaContable,"");
		
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
		this.iIdNuevoNivelCuentaContable--;	
		
		
		this.nivelcuentacontableAux=new NivelCuentaContable();
		
		this.nivelcuentacontableAux.setId(this.iIdNuevoNivelCuentaContable);
		this.nivelcuentacontableAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.nivelcuentacontableLogic.getNivelCuentaContables().add(this.nivelcuentacontableAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.nivelcuentacontables.add(this.nivelcuentacontableAux);
		}
		//ARCHITECTURE
		
		this.nivelcuentacontable=this.nivelcuentacontableAux;
		
		if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNivelCuentaContable(this.nivelcuentacontable);
			this.setVariablesObjetoActualToFormularioForeignKeyNivelCuentaContable(this.nivelcuentacontable);
		}
				
		//this.setDefaultControlesNivelCuentaContable();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNivelCuentaContable();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNivelCuentaContable();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNivelCuentaContable();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNivelCuentaContable(this.nivelcuentacontableBean,this.nivelcuentacontable,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(NivelCuentaContableConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
			classes=NivelCuentaContableConstantesFunciones.getClassesRelationshipsOfNivelCuentaContable(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.nivelcuentacontableReturnGeneral=nivelcuentacontableLogic.procesarEventosNivelCuentaContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivelcuentacontableLogic.getNivelCuentaContables(),this.nivelcuentacontable,this.nivelcuentacontableParameterGeneral,this.isEsNuevoNivelCuentaContable,classes);//this.nivelcuentacontableLogic.getNivelCuentaContable()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNivelCuentaContable(this.nivelcuentacontableReturnGeneral,this.nivelcuentacontableBean,false);
		
		if(this.nivelcuentacontableReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNivelCuentaContable(this.nivelcuentacontableReturnGeneral.getNivelCuentaContable());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNivelCuentaContable(this.nivelcuentacontableReturnGeneral.getNivelCuentaContable());
		}
		
		if(this.nivelcuentacontableReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNivelCuentaContable(this.nivelcuentacontableReturnGeneral.getNivelCuentaContable(),classes);//this.nivelcuentacontableBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.nivelcuentacontable,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNivelCuentaContable();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNivelCuentaContable();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.RecargarFormNivelCuentaContable(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNivelCuentaContable(false);
						
			if(nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelCuentaContable();
			}
			
			this.actualizarVisualTableDatosNivelCuentaContable();
			
			this.jTableDatosNivelCuentaContable.setRowSelectionInterval(this.getIndiceNuevoNivelCuentaContable(), this.getIndiceNuevoNivelCuentaContable());
			
			this.seleccionarFilaTablaNivelCuentaContableActual();
						
			this.actualizarEstadoCeldasBotonesNivelCuentaContable("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNivelCuentaContable(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnivelNivelCuentaContable.setEnabled(isHabilitar && this.nivelcuentacontableConstantesFunciones.activarnivelNivelCuentaContable);
		this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnumero_digitosNivelCuentaContable.setEnabled(isHabilitar && this.nivelcuentacontableConstantesFunciones.activarnumero_digitosNivelCuentaContable);	
		//
		this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.setEnabled(isHabilitar && this.nivelcuentacontableConstantesFunciones.activarid_empresaNivelCuentaContable);
	};
	
	public void setDefaultControlesNivelCuentaContable() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNivelCuentaContable(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.nivelcuentacontableSessionBean.setConGuardarRelaciones(true);			
			this.nivelcuentacontableSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNivelCuentaContable.jTabbedPaneRelacionesNivelCuentaContable.setVisible(true);
			
					
		} else {
			//this.nivelcuentacontableSessionBean.setConGuardarRelaciones(false);			
			this.nivelcuentacontableSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNivelCuentaContable.jTabbedPaneRelacionesNivelCuentaContable.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoNivelCuentaContable() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontableLogic.getNivelCuentaContables()) {
				if(nivelcuentacontableAux.getId().equals(this.iIdNuevoNivelCuentaContable)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontables) {
				if(nivelcuentacontableAux.getId().equals(this.iIdNuevoNivelCuentaContable)) {
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
	
	public int getIndiceActualNivelCuentaContable(NivelCuentaContable nivelcuentacontable,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontableLogic.getNivelCuentaContables()) {
				if(nivelcuentacontableAux.getId().equals(nivelcuentacontable.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontables) {
				if(nivelcuentacontableAux.getId().equals(nivelcuentacontable.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNivelCuentaContable(NivelCuentaContable nivelcuentacontableOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontableLogic.getNivelCuentaContables()) {
				if(nivelcuentacontableAux.getNivelCuentaContableOriginal().getId().equals(nivelcuentacontableOriginal.getId())) {
					existe=true;
					nivelcuentacontableOriginal.setId(nivelcuentacontableAux.getId());
					nivelcuentacontableOriginal.setVersionRow(nivelcuentacontableAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontables) {
				if(nivelcuentacontableAux.getNivelCuentaContableOriginal().getId().equals(nivelcuentacontableOriginal.getId())) {
					existe=true;
					nivelcuentacontableOriginal.setId(nivelcuentacontableAux.getId());
					nivelcuentacontableOriginal.setVersionRow(nivelcuentacontableAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNivelCuentaContable(Boolean esParaCancelar) throws Exception {
		nivelcuentacontablesAux=new ArrayList<NivelCuentaContable>();
		nivelcuentacontableAux=new NivelCuentaContable();
		
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontableLogic.getNivelCuentaContables()) {
					if(nivelcuentacontableAux.getId()<0) {
						nivelcuentacontablesAux.add(nivelcuentacontableAux);
					}		
				}
				this.iIdNuevoNivelCuentaContable=0L;
				this.nivelcuentacontableLogic.getNivelCuentaContables().removeAll(nivelcuentacontablesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontables) {
					if(nivelcuentacontableAux.getId()<0) {
						nivelcuentacontablesAux.add(nivelcuentacontableAux);
					}		
				}
				this.iIdNuevoNivelCuentaContable=0L;
				this.nivelcuentacontables.removeAll(nivelcuentacontablesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNivelCuentaContable 
					&& this.nivelcuentacontableLogic.getNivelCuentaContables().size()>0
					) {
					nivelcuentacontableAux=this.nivelcuentacontableLogic.getNivelCuentaContables().get(this.nivelcuentacontableLogic.getNivelCuentaContables().size() - 1);
				
					if(nivelcuentacontableAux.getId()<0) {
						this.nivelcuentacontableLogic.getNivelCuentaContables().remove(nivelcuentacontableAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNivelCuentaContable && this.nivelcuentacontables.size()>0) {
					nivelcuentacontableAux=this.nivelcuentacontables.get(this.nivelcuentacontables.size() - 1);
				
					if(nivelcuentacontableAux.getId()<0) {
						this.nivelcuentacontables.remove(nivelcuentacontableAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNivelCuentaContable(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(nivelcuentacontable.getId()<0) {
				this.nivelcuentacontableLogic.getNivelCuentaContables().remove(this.nivelcuentacontable);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(nivelcuentacontable.getId()<0) {
				this.nivelcuentacontables.remove(this.nivelcuentacontable);
			}
		}			
	}
	
	public void setEstadosInicialesNivelCuentaContable(List<NivelCuentaContable> nivelcuentacontablesAux) throws Exception {
		NivelCuentaContableConstantesFunciones.setEstadosInicialesNivelCuentaContable(nivelcuentacontablesAux);
	}
	
	public void setEstadosInicialesNivelCuentaContable(NivelCuentaContable nivelcuentacontableAux) throws Exception {
		NivelCuentaContableConstantesFunciones.setEstadosInicialesNivelCuentaContable(nivelcuentacontableAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNivelCuentaContableActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNivelCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNivelCuentaContableActual()) {
				if(!this.isEsNuevoNivelCuentaContable) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNivelCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNivelCuentaContable=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNivelCuentaContableActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Nivel Cuenta Contable ?", "MANTENIMIENTO DE Nivel Cuenta Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNivelCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(NivelCuentaContable nivelcuentacontable) throws Exception {
		NivelCuentaContableConstantesFunciones.seleccionarAsignar(this.nivelcuentacontable,nivelcuentacontable);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNivelCuentaContable=this.isPermisoActualizarOriginalNivelCuentaContable;
			
			
			this.seleccionarAsignar(nivelcuentacontable);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NivelCuentaContableConstantesFunciones.quitarEspaciosNivelCuentaContable(this.nivelcuentacontable,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesNivelCuentaContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.nivelcuentacontableSessionBean.setsFuncionBusquedaRapida(this.nivelcuentacontableSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoNivelCuentaContable) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNivelCuentaContable(esParaCancelar);				
				this.cancelarNuevoNivelCuentaContable(esParaCancelar);								
			}
			
			this.nivelcuentacontable=new NivelCuentaContable();
			
			this.inicializarNivelCuentaContable();
			
			this.actualizarEstadoCeldasBotonesNivelCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNivelCuentaContable() throws Exception {
		try {
			NivelCuentaContableConstantesFunciones.inicializarNivelCuentaContable(this.nivelcuentacontable);
			
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
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.nivelcuentacontableLogic.getNivelCuentaContables().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNivelCuentaContables(String sAccionBusqueda,List<NivelCuentaContable> nivelcuentacontablesParaReportes) throws Exception {
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
					sPathReporteFinal="NivelCuentaContable"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NivelCuentaContableMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NivelCuentaContableMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="NivelCuentaContable"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Nivel Cuenta Contables");		
		parameters.put("busquedapor", NivelCuentaContableConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNivelCuentaContable=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NivelCuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NivelCuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNivelCuentaContable=new JRBeanArrayDataSource(NivelCuentaContableJInternalFrame.TraerNivelCuentaContableBeans(nivelcuentacontablesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNivelCuentaContable);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NivelCuentaContableConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NivelCuentaContableConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NivelCuentaContableBean.TraerNivelCuentaContableBeans(nivelcuentacontablesParaReportes).toArray()));
							
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
				this.generarExcelReporteNivelCuentaContables(sAccionBusqueda,sTipoArchivoReporte,nivelcuentacontablesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNivelCuentaContables(sAccionBusqueda,sTipoArchivoReporte,nivelcuentacontablesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNivelCuentaContableActionPerformed(null);
					//this.generarExcelReporteNivelCuentaContables(sAccionBusqueda,sTipoArchivoReporte,nivelcuentacontablesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNivelCuentaContables(sAccionBusqueda,sTipoArchivoReporte,nivelcuentacontablesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNivelCuentaContables(sAccionBusqueda,sTipoArchivoReporte,nivelcuentacontablesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNivelCuentaContables(sAccionBusqueda,sTipoArchivoReporte,nivelcuentacontablesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNivelCuentaContables(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelCuentaContable> nivelcuentacontablesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuentacontable";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelCuentaContables");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNivelCuentaContable("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(NivelCuentaContable nivelcuentacontable : nivelcuentacontablesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NivelCuentaContableConstantesFunciones.generarExcelReporteDataNivelCuentaContable("NORMAL",row,workbook,nivelcuentacontable,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNivelCuentaContable(String sTipo,Row row,Workbook workbook) {
		
		NivelCuentaContableConstantesFunciones.generarExcelReporteHeaderNivelCuentaContable(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNivelCuentaContables(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelCuentaContable> nivelcuentacontablesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuentacontable_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelCuentaContables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(NivelCuentaContable nivelcuentacontable : nivelcuentacontablesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NivelCuentaContableConstantesFunciones.getNivelCuentaContableDescripcion(nivelcuentacontable));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(nivelcuentacontable.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NivelCuentaContableConstantesFunciones.LABEL_NIVEL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NivelCuentaContableConstantesFunciones.LABEL_NIVEL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(nivelcuentacontable.getnivel());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(nivelcuentacontable.getnumero_digitos());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNivelCuentaContables(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelCuentaContable> nivelcuentacontablesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<NivelCuentaContable> nivelcuentacontablesRespaldo=null;
		
		classes=NivelCuentaContableConstantesFunciones.getClassesRelationshipsOfNivelCuentaContable(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.nivelcuentacontableLogic.setDatosCliente(this.datosCliente);
		this.nivelcuentacontableLogic.setDatosDeep(this.datosDeep);
		this.nivelcuentacontableLogic.setIsConDeep(true);
		
		nivelcuentacontablesRespaldo=this.nivelcuentacontableLogic.getNivelCuentaContables();
		
		this.nivelcuentacontableLogic.setNivelCuentaContables(nivelcuentacontablesParaReportes);	
		this.nivelcuentacontableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		nivelcuentacontablesParaReportes=this.nivelcuentacontableLogic.getNivelCuentaContables();
		this.nivelcuentacontableLogic.setNivelCuentaContables(nivelcuentacontablesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuentacontable_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelCuentaContables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNivelCuentaContable("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(NivelCuentaContable nivelcuentacontable : nivelcuentacontablesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNivelCuentaContable("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NivelCuentaContableConstantesFunciones.generarExcelReporteDataNivelCuentaContable("NORMAL",row,workbook,nivelcuentacontable,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(NivelCuentaContableConstantesFunciones.getNivelCuentaContableDescripcion(nivelcuentacontable));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNivelCuentaContable() throws Exception {		
		this.startProcessNivelCuentaContable(true);
	}
	
	public void startProcessNivelCuentaContable(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasNivelCuentaContable ,this.jPanelParametrosReportesNivelCuentaContable, this.jScrollPanelDatosNivelCuentaContable,this.jPanelPaginacionNivelCuentaContable, this.jScrollPanelDatosEdicionNivelCuentaContable, this.jPanelAccionesNivelCuentaContable,this.jPanelAccionesFormularioNivelCuentaContable,this.jmenuBarNivelCuentaContable,this.jmenuBarDetalleNivelCuentaContable,this.jTtoolBarNivelCuentaContable,this.jTtoolBarDetalleNivelCuentaContable);		
		
		final JTabbedPane jTabbedPaneBusquedasNivelCuentaContable=this.jTabbedPaneBusquedasNivelCuentaContable; 
		
		final JPanel jPanelParametrosReportesNivelCuentaContable=this.jPanelParametrosReportesNivelCuentaContable;
		//final JScrollPane jScrollPanelDatosNivelCuentaContable=this.jScrollPanelDatosNivelCuentaContable;
		final JTable jTableDatosNivelCuentaContable=this.jTableDatosNivelCuentaContable;		
		final JPanel jPanelPaginacionNivelCuentaContable=this.jPanelPaginacionNivelCuentaContable;
		//final JScrollPane jScrollPanelDatosEdicionNivelCuentaContable=this.jScrollPanelDatosEdicionNivelCuentaContable;
		final JPanel jPanelAccionesNivelCuentaContable=this.jPanelAccionesNivelCuentaContable;
		
		JPanel jPanelCamposAuxiliarNivelCuentaContable=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNivelCuentaContable=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			jPanelCamposAuxiliarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jPanelCamposNivelCuentaContable;
			jPanelAccionesFormularioAuxiliarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jPanelAccionesFormularioNivelCuentaContable;
		}
		
		final JPanel jPanelCamposNivelCuentaContable=jPanelCamposAuxiliarNivelCuentaContable;
		final JPanel jPanelAccionesFormularioNivelCuentaContable=jPanelAccionesFormularioAuxiliarNivelCuentaContable;
		
		
		final JMenuBar jmenuBarNivelCuentaContable=this.jmenuBarNivelCuentaContable;
		final JToolBar jTtoolBarNivelCuentaContable=this.jTtoolBarNivelCuentaContable;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNivelCuentaContable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNivelCuentaContable=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			jmenuBarDetalleAuxiliarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jmenuBarDetalleNivelCuentaContable;
			jTtoolBarDetalleAuxiliarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jTtoolBarDetalleNivelCuentaContable;
		}
		
		final JMenuBar jmenuBarDetalleNivelCuentaContable=jmenuBarDetalleAuxiliarNivelCuentaContable;
		final JToolBar jTtoolBarDetalleNivelCuentaContable=jTtoolBarDetalleAuxiliarNivelCuentaContable;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNivelCuentaContable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNivelCuentaContable;
			processRunnable.jTableDatos=jTableDatosNivelCuentaContable;
			processRunnable.jPanelCampos=jPanelCamposNivelCuentaContable;
			processRunnable.jPanelPaginacion=jPanelPaginacionNivelCuentaContable;
			processRunnable.jPanelAcciones=jPanelAccionesNivelCuentaContable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNivelCuentaContable;
			
			
			processRunnable.jmenuBar=jmenuBarNivelCuentaContable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNivelCuentaContable;
			processRunnable.jTtoolBar=jTtoolBarNivelCuentaContable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNivelCuentaContable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNivelCuentaContable ,jPanelParametrosReportesNivelCuentaContable,jTableDatosNivelCuentaContable, /*jScrollPanelDatosNivelCuentaContable,*/jPanelCamposNivelCuentaContable,jPanelPaginacionNivelCuentaContable, /*jScrollPanelDatosEdicionNivelCuentaContable,*/ jPanelAccionesNivelCuentaContable,jPanelAccionesFormularioNivelCuentaContable,jmenuBarNivelCuentaContable,jmenuBarDetalleNivelCuentaContable,jTtoolBarNivelCuentaContable,jTtoolBarDetalleNivelCuentaContable);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNivelCuentaContable ,jPanelParametrosReportesNivelCuentaContable, jScrollPanelDatosNivelCuentaContable,jPanelPaginacionNivelCuentaContable, jScrollPanelDatosEdicionNivelCuentaContable, jPanelAccionesNivelCuentaContable,jPanelAccionesFormularioNivelCuentaContable,jmenuBarNivelCuentaContable,jmenuBarDetalleNivelCuentaContable,jTtoolBarNivelCuentaContable,jTtoolBarDetalleNivelCuentaContable);
						
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
	
	public void finishProcessNivelCuentaContable() {// throws Exception 
		this.finishProcessNivelCuentaContable(true);
	}
	
	public void finishProcessNivelCuentaContable(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasNivelCuentaContable ,this.jPanelParametrosReportesNivelCuentaContable, this.jScrollPanelDatosNivelCuentaContable,this.jPanelPaginacionNivelCuentaContable, this.jScrollPanelDatosEdicionNivelCuentaContable, this.jPanelAccionesNivelCuentaContable,this.jPanelAccionesFormularioNivelCuentaContable,this.jmenuBarNivelCuentaContable,this.jmenuBarDetalleNivelCuentaContable,this.jTtoolBarNivelCuentaContable,this.jTtoolBarDetalleNivelCuentaContable);		
		
		final JTabbedPane jTabbedPaneBusquedasNivelCuentaContable=this.jTabbedPaneBusquedasNivelCuentaContable; 
		
		final JPanel jPanelParametrosReportesNivelCuentaContable=this.jPanelParametrosReportesNivelCuentaContable;
		//final JScrollPane jScrollPanelDatosNivelCuentaContable=this.jScrollPanelDatosNivelCuentaContable;
		final JTable jTableDatosNivelCuentaContable=this.jTableDatosNivelCuentaContable;		
		final JPanel jPanelPaginacionNivelCuentaContable=this.jPanelPaginacionNivelCuentaContable;
		//final JScrollPane jScrollPanelDatosEdicionNivelCuentaContable=this.jScrollPanelDatosEdicionNivelCuentaContable;
		final JPanel jPanelAccionesNivelCuentaContable=this.jPanelAccionesNivelCuentaContable;
		
		JPanel jPanelCamposAuxiliarNivelCuentaContable=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNivelCuentaContable=new JPanel();
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			jPanelCamposAuxiliarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jPanelCamposNivelCuentaContable;
			jPanelAccionesFormularioAuxiliarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jPanelAccionesFormularioNivelCuentaContable;
		}
		
		final JPanel jPanelCamposNivelCuentaContable=jPanelCamposAuxiliarNivelCuentaContable;
		final JPanel jPanelAccionesFormularioNivelCuentaContable=jPanelAccionesFormularioAuxiliarNivelCuentaContable;
		
		
		final JMenuBar jmenuBarNivelCuentaContable=this.jmenuBarNivelCuentaContable;		
		final JToolBar jTtoolBarNivelCuentaContable=this.jTtoolBarNivelCuentaContable;
				
		JMenuBar jmenuBarDetalleAuxiliarNivelCuentaContable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNivelCuentaContable=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			jmenuBarDetalleAuxiliarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jmenuBarDetalleNivelCuentaContable;
			jTtoolBarDetalleAuxiliarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jTtoolBarDetalleNivelCuentaContable;		
		}
		
		final JMenuBar jmenuBarDetalleNivelCuentaContable=jmenuBarDetalleAuxiliarNivelCuentaContable;
		final JToolBar jTtoolBarDetalleNivelCuentaContable=jTtoolBarDetalleAuxiliarNivelCuentaContable;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNivelCuentaContable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNivelCuentaContable;
			processRunnable.jTableDatos=jTableDatosNivelCuentaContable;
			processRunnable.jPanelCampos=jPanelCamposNivelCuentaContable;
			processRunnable.jPanelPaginacion=jPanelPaginacionNivelCuentaContable;
			processRunnable.jPanelAcciones=jPanelAccionesNivelCuentaContable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNivelCuentaContable;
			
			
			processRunnable.jmenuBar=jmenuBarNivelCuentaContable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNivelCuentaContable;
			processRunnable.jTtoolBar=jTtoolBarNivelCuentaContable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNivelCuentaContable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNivelCuentaContable ,jPanelParametrosReportesNivelCuentaContable, jTableDatosNivelCuentaContable,/*jScrollPanelDatosNivelCuentaContable,*/jPanelCamposNivelCuentaContable,jPanelPaginacionNivelCuentaContable, /*jScrollPanelDatosEdicionNivelCuentaContable,*/ jPanelAccionesNivelCuentaContable,jPanelAccionesFormularioNivelCuentaContable,jmenuBarNivelCuentaContable,jmenuBarDetalleNivelCuentaContable,jTtoolBarNivelCuentaContable,jTtoolBarDetalleNivelCuentaContable));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNivelCuentaContable(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNivelCuentaContable(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNivelCuentaContable(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNivelCuentaContable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNivelCuentaContable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNivelCuentaContable,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNivelCuentaContable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNivelCuentaContable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNivelCuentaContable,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.nivelcuentacontableConstantesFunciones.getsFinalQueryNivelCuentaContable();
		String  finalQueryPaginacionTodos=this.nivelcuentacontableConstantesFunciones.getsFinalQueryNivelCuentaContable();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NivelCuentaContableConstantesFunciones.getArrayColumnasGlobalesNoNivelCuentaContable(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NivelCuentaContableConstantesFunciones.getArrayColumnasGlobalesNivelCuentaContable(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NivelCuentaContableConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.nivelcuentacontablesEliminados= new ArrayList<NivelCuentaContable>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNivelCuentaContable();
		
				///*NivelCuentaContableSessionBean*/this.nivelcuentacontableSessionBean=new NivelCuentaContableSessionBean();
			
			if(this.nivelcuentacontableSessionBean==null) {
				this.nivelcuentacontableSessionBean=new NivelCuentaContableSessionBean();
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
					this.iNumeroPaginacion=NivelCuentaContableConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NivelCuentaContableConstantesFunciones.getClassesForeignKeysOfNivelCuentaContable(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/nivelcuentacontable."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			nivelcuentacontablesAux= new ArrayList<NivelCuentaContable>();
			
				
			nivelcuentacontableLogic.setDatosCliente(this.datosCliente);
			nivelcuentacontableLogic.setDatosDeep(this.datosDeep);
			nivelcuentacontableLogic.setIsConDeep(true);
			
			
			nivelcuentacontableLogic.getNivelCuentaContableDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					nivelcuentacontableLogic.getTodosNivelCuentaContables(finalQueryGlobal,pagination);
					
					//nivelcuentacontableLogic.getTodosNivelCuentaContablesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(nivelcuentacontableLogic.getNivelCuentaContables()==null|| nivelcuentacontableLogic.getNivelCuentaContables().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivelcuentacontablesAux= new ArrayList<NivelCuentaContable>();
							nivelcuentacontablesAux.addAll(nivelcuentacontableLogic.getNivelCuentaContables());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcuentacontablesAux= new ArrayList<NivelCuentaContable>();
							nivelcuentacontablesAux.addAll(nivelcuentacontables);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivelcuentacontableLogic.getTodosNivelCuentaContables(finalQueryGlobal+"",this.pagination);												
							
							//nivelcuentacontableLogic.getTodosNivelCuentaContablesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteNivelCuentaContables("Todos",nivelcuentacontableLogic.getNivelCuentaContables() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivelcuentacontableLogic.setNivelCuentaContables(new ArrayList<NivelCuentaContable>());					
							nivelcuentacontableLogic.getNivelCuentaContables().addAll(nivelcuentacontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcuentacontables=new ArrayList<NivelCuentaContable>();
							nivelcuentacontables.addAll(nivelcuentacontablesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idNivelCuentaContable=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idNivelCuentaContable=this.idActual;
				
				} else if(this.idNivelCuentaContableActual!=null && this.idNivelCuentaContableActual!=0L) {
					idNivelCuentaContable=idNivelCuentaContableActual;
				}
				
					
				this.sDetalleReporte=NivelCuentaContableConstantesFunciones.getDetalleIndicePorId(idNivelCuentaContable);
				
				this.nivelcuentacontables=new ArrayList<NivelCuentaContable>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					nivelcuentacontableLogic.getEntity(idNivelCuentaContable);
					
					//nivelcuentacontableLogic.getEntityWithConnection(idNivelCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivelcuentacontableLogic.setNivelCuentaContables(new ArrayList<NivelCuentaContable>());
					nivelcuentacontableLogic.getNivelCuentaContables().add(nivelcuentacontableLogic.getNivelCuentaContable());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nivelcuentacontables=new ArrayList<NivelCuentaContable>();
					this.nivelcuentacontables.add(nivelcuentacontable);
				}
				
				if(nivelcuentacontableLogic.getNivelCuentaContable()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=NivelCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					nivelcuentacontableLogic.getNivelCuentaContablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NivelCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NivelCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=nivelcuentacontableLogic.getNivelCuentaContables()==null||nivelcuentacontableLogic.getNivelCuentaContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=nivelcuentacontables==null|| nivelcuentacontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentacontablesAux=new ArrayList<NivelCuentaContable>();
						nivelcuentacontablesAux.addAll(nivelcuentacontableLogic.getNivelCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcuentacontablesAux=new ArrayList<NivelCuentaContable>();
							nivelcuentacontablesAux.addAll(nivelcuentacontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							nivelcuentacontableLogic.getNivelCuentaContablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NivelCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NivelCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNivelCuentaContables("FK_IdEmpresa",nivelcuentacontableLogic.getNivelCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNivelCuentaContables("FK_IdEmpresa",nivelcuentacontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentacontableLogic.setNivelCuentaContables(new ArrayList<NivelCuentaContable>());
						nivelcuentacontableLogic.getNivelCuentaContables().addAll(nivelcuentacontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcuentacontables=new ArrayList<NivelCuentaContable>();
							nivelcuentacontables.addAll(nivelcuentacontablesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNivelCuentaContable();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNivelCuentaContable();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=nivelcuentacontableLogic.getNivelCuentaContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivelcuentacontables.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=nivelcuentacontableLogic.getNivelCuentaContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivelcuentacontables.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(NivelCuentaContable nivelcuentacontable) {
		Boolean permite=true;
		
		if(this.nivelcuentacontable.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NivelCuentaContableConstantesFunciones.getOrderByListaNivelCuentaContable();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NivelCuentaContableConstantesFunciones.getOrderByListaNivelCuentaContable();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCuentaContable nivelcuentacontable:nivelcuentacontableLogic.getNivelCuentaContables()) {
				if(nivelcuentacontable.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcuentacontableTotales=nivelcuentacontable;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCuentaContable nivelcuentacontable:this.nivelcuentacontables) {
				if(nivelcuentacontable.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcuentacontableTotales=nivelcuentacontable;
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
			this.nivelcuentacontableAux=new NivelCuentaContable();
			this.nivelcuentacontableAux.setsType(Constantes2.S_TOTALES);
			this.nivelcuentacontableAux.setIsNew(false);
			this.nivelcuentacontableAux.setIsChanged(false);
			this.nivelcuentacontableAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				NivelCuentaContableConstantesFunciones.TotalizarValoresFilaNivelCuentaContable(this.nivelcuentacontableLogic.getNivelCuentaContables(),this.nivelcuentacontableAux);
				
				this.nivelcuentacontableLogic.getNivelCuentaContables().add(this.nivelcuentacontableAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NivelCuentaContableConstantesFunciones.TotalizarValoresFilaNivelCuentaContable(this.nivelcuentacontables,this.nivelcuentacontableAux);
				
				this.nivelcuentacontables.add(this.nivelcuentacontableAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		nivelcuentacontableTotales=new NivelCuentaContable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nivelcuentacontableLogic.getNivelCuentaContables().remove(nivelcuentacontableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nivelcuentacontables.remove(nivelcuentacontableTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		nivelcuentacontableTotales=new NivelCuentaContable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCuentaContable nivelcuentacontable:nivelcuentacontableLogic.getNivelCuentaContables()) {
				if(nivelcuentacontable.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcuentacontableTotales=nivelcuentacontable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NivelCuentaContableConstantesFunciones.TotalizarValoresFilaNivelCuentaContable(this.nivelcuentacontableLogic.getNivelCuentaContables(),nivelcuentacontableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCuentaContable nivelcuentacontable:this.nivelcuentacontables) {
				if(nivelcuentacontable.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcuentacontableTotales=nivelcuentacontable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NivelCuentaContableConstantesFunciones.TotalizarValoresFilaNivelCuentaContable(this.nivelcuentacontables,nivelcuentacontableTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getNivelCuentaContablesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getNivelCuentaContablesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivelcuentacontableLogic.getNivelCuentaContablesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosNivelCuentaContable() {
		this.isPermisoTodoNivelCuentaContable=false;
		this.isPermisoNuevoNivelCuentaContable=false;
		this.isPermisoActualizarNivelCuentaContable=false;
		this.isPermisoActualizarOriginalNivelCuentaContable=false;
		this.isPermisoEliminarNivelCuentaContable=false;
		this.isPermisoGuardarCambiosNivelCuentaContable=false;
		this.isPermisoConsultaNivelCuentaContable=false;
		this.isPermisoBusquedaNivelCuentaContable=false;
		this.isPermisoReporteNivelCuentaContable=false;		
		this.isPermisoOrdenNivelCuentaContable=false;		
		this.isPermisoPaginacionMedioNivelCuentaContable=false;		
		this.isPermisoPaginacionAltoNivelCuentaContable=false;
		this.isPermisoPaginacionTodoNivelCuentaContable=false;
		this.isPermisoCopiarNivelCuentaContable=false;		
		this.isPermisoVerFormNivelCuentaContable=false;		
		this.isPermisoDuplicarNivelCuentaContable=false;		
		this.isPermisoOrdenNivelCuentaContable=false;		
	}
	
	public void setPermisosUsuarioNivelCuentaContable(Boolean isPermiso) {
		this.isPermisoTodoNivelCuentaContable=isPermiso;
		this.isPermisoNuevoNivelCuentaContable=isPermiso;
		this.isPermisoActualizarNivelCuentaContable=isPermiso;
		this.isPermisoActualizarOriginalNivelCuentaContable=isPermiso;
		this.isPermisoEliminarNivelCuentaContable=isPermiso;
		this.isPermisoGuardarCambiosNivelCuentaContable=isPermiso;
		this.isPermisoConsultaNivelCuentaContable=isPermiso;
		this.isPermisoBusquedaNivelCuentaContable=isPermiso;
		this.isPermisoReporteNivelCuentaContable=isPermiso;
		this.isPermisoOrdenNivelCuentaContable=isPermiso;		
		this.isPermisoPaginacionMedioNivelCuentaContable=isPermiso;		
		this.isPermisoPaginacionAltoNivelCuentaContable=isPermiso;		
		this.isPermisoPaginacionTodoNivelCuentaContable=isPermiso;		
		this.isPermisoCopiarNivelCuentaContable=isPermiso;		
		this.isPermisoVerFormNivelCuentaContable=isPermiso;		
		this.isPermisoDuplicarNivelCuentaContable=isPermiso;
		this.isPermisoOrdenNivelCuentaContable=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNivelCuentaContable(Boolean isPermiso) {
		//this.isPermisoTodoNivelCuentaContable=isPermiso;
		this.isPermisoNuevoNivelCuentaContable=isPermiso;
		this.isPermisoActualizarNivelCuentaContable=isPermiso;
		this.isPermisoActualizarOriginalNivelCuentaContable=isPermiso;
		this.isPermisoEliminarNivelCuentaContable=isPermiso;
		this.isPermisoGuardarCambiosNivelCuentaContable=isPermiso;
		//this.isPermisoConsultaNivelCuentaContable=isPermiso;
		//this.isPermisoBusquedaNivelCuentaContable=isPermiso;
		//this.isPermisoReporteNivelCuentaContable=isPermiso;
		//this.isPermisoOrdenNivelCuentaContable=isPermiso;		
		//this.isPermisoPaginacionMedioNivelCuentaContable=isPermiso;		
		//this.isPermisoPaginacionAltoNivelCuentaContable=isPermiso;		
		//this.isPermisoPaginacionTodoNivelCuentaContable=isPermiso;		
		//this.isPermisoCopiarNivelCuentaContable=isPermiso;		
		//this.isPermisoDuplicarNivelCuentaContable=isPermiso;
		//this.isPermisoOrdenNivelCuentaContable=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNivelCuentaContableClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(NivelCuentaContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebNivelCuentaContable(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNivelCuentaContableClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioNivelCuentaContableClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNivelCuentaContableClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNivelCuentaContableClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioNivelCuentaContable() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NivelCuentaContableJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NivelCuentaContableConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNivelCuentaContable=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNivelCuentaContable=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNivelCuentaContable=this.isPermisoActualizarNivelCuentaContable;
			this.isPermisoEliminarNivelCuentaContable=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNivelCuentaContable=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNivelCuentaContable=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNivelCuentaContable=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNivelCuentaContable=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNivelCuentaContable=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNivelCuentaContable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNivelCuentaContable=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNivelCuentaContable=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNivelCuentaContable=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNivelCuentaContable=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNivelCuentaContable=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNivelCuentaContable=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNivelCuentaContable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNivelCuentaContable.setToolTipText(this.jTableDatosNivelCuentaContable.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNivelCuentaContable(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNivelCuentaContable(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NivelCuentaContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NivelCuentaContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNivelCuentaContable() throws Exception {
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
	public void inicializarCombosForeignKeyNivelCuentaContableListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNivelCuentaContableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NivelCuentaContableJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyNivelCuentaContableListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyNivelCuentaContableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			NivelCuentaContableParameterReturnGeneral nivelcuentacontableReturnGeneral=new NivelCuentaContableParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.nivelcuentacontableConstantesFunciones.cargarid_empresaNivelCuentaContable)
					 || (this.esRecargarFks && this.nivelcuentacontableConstantesFunciones.cargarid_empresaNivelCuentaContable)) {

					if(!this.nivelcuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+nivelcuentacontableSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				nivelcuentacontableReturnGeneral=nivelcuentacontableLogic.cargarCombosLoteForeignKeyNivelCuentaContable(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=nivelcuentacontableReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyNivelCuentaContable()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.nivelcuentacontableSessionBean==null) {
				this.nivelcuentacontableSessionBean=new NivelCuentaContableSessionBean();
			}

			if(!this.nivelcuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyNivelCuentaContable()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNivelCuentaContable(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNivelCuentaContable()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNivelCuentaContable();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNivelCuentaContable(NivelCuentaContable nivelcuentacontable)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNivelCuentaContable(NivelCuentaContable nivelcuentacontable,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNivelCuentaContable()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNivelCuentaContable()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNivelCuentaContable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNivelCuentaContable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNivelCuentaContable()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNivelCuentaContable()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNivelCuentaContable(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNivelCuentaContable()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable!=null && this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public NivelCuentaContableBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NivelCuentaContableBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NivelCuentaContableBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.nivelcuentacontableSessionBean=new NivelCuentaContableSessionBean(); 
		this.nivelcuentacontableConstantesFunciones=new NivelCuentaContableConstantesFunciones(); 
		this.nivelcuentacontableBean=new NivelCuentaContable();//(this.nivelcuentacontableConstantesFunciones); 		
		this.nivelcuentacontableReturnGeneral=new NivelCuentaContableParameterReturnGeneral(); 
		
		this.nivelcuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivelcuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NivelCuentaContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NivelCuentaContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NivelCuentaContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNivelCuentaContable(true);
			
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
			
			this.nivelcuentacontableConstantesFunciones=new NivelCuentaContableConstantesFunciones(); 
			this.nivelcuentacontableBean=new NivelCuentaContable();//this.nivelcuentacontableConstantesFunciones); 			
			this.nivelcuentacontableReturnGeneral=new NivelCuentaContableParameterReturnGeneral(); 
		
			NivelCuentaContableBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nivel Cuenta Contable Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.nivelcuentacontable=new NivelCuentaContable();
			this.nivelcuentacontables = new ArrayList<NivelCuentaContable>();
			this.nivelcuentacontablesAux = new ArrayList<NivelCuentaContable>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic=new NivelCuentaContableLogic();
				this.nivelcuentacontableLogic.getNewConnexionToDeep("");
			}
			
			//this.nivelcuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.nivelcuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNivelCuentaContable);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNivelCuentaContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNivelCuentaContable);	
					}
					
					if(this.jInternalFrameImportacionNivelCuentaContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNivelCuentaContable);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNivelCuentaContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNivelCuentaContable);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNivelCuentaContable);
				this.jInternalFrameDetalleFormNivelCuentaContable.setVisible(false);
				this.jInternalFrameDetalleFormNivelCuentaContable.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNivelCuentaContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNivelCuentaContable);
					this.jInternalFrameReporteDinamicoNivelCuentaContable.setVisible(false);
					this.jInternalFrameReporteDinamicoNivelCuentaContable.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNivelCuentaContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNivelCuentaContable);
					this.jInternalFrameImportacionNivelCuentaContable.setVisible(false);
					this.jInternalFrameImportacionNivelCuentaContable.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNivelCuentaContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNivelCuentaContable);
					this.jInternalFrameOrderByNivelCuentaContable.setVisible(false);
					this.jInternalFrameOrderByNivelCuentaContable.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNivelCuentaContableActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NivelCuentaContableConstantesFunciones.INUMEROPAGINACION;
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
			
			this.nivelcuentacontableReturnGeneral=new NivelCuentaContableParameterReturnGeneral();
			
			this.nivelcuentacontableParameterGeneral=new NivelCuentaContableParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.nivelcuentacontableLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NivelCuentaContableJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NivelCuentaContableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.nivelcuentacontableSessionBean.getEsGuardarRelacionado(),this.nivelcuentacontableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NivelCuentaContableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.nivelcuentacontableSessionBean.getEsGuardarRelacionado(),this.nivelcuentacontableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNivelCuentaContable=false;
			this.isVisibilidadCeldaDuplicarNivelCuentaContable=true;
			this.isVisibilidadCeldaCopiarNivelCuentaContable=true;
			this.isVisibilidadCeldaVerFormNivelCuentaContable=true;
			this.isVisibilidadCeldaOrdenNivelCuentaContable=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=false;
			this.isVisibilidadCeldaModificarNivelCuentaContable=false;
			this.isVisibilidadCeldaActualizarNivelCuentaContable=false;
			this.isVisibilidadCeldaEliminarNivelCuentaContable=false;
			this.isVisibilidadCeldaCancelarNivelCuentaContable=false;
			this.isVisibilidadCeldaGuardarNivelCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNivelCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNivelCuentaContable();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNivelCuentaContable(false);
			
			this.setPermisosUsuarioNivelCuentaContable();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado() 
				|| (this.nivelcuentacontableSessionBean.getEsGuardarRelacionado() && this.nivelcuentacontableSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNivelCuentaContableClasesRelacionadas();
			}
			
			if(this.nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNivelCuentaContableClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNivelCuentaContable();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNivelCuentaContable();
			}
			
			if(!this.isPermisoBusquedaNivelCuentaContable) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasNivelCuentaContable.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioNivelCuentaContable,this.isPermisoPaginacionMedioNivelCuentaContable,this.isPermisoPaginacionTodoNivelCuentaContable);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NivelCuentaContableConstantesFunciones.getTiposSeleccionarNivelCuentaContable());
				
				this.tiposColumnasSelect=NivelCuentaContableConstantesFunciones.getTiposSeleccionarNivelCuentaContable(true);
				
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
			//if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNivelCuentaContable();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioNivelCuentaContable(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioNivelCuentaContable(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelCuentaContable() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				nivelcuentacontableImplementable= (NivelCuentaContableImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NivelCuentaContableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				nivelcuentacontableImplementableHome= (NivelCuentaContableImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NivelCuentaContableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.nivelcuentacontables= new ArrayList<NivelCuentaContable>();
			this.nivelcuentacontablesEliminados= new ArrayList<NivelCuentaContable>();
						
			this.isEsNuevoNivelCuentaContable=false;
			this.esParaAccionDesdeFormularioNivelCuentaContable=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNivelCuentaContable(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNivelCuentaContable();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NivelCuentaContableBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NivelCuentaContableConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNivelCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNivelCuentaContable(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNivelCuentaContable();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNivelCuentaContable();
			}
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasNivelCuentaContable.getTabCount(); i++) {
					this.jTabbedPaneBusquedasNivelCuentaContable.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasNivelCuentaContable.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNivelCuentaContable(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga NivelCuentaContable: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNivelCuentaContable() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesNivelCuentaContable")) {
				iIndex=this.jInternalFrameDetalleFormNivelCuentaContable.jTabbedPaneRelacionesNivelCuentaContable.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNivelCuentaContable.jTabbedPaneRelacionesNivelCuentaContable.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNivelCuentaContable();	
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
	
	public void cargarCombosForeignKeyNivelCuentaContable(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNivelCuentaContable(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNivelCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNivelCuentaContableListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNivelCuentaContable();
		
		this.cargarCombosFrameForeignKeyNivelCuentaContable();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNivelCuentaContable();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNivelCuentaContable();
		}
	}
	
	
	
	public void jButtonNuevoNivelCuentaContableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
			
			if(jTableDatosNivelCuentaContable.getRowCount()>=1) {
				jTableDatosNivelCuentaContable.removeRowSelectionInterval(0, jTableDatosNivelCuentaContable.getRowCount()-1);						
			}
			
			this.isEsNuevoNivelCuentaContable=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNivelCuentaContable(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNivelCuentaContable(true);			
			//this.nivelcuentacontable=new NivelCuentaContable();
			//this.nivelcuentacontable.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelCuentaContable(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCuentaContable() ;
			
			if(NivelCuentaContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelCuentaContable(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.nivelcuentacontable);	
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);				
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
			if(this.nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar NivelCuentaContable: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNivelCuentaContableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNivelCuentaContable.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNivelCuentaContable.getSelectedRows().length;			
			}
			
			nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNivelCuentaContable--;			
				//NivelCuentaContable nivelcuentacontableAux= new NivelCuentaContable();			
				//nivelcuentacontableAux.setId(this.iIdNuevoNivelCuentaContable);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//NivelCuentaContable nivelcuentacontableOrigen=new NivelCuentaContable();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(NivelCuentaContable nivelcuentacontableOrigen : nivelcuentacontablesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							nivelcuentacontableOrigen =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcuentacontableOrigen =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNivelCuentaContable();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.nivelcuentacontable.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNivelCuentaContable(nivelcuentacontableOrigen,this.nivelcuentacontable,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.nivelcuentacontableLogic.getNivelCuentaContables().add(this.nivelcuentacontableAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.nivelcuentacontables.add(this.nivelcuentacontableAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNivelCuentaContable(false);
				
				this.jTableDatosNivelCuentaContable.setRowSelectionInterval(this.getIndiceNuevoNivelCuentaContable(), this.getIndiceNuevoNivelCuentaContable());
				
				int iLastRow =  this.jTableDatosNivelCuentaContable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNivelCuentaContable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNivelCuentaContable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelCuentaContable(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();									
		
			NivelCuentaContable nivelcuentacontableOrigen=new NivelCuentaContable();
			NivelCuentaContable nivelcuentacontableDestino=new NivelCuentaContable();
				
			nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNivelCuentaContable.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || nivelcuentacontablesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNivelCuentaContable.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentacontableOrigen =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						nivelcuentacontableOrigen =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentacontableDestino =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						nivelcuentacontableDestino =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				nivelcuentacontableOrigen =nivelcuentacontablesSeleccionados.get(0);
				nivelcuentacontableDestino =nivelcuentacontablesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNivelCuentaContable(nivelcuentacontableOrigen,nivelcuentacontableDestino,true,false);
				
				nivelcuentacontableDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(nivelcuentacontableDestino,nivelcuentacontableLogic.getNivelCuentaContables());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcuentacontableDestino,nivelcuentacontables);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNivelCuentaContable(false);
				
				//this.jTableDatosNivelCuentaContable.setRowSelectionInterval(this.getIndiceNuevoNivelCuentaContable(), this.getIndiceNuevoNivelCuentaContable());
				
				int iLastRow =  this.jTableDatosNivelCuentaContable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNivelCuentaContable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNivelCuentaContable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelCuentaContable(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNivelCuentaContable.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNivelCuentaContable.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasNivelCuentaContable.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesNivelCuentaContable.setVisible(!isVisible);
			this.jPanelPaginacionNivelCuentaContable.setVisible(!isVisible);
			this.jPanelAccionesNivelCuentaContable.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNivelCuentaContable();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNivelCuentaContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNivelCuentaContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNivelCuentaContable();
			
			this.abrirFrameOrderByNivelCuentaContable();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNivelCuentaContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNivelCuentaContable(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNivelCuentaContable);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNivelCuentaContable.isMaximum()) {
					this.jInternalFrameDetalleFormNivelCuentaContable.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNivelCuentaContable.setSize(this.jInternalFrameDetalleFormNivelCuentaContable.iWidthFormulario,this.jInternalFrameDetalleFormNivelCuentaContable.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNivelCuentaContable.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNivelCuentaContable.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNivelCuentaContable.isMaximum()) {
						this.jInternalFrameDetalleFormNivelCuentaContable.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNivelCuentaContable.jContentPaneDetalleNivelCuentaContable.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNivelCuentaContable.jTabbedPaneRelacionesNivelCuentaContable.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNivelCuentaContable.jContentPaneDetalleNivelCuentaContable.getWidth(),NivelCuentaContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNivelCuentaContable.jTabbedPaneRelacionesNivelCuentaContable.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNivelCuentaContable.jContentPaneDetalleNivelCuentaContable.getWidth(),NivelCuentaContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNivelCuentaContable.jTabbedPaneRelacionesNivelCuentaContable.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNivelCuentaContable.jContentPaneDetalleNivelCuentaContable.getWidth(),NivelCuentaContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNivelCuentaContable.setVisible(true);
	        this.jInternalFrameDetalleFormNivelCuentaContable.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNivelCuentaContable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNivelCuentaContable==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNivelCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCuentaContable,false,this);
				} else {
					this.jInternalFrameOrderByNivelCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCuentaContable,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNivelCuentaContable);
				this.jInternalFrameOrderByNivelCuentaContable.setVisible(false);
				this.jInternalFrameOrderByNivelCuentaContable.setSelected(false);
				
				this.jInternalFrameOrderByNivelCuentaContable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNivelCuentaContable"));
				
				this.inicializarActualizarBindingTablaOrderByNivelCuentaContable();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNivelCuentaContable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNivelCuentaContable==null) {
				
				this.jInternalFrameImportacionNivelCuentaContable=new ImportacionJInternalFrame(NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNivelCuentaContable);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNivelCuentaContable);
				this.jInternalFrameImportacionNivelCuentaContable.setVisible(false);
				this.jInternalFrameImportacionNivelCuentaContable.setSelected(false);


				this.jInternalFrameImportacionNivelCuentaContable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNivelCuentaContable"));
				this.jInternalFrameImportacionNivelCuentaContable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNivelCuentaContable"));
				this.jInternalFrameImportacionNivelCuentaContable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNivelCuentaContable"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNivelCuentaContable() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNivelCuentaContable==null) {
				this.jInternalFrameReporteDinamicoNivelCuentaContable=new ReporteDinamicoJInternalFrame(NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNivelCuentaContable);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNivelCuentaContable);
				this.jInternalFrameReporteDinamicoNivelCuentaContable.setVisible(false);
				this.jInternalFrameReporteDinamicoNivelCuentaContable.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNivelCuentaContable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelCuentaContable"));
				this.jInternalFrameReporteDinamicoNivelCuentaContable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelCuentaContable"));
				this.jInternalFrameReporteDinamicoNivelCuentaContable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelCuentaContable"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelCuentaContable();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleNivelCuentaContable() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNivelCuentaContable);
			
	       	this.jInternalFrameDetalleFormNivelCuentaContable.setVisible(false);
	        this.jInternalFrameDetalleFormNivelCuentaContable.setSelected(false);
			
			//this.jInternalFrameDetalleFormNivelCuentaContable.dispose();
			//this.jInternalFrameDetalleFormNivelCuentaContable=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNivelCuentaContable() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNivelCuentaContable.setVisible(true);
	        this.jInternalFrameReporteDinamicoNivelCuentaContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNivelCuentaContable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNivelCuentaContable.setVisible(true);
	        this.jInternalFrameImportacionNivelCuentaContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNivelCuentaContable() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNivelCuentaContable.setVisible(true);
	        this.jInternalFrameOrderByNivelCuentaContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNivelCuentaContable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNivelCuentaContable.setVisible(false);
	        this.jInternalFrameOrderByNivelCuentaContable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNivelCuentaContable() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNivelCuentaContable.setVisible(false);
	        this.jInternalFrameReporteDinamicoNivelCuentaContable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNivelCuentaContable() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNivelCuentaContable.setVisible(false);
	        this.jInternalFrameImportacionNivelCuentaContable.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNivelCuentaContable(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNivelCuentaContable(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNivelCuentaContable(true);
			//this.isEsNuevoNivelCuentaContable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNivelCuentaContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelCuentaContable(false) ;
			
			if(nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(NivelCuentaContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelCuentaContable(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCuentaContable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNivelCuentaContableActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNivelCuentaContable(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNivelCuentaContable(true);
			//this.isEsNuevoNivelCuentaContable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.nivelcuentacontable.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNivelCuentaContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNivelCuentaContable(false) ;
			
			if(NivelCuentaContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelCuentaContable(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCuentaContable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNivelCuentaContable(false);
			
			//if(!this.isEsNuevoNivelCuentaContable) {								
				int intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.nivelcuentacontable,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
				
			}
			
			if(this.permiteMantenimiento(this.nivelcuentacontable)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNivelCuentaContable=true;
					this.inicializarActualizarBindingTablaNivelCuentaContable(false);
					this.isEsNuevoNivelCuentaContable=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNivelCuentaContable=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNivelCuentaContable=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNivelCuentaContable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelCuentaContable(false);
				
				this.habilitarDeshabilitarControlesNivelCuentaContable(false);
			
												
				
				if(NivelCuentaContableJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNivelCuentaContable();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNivelCuentaContableActionPerformed(evt,nivelcuentacontableSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNivelCuentaContable(this.nivelcuentacontable,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNivelCuentaContable.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,nivelcuentacontableSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.nivelcuentacontable.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(NivelCuentaContable.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuentaContable.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				this.nivelcuentacontable.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				this.nivelcuentacontable.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.nivelcuentacontable)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NivelCuentaContableModel) this.jTableDatosNivelCuentaContable.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNivelCuentaContable=true;
				this.inicializarActualizarBindingTablaNivelCuentaContable(false);
				this.isEsNuevoNivelCuentaContable=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNivelCuentaContable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelCuentaContable(false);
				
				this.habilitarDeshabilitarControlesNivelCuentaContable(false);
				
				
				
				if(NivelCuentaContableJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNivelCuentaContable();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNivelCuentaContable.getRowCount()>=1) {
				jTableDatosNivelCuentaContable.removeRowSelectionInterval(0, jTableDatosNivelCuentaContable.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNivelCuentaContable(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNivelCuentaContable(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelCuentaContable(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCuentaContable(false) ;
			
			this.isEsNuevoNivelCuentaContable=false;
			
			if(NivelCuentaContableJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNivelCuentaContable();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNivelCuentaContable(false);
				
				//SI ES MANUAL
				if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNivelCuentaContable();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNivelCuentaContable--;			
			//NivelCuentaContable nivelcuentacontableAux= new NivelCuentaContable();			
			//nivelcuentacontableAux.setId(this.iIdNuevoNivelCuentaContable);
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNivelCuentaContable();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
			
			this.nivelcuentacontable.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.nivelcuentacontableLogic.getNivelCuentaContables().add(this.nivelcuentacontableAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.nivelcuentacontables.add(this.nivelcuentacontableAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNivelCuentaContable(false);
			
			this.jTableDatosNivelCuentaContable.setRowSelectionInterval(this.getIndiceNuevoNivelCuentaContable(), this.getIndiceNuevoNivelCuentaContable());
			
			int iLastRow =  this.jTableDatosNivelCuentaContable.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNivelCuentaContable.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNivelCuentaContable.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNivelCuentaContable(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNivelCuentaContable(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCuentaContable(false);
			
			//SI ES MANUAL
			if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelCuentaContable();
			}
			
			//this.abrirFrameTreeNivelCuentaContable();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Nivel Cuenta ContableS ?", "MANTENIMIENTO DE Nivel Cuenta Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionNivelCuentaContable.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralNivelCuentaContable();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.nivelcuentacontableReturnGeneral=nivelcuentacontableLogic.procesarImportacionNivelCuentaContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.nivelcuentacontableParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarNivelCuentaContableReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNivelCuentaContable.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNivelCuentaContable.setFileImportacion(this.jInternalFrameImportacionNivelCuentaContable.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNivelCuentaContable.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNivelCuentaContable.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNivelCuentaContable.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNivelCuentaContable.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();		

		nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NivelCuentaContableBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NivelCuentaContableBaseDesign.jrxml";
			
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
			
			this.generarReporteNivelCuentaContables("Todos",nivelcuentacontablesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NivelCuentaContableConstantesFunciones.LABEL_NIVEL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_vel_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_vel_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_vel_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_vel_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDigitos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDigitos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDigitos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDigitos_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoNivelCuentaContable.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case NivelCuentaContableConstantesFunciones.LABEL_NIVEL:
					sNombreCampoCategoria="nivel";
					break;

				case NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS:
					sNombreCampoCategoria="numero_digitos";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case NivelCuentaContableConstantesFunciones.LABEL_NIVEL:
					sNombreCampoCategoriaValor="nivel";
					break;

				case NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS:
					sNombreCampoCategoriaValor="numero_digitos";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case NivelCuentaContableConstantesFunciones.LABEL_NIVEL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nivel",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nivel");
					break;

				case NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Digitos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_digitos");
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
	
	public void jButtonGenerarExcelReporteDinamicoNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();		
		
		nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuentacontable";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("NivelCuentaContables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(NivelCuentaContable nivelcuentacontable:nivelcuentacontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(nivelcuentacontable.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NivelCuentaContableConstantesFunciones.LABEL_NIVEL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NivelCuentaContableConstantesFunciones.LABEL_NIVEL);
					iRow++;

					for(NivelCuentaContable nivelcuentacontable:nivelcuentacontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(nivelcuentacontable.getnivel());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS);
					iRow++;

					for(NivelCuentaContable nivelcuentacontable:nivelcuentacontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(nivelcuentacontable.getnumero_digitos());
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
			//	this.getFilaCabeceraExportarExcelNivelCuentaContable(row);				
			//	iRow++;
			//}				
			
			//for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontablesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNivelCuentaContable(nivelcuentacontableAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
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
				this.nivelcuentacontableLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCuentaContable(false);
			
			//SI ES MANUAL
			if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelCuentaContable();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCuentaContable(false);
			
			//SI ES MANUAL
			if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNivelCuentaContable();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCuentaContable(false);
			
			//SI ES MANUAL
			if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNivelCuentaContable();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNivelCuentaContable() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNivelCuentaContable.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNivelCuentaContable.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNivelCuentaContable.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNivelCuentaContable.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNivelCuentaContable.setMinimumSize(dimensionMinimum);
		this.jTableDatosNivelCuentaContable.setMaximumSize(dimensionMaximum);
		this.jTableDatosNivelCuentaContable.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNivelCuentaContable(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNivelCuentaContable(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNivelCuentaContable(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNivelCuentaContable(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNivelCuentaContable(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNivelCuentaContable(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelCuentaContable(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNivelCuentaContable(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NivelCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNivelCuentaContable() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNivelCuentaContable();
		
		this.inicializarActualizarBindingBotonesManualNivelCuentaContable(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNivelCuentaContable();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelCuentaContable() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNivelCuentaContable(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNivelCuentaContable(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNivelCuentaContable.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNivelCuentaContable.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNivelCuentaContable.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNivelCuentaContable.jCheckBoxPostAccionNuevoNivelCuentaContable.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNivelCuentaContable.jCheckBoxPostAccionSinCerrarNivelCuentaContable.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNivelCuentaContable.jCheckBoxPostAccionSinMensajeNivelCuentaContable.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNivelCuentaContable.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNivelCuentaContable.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNivelCuentaContable.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
				this.jInternalFrameDetalleFormNivelCuentaContable.jCheckBoxPostAccionNuevoNivelCuentaContable.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNivelCuentaContable.jCheckBoxPostAccionSinCerrarNivelCuentaContable.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNivelCuentaContable.jCheckBoxPostAccionSinMensajeNivelCuentaContable.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNivelCuentaContable.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNivelCuentaContable.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNivelCuentaContable.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNivelCuentaContable!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNivelCuentaContable.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNivelCuentaContable.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNivelCuentaContable.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNivelCuentaContable.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNivelCuentaContable!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCuentaContable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNivelCuentaContable.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNivelCuentaContable.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNivelCuentaContable(Boolean esInicializar) throws Exception {
		try	{	
			if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNivelCuentaContable(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNivelCuentaContable() throws Exception {
		try	{
			if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNivelCuentaContable();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNivelCuentaContable() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNivelCuentaContable() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNivelCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNivelCuentaContable.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNivelCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNivelCuentaContable.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNivelCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNivelCuentaContable.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNivelCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNivelCuentaContable.addItem(reporte);
			}
			
			
			if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNivelCuentaContable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNivelCuentaContable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNivelCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNivelCuentaContable.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNivelCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNivelCuentaContable.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNivelCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNivelCuentaContable.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNivelCuentaContable.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelCuentaContable();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelCuentaContable() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNivelCuentaContable!=null) {
				this.jInternalFrameReporteDinamicoNivelCuentaContable.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNivelCuentaContable.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNivelCuentaContable!=null) {
				this.jInternalFrameReporteDinamicoNivelCuentaContable.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNivelCuentaContable.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNivelCuentaContable!=null) {
				
				if(this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNivelCuentaContable.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNivelCuentaContable()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNivelCuentaContable(Boolean esInicializar) throws Exception {				
		if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNivelCuentaContable();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNivelCuentaContable() throws Exception {
		this.inicializarActualizarBindingTablaNivelCuentaContable(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNivelCuentaContable() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NivelCuentaContablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NivelCuentaContablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNivelCuentaContableOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCuentaContableOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NivelCuentaContablePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NivelCuentaContablePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNivelCuentaContable(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=nivelcuentacontableLogic.getNivelCuentaContables().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=nivelcuentacontables.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNivelCuentaContable.setModel(new NivelCuentaContableModel(this.nivelcuentacontableLogic.getNivelCuentaContables(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNivelCuentaContable.setModel(new NivelCuentaContableModel(this.nivelcuentacontables,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNivelCuentaContable!=null && this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNivelCuentaContable();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNivelCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCuentaContable,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NivelCuentaContablePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO,nivelcuentacontableConstantesFunciones.resaltarSeleccionarNivelCuentaContable,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO,nivelcuentacontableConstantesFunciones.resaltarSeleccionarNivelCuentaContable,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNivelCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCuentaContable,NivelCuentaContableConstantesFunciones.LABEL_ID));

		if(this.nivelcuentacontableConstantesFunciones.mostraridNivelCuentaContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelCuentaContableConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.nivelcuentacontableConstantesFunciones.resaltaridNivelCuentaContable,this.nivelcuentacontableConstantesFunciones.activaridNivelCuentaContable,this,true,"idNivelCuentaContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nivelcuentacontableConstantesFunciones.resaltaridNivelCuentaContable,this.nivelcuentacontableConstantesFunciones.activaridNivelCuentaContable,this,true,"idNivelCuentaContable","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNivelCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCuentaContable,NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA));

		if(this.nivelcuentacontableConstantesFunciones.mostrarid_empresaNivelCuentaContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.nivelcuentacontableConstantesFunciones.resaltarid_empresaNivelCuentaContable,this,this.nivelcuentacontableConstantesFunciones.activarid_empresaNivelCuentaContable));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.nivelcuentacontableConstantesFunciones.resaltarid_empresaNivelCuentaContable,this,this.nivelcuentacontableConstantesFunciones.activarid_empresaNivelCuentaContable,false,"id_empresaNivelCuentaContable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NivelCuentaContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNivelCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCuentaContable,NivelCuentaContableConstantesFunciones.LABEL_NIVEL));

		if(this.nivelcuentacontableConstantesFunciones.mostrarnivelNivelCuentaContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelCuentaContableConstantesFunciones.LABEL_NIVEL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.nivelcuentacontableConstantesFunciones.resaltarnivelNivelCuentaContable,this.nivelcuentacontableConstantesFunciones.activarnivelNivelCuentaContable,this,true,"nivelNivelCuentaContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nivelcuentacontableConstantesFunciones.resaltarnivelNivelCuentaContable,this.nivelcuentacontableConstantesFunciones.activarnivelNivelCuentaContable,this,true,"nivelNivelCuentaContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NivelCuentaContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNivelCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCuentaContable,NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS));

		if(this.nivelcuentacontableConstantesFunciones.mostrarnumero_digitosNivelCuentaContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.nivelcuentacontableConstantesFunciones.resaltarnumero_digitosNivelCuentaContable,this.nivelcuentacontableConstantesFunciones.activarnumero_digitosNivelCuentaContable,this,true,"numero_digitosNivelCuentaContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nivelcuentacontableConstantesFunciones.resaltarnumero_digitosNivelCuentaContable,this.nivelcuentacontableConstantesFunciones.activarnumero_digitosNivelCuentaContable,this,true,"numero_digitosNivelCuentaContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NivelCuentaContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNivelCuentaContable.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNivelCuentaContable.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNivelCuentaContable.addColumn(tableColumn);
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
			
			this.jTableDatosNivelCuentaContable.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNivelCuentaContable.moveColumn(this.jTableDatosNivelCuentaContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNivelCuentaContable.moveColumn(this.jTableDatosNivelCuentaContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNivelCuentaContable.moveColumn(this.jTableDatosNivelCuentaContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNivelCuentaContable.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNivelCuentaContable.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNivelCuentaContable,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NivelCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNivelCuentaContable.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNivelCuentaContable.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NivelCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NivelCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNivelCuentaContable.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNivelCuentaContable.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNivelCuentaContable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=nivelcuentacontableLogic.getNivelCuentaContables().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=nivelcuentacontables.size()-1;
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
		//this.jTableDatosNivelCuentaContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNivelCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNivelCuentaContable();
			
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
				
				//this.isEsNuevoNivelCuentaContable=false;
					
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
				if(this.nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNivelCuentaContable==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNivelCuentaContable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNivelCuentaContable.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.nivelcuentacontable.getsType().equals("DUPLICADO")
				   || this.nivelcuentacontable.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNivelCuentaContable=true;
				
				} else {
					this.isEsNuevoNivelCuentaContable=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
					if(this.nivelcuentacontable.getId()>=0 && !this.nivelcuentacontable.getIsNew()) {						
						this.isEsNuevoNivelCuentaContable=false;
						
					} else {
						this.isEsNuevoNivelCuentaContable=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNivelCuentaContable(esRelaciones);						
				
				this.seleccionarNivelCuentaContable(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.nivelcuentacontable.getId()<0) {
					this.isEsNuevoNivelCuentaContable=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNivelCuentaContable(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNivelCuentaContable(evt,rowIndex);
				}	
				
				if(this.nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion NivelCuentaContable: " + this.dDif); 
					}
				}								
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNivelCuentaContable(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.nivelcuentacontable)) {
					if(this.nivelcuentacontable.getId()>0) {
						this.nivelcuentacontable.setIsDeleted(true);
						
						this.nivelcuentacontablesEliminados.add(this.nivelcuentacontable);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.nivelcuentacontableLogic.getNivelCuentaContables().remove(this.nivelcuentacontable);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.nivelcuentacontables.remove(this.nivelcuentacontable);				
					}
					
					
					((NivelCuentaContableModel) this.jTableDatosNivelCuentaContable.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelCuentaContable(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNivelCuentaContable(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNivelCuentaContable) {
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNivelCuentaContable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNivelCuentaContable.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNivelCuentaContable(this.nivelcuentacontable);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.nivelcuentacontableConstantesFunciones.cargarid_empresaNivelCuentaContable || this.nivelcuentacontableConstantesFunciones.event_dependid_empresaNivelCuentaContable) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.nivelcuentacontable.getid_empresa());
									//this.inicializarActualizarBindingNivelCuentaContable(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(nivelcuentacontable.getEmpresa()!=null) {
							this.empresasForeignKey.add(nivelcuentacontable.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.nivelcuentacontable.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNivelCuentaContable("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNivelCuentaContable(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelCuentaContable() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNivelCuentaContable(NivelCuentaContable nivelcuentacontable) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNivelCuentaContable(nivelcuentacontable,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNivelCuentaContable(NivelCuentaContable nivelcuentacontable,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNivelCuentaContable(nivelcuentacontable);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNivelCuentaContable(nivelcuentacontable,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNivelCuentaContable(nivelcuentacontable);
	}
	
	public void setVariablesObjetoActualToFormularioNivelCuentaContable(NivelCuentaContable nivelcuentacontable) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNivelCuentaContable.jLabelidNivelCuentaContable.setText(nivelcuentacontable.getId().toString());
			this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnivelNivelCuentaContable.setText(nivelcuentacontable.getnivel().toString());
			this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnumero_digitosNivelCuentaContable.setText(nivelcuentacontable.getnumero_digitos().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,NivelCuentaContable nivelcuentacontableLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,nivelcuentacontableLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,NivelCuentaContable nivelcuentacontableLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				nivelcuentacontableLocal=this.nivelcuentacontable;
			} else {
				nivelcuentacontableLocal=this.nivelcuentacontableAnterior;
			}
		}
		
		if(this.permiteMantenimiento(nivelcuentacontableLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNivelCuentaContable(nivelcuentacontableLocal,true);
					
					if(nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(nivelcuentacontableLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(nivelcuentacontableLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNivelCuentaContable(NivelCuentaContable nivelcuentacontable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNivelCuentaContable(nivelcuentacontable,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(nivelcuentacontable);
	}
	
	public void setVariablesFormularioToObjetoActualNivelCuentaContable(NivelCuentaContable nivelcuentacontable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNivelCuentaContable(nivelcuentacontable,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNivelCuentaContable(NivelCuentaContable nivelcuentacontable,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNivelCuentaContable.jLabelidNivelCuentaContable.getText()==null || this.jInternalFrameDetalleFormNivelCuentaContable.jLabelidNivelCuentaContable.getText()=="" || this.jInternalFrameDetalleFormNivelCuentaContable.jLabelidNivelCuentaContable.getText()=="Id") {
				this.jInternalFrameDetalleFormNivelCuentaContable.jLabelidNivelCuentaContable.setText("0");
			}

			if(conColumnasBase) {nivelcuentacontable.setId(Long.parseLong(this.jInternalFrameDetalleFormNivelCuentaContable.jLabelidNivelCuentaContable.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NivelCuentaContableConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCuentaContable.jLabelIdNivelCuentaContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			nivelcuentacontable.setnivel(Integer.parseInt(this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnivelNivelCuentaContable.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NivelCuentaContableConstantesFunciones.LABEL_NIVEL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCuentaContable.jLabelnivelNivelCuentaContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			nivelcuentacontable.setnumero_digitos(Integer.parseInt(this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnumero_digitosNivelCuentaContable.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCuentaContable.jLabelnumero_digitosNivelCuentaContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNivelCuentaContable(NivelCuentaContable nivelcuentacontableBean,NivelCuentaContable nivelcuentacontable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNivelCuentaContable(NivelCuentaContable nivelcuentacontableOrigen,NivelCuentaContable nivelcuentacontable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && nivelcuentacontableOrigen.getId()!=null && !nivelcuentacontableOrigen.getId().equals(0L))) {nivelcuentacontable.setId(nivelcuentacontableOrigen.getId());}}
			if(conDefault || (!conDefault && nivelcuentacontableOrigen.getnivel()!=null && !nivelcuentacontableOrigen.getnivel().equals(0))) {nivelcuentacontable.setnivel(nivelcuentacontableOrigen.getnivel());}
			if(conDefault || (!conDefault && nivelcuentacontableOrigen.getnumero_digitos()!=null && !nivelcuentacontableOrigen.getnumero_digitos().equals(0))) {nivelcuentacontable.setnumero_digitos(nivelcuentacontableOrigen.getnumero_digitos());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNivelCuentaContable(NivelCuentaContable nivelcuentacontable) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNivelCuentaContable.jLabelidNivelCuentaContable.setText(nivelcuentacontable.getId().toString());
			this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnivelNivelCuentaContable.setText(nivelcuentacontable.getnivel().toString());
			this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnumero_digitosNivelCuentaContable.setText(nivelcuentacontable.getnumero_digitos().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNivelCuentaContable(NivelCuentaContableBean nivelcuentacontableBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNivelCuentaContable.jLabelidNivelCuentaContable.setText(nivelcuentacontableBean.getId().toString());
			this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnivelNivelCuentaContable.setText(nivelcuentacontableBean.getnivel().toString());
			this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnumero_digitosNivelCuentaContable.setText(nivelcuentacontableBean.getnumero_digitos().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNivelCuentaContable(NivelCuentaContableParameterReturnGeneral nivelcuentacontableReturnGeneral,NivelCuentaContableBean nivelcuentacontableBean,Boolean conDefault) throws Exception { 
		try {
			NivelCuentaContable nivelcuentacontableLocal=new NivelCuentaContable();
			
			nivelcuentacontableLocal=nivelcuentacontableReturnGeneral.getNivelCuentaContable();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && nivelcuentacontableLocal.getId()!=null && !nivelcuentacontableLocal.getId().equals(0L))) {nivelcuentacontableBean.setId(nivelcuentacontableLocal.getId());}}
			if(conDefault || (!conDefault && nivelcuentacontableLocal.getnivel()!=null && !nivelcuentacontableLocal.getnivel().equals(0))) {nivelcuentacontableBean.setnivel(nivelcuentacontableLocal.getnivel());}
			if(conDefault || (!conDefault && nivelcuentacontableLocal.getnumero_digitos()!=null && !nivelcuentacontableLocal.getnumero_digitos().equals(0))) {nivelcuentacontableBean.setnumero_digitos(nivelcuentacontableLocal.getnumero_digitos());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNivelCuentaContableGenerico(Long idNivelCuentaContableSeleccionado,JComboBox jComboBoxNivelCuentaContable,List<NivelCuentaContable> nivelcuentacontablesLocal)throws Exception {
		try {
			NivelCuentaContable  nivelcuentacontableTemp=null;

			for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontablesLocal) {
				if(nivelcuentacontableAux.getId()!=null && nivelcuentacontableAux.getId().equals(idNivelCuentaContableSeleccionado)) {
					nivelcuentacontableTemp=nivelcuentacontableAux;
					break;
				}
			}

			jComboBoxNivelCuentaContable.setSelectedItem(nivelcuentacontableTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNivelCuentaContableGenerico(JComboBox jComboBoxNivelCuentaContable,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNivelCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNivelCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNivelCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNivelCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNivelCuentaContable.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNivelCuentaContable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNivelCuentaContable.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNivelCuentaContable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNivelCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNivelCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivelcuentacontable=(NivelCuentaContable) nivelcuentacontableLogic.getNivelCuentaContables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			nivelcuentacontable =(NivelCuentaContable) nivelcuentacontables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!nivelcuentacontable.getIsNew() && !nivelcuentacontable.getIsChanged() && !nivelcuentacontable.getIsDeleted()) {
				sDescripcion=nivelcuentacontable.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=nivelcuentacontable.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		NivelCuentaContable nivelcuentacontableRow=new NivelCuentaContable();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivelcuentacontableRow=(NivelCuentaContable) nivelcuentacontableLogic.getNivelCuentaContables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			nivelcuentacontableRow=(NivelCuentaContable) nivelcuentacontables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNivelCuentaContable(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNivelCuentaContable.setVisible((this.isVisibilidadCeldaNuevoNivelCuentaContable && this.isPermisoNuevoNivelCuentaContable));			
			this.jButtonDuplicarNivelCuentaContable.setVisible((this.isVisibilidadCeldaDuplicarNivelCuentaContable && this.isPermisoDuplicarNivelCuentaContable));			
			this.jButtonCopiarNivelCuentaContable.setVisible((this.isVisibilidadCeldaCopiarNivelCuentaContable && this.isPermisoCopiarNivelCuentaContable));
			this.jButtonVerFormNivelCuentaContable.setVisible((this.isVisibilidadCeldaVerFormNivelCuentaContable && this.isPermisoVerFormNivelCuentaContable));
			
			this.jButtonAbrirOrderByNivelCuentaContable.setVisible((this.isVisibilidadCeldaOrdenNivelCuentaContable && this.isPermisoOrdenNivelCuentaContable));			
			
			this.jButtonNuevoRelacionesNivelCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable && this.isPermisoNuevoNivelCuentaContable));			
			this.jButtonNuevoGuardarCambiosNivelCuentaContable.setVisible((this.isVisibilidadCeldaNuevoNivelCuentaContable && this.isPermisoNuevoNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable));
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonModificarNivelCuentaContable.setVisible((this.isVisibilidadCeldaModificarNivelCuentaContable && this.isPermisoActualizarNivelCuentaContable));	
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonActualizarNivelCuentaContable.setVisible((this.isVisibilidadCeldaActualizarNivelCuentaContable && this.isPermisoActualizarNivelCuentaContable));	
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonEliminarNivelCuentaContable.setVisible((this.isVisibilidadCeldaEliminarNivelCuentaContable && this.isPermisoEliminarNivelCuentaContable));
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonCancelarNivelCuentaContable.setVisible(this.isVisibilidadCeldaCancelarNivelCuentaContable);							
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosNivelCuentaContable.setVisible((this.isVisibilidadCeldaGuardarNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable));			
			
			}
						
			this.jButtonGuardarCambiosTablaNivelCuentaContable.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaNuevoNivelCuentaContable && this.isPermisoNuevoNivelCuentaContable));						
			this.jButtonDuplicarToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaDuplicarNivelCuentaContable && this.isPermisoDuplicarNivelCuentaContable));						
			this.jButtonCopiarToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaCopiarNivelCuentaContable && this.isPermisoCopiarNivelCuentaContable));			
			this.jButtonVerFormToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaVerFormNivelCuentaContable && this.isPermisoVerFormNivelCuentaContable));			
			this.jButtonAbrirOrderByToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaOrdenNivelCuentaContable && this.isPermisoOrdenNivelCuentaContable));
			this.jButtonNuevoRelacionesToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable && this.isPermisoNuevoNivelCuentaContable));			
			this.jButtonNuevoGuardarCambiosToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaNuevoNivelCuentaContable && this.isPermisoNuevoNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable));			
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonModificarToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaModificarNivelCuentaContable && this.isPermisoActualizarNivelCuentaContable));	
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonActualizarToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaActualizarNivelCuentaContable  && this.isPermisoActualizarNivelCuentaContable));	
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonEliminarToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaEliminarNivelCuentaContable && this.isPermisoEliminarNivelCuentaContable));
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonCancelarToolBarNivelCuentaContable.setVisible(this.isVisibilidadCeldaCancelarNivelCuentaContable);				
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaGuardarNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNivelCuentaContable.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNivelCuentaContable.setVisible((this.isVisibilidadCeldaNuevoNivelCuentaContable && this.isPermisoNuevoNivelCuentaContable));			
			this.jMenuItemDuplicarNivelCuentaContable.setVisible((this.isVisibilidadCeldaDuplicarNivelCuentaContable && this.isPermisoDuplicarNivelCuentaContable));			
			this.jMenuItemCopiarNivelCuentaContable.setVisible((this.isVisibilidadCeldaCopiarNivelCuentaContable && this.isPermisoCopiarNivelCuentaContable));			
			this.jMenuItemVerFormNivelCuentaContable.setVisible((this.isVisibilidadCeldaVerFormNivelCuentaContable && this.isPermisoVerFormNivelCuentaContable));			
			this.jMenuItemAbrirOrderByNivelCuentaContable.setVisible((this.isVisibilidadCeldaOrdenNivelCuentaContable && this.isPermisoOrdenNivelCuentaContable));			
			//this.jMenuItemMostrarOcultarNivelCuentaContable.setVisible((this.isVisibilidadCeldaOrdenNivelCuentaContable && this.isPermisoOrdenNivelCuentaContable));
			this.jMenuItemDetalleAbrirOrderByNivelCuentaContable.setVisible((this.isVisibilidadCeldaOrdenNivelCuentaContable && this.isPermisoOrdenNivelCuentaContable));			
			//this.jMenuItemDetalleMostrarOcultarNivelCuentaContable.setVisible((this.isVisibilidadCeldaOrdenNivelCuentaContable && this.isPermisoOrdenNivelCuentaContable));			
			this.jMenuItemNuevoRelacionesNivelCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable && this.isPermisoNuevoNivelCuentaContable));			
			this.jMenuItemNuevoGuardarCambiosNivelCuentaContable.setVisible((this.isVisibilidadCeldaNuevoNivelCuentaContable && this.isPermisoNuevoNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable));									
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemModificarNivelCuentaContable.setVisible((this.isVisibilidadCeldaModificarNivelCuentaContable && this.isPermisoActualizarNivelCuentaContable));	
			this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemActualizarNivelCuentaContable.setVisible((this.isVisibilidadCeldaActualizarNivelCuentaContable && this.isPermisoActualizarNivelCuentaContable));	
			this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemEliminarNivelCuentaContable.setVisible((this.isVisibilidadCeldaEliminarNivelCuentaContable && this.isPermisoEliminarNivelCuentaContable));
			this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemCancelarNivelCuentaContable.setVisible(this.isVisibilidadCeldaCancelarNivelCuentaContable);				
			}
			
			this.jMenuItemGuardarCambiosNivelCuentaContable.setVisible((this.isVisibilidadCeldaGuardarNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable));						
			this.jMenuItemGuardarCambiosTablaNivelCuentaContable.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNivelCuentaContable=this.jButtonNuevoNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaDuplicarNivelCuentaContable=this.jButtonDuplicarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaCopiarNivelCuentaContable=this.jButtonCopiarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaVerFormNivelCuentaContable=this.jButtonVerFormNivelCuentaContable.isVisible();
			
			this.isVisibilidadCeldaOrdenNivelCuentaContable=this.jButtonAbrirOrderByNivelCuentaContable.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=this.jButtonNuevoRelacionesNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaModificarNivelCuentaContable=this.jButtonModificarNivelCuentaContable.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			this.isVisibilidadCeldaActualizarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jButtonActualizarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaEliminarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jButtonEliminarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaCancelarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jButtonCancelarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaGuardarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosNivelCuentaContable.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=this.jButtonGuardarCambiosTablaNivelCuentaContable.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNivelCuentaContable=this.jButtonNuevoToolBarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=this.jButtonNuevoRelacionesToolBarNivelCuentaContable.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			this.isVisibilidadCeldaModificarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jButtonModificarToolBarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaActualizarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jButtonActualizarToolBarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaEliminarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jButtonEliminarToolBarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaCancelarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jButtonCancelarToolBarNivelCuentaContable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNivelCuentaContable=this.jButtonGuardarCambiosToolBarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=this.jButtonGuardarCambiosTablaToolBarNivelCuentaContable.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNivelCuentaContable=this.jMenuItemNuevoNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=this.jMenuItemNuevoRelacionesNivelCuentaContable.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			this.isVisibilidadCeldaModificarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemModificarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaActualizarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemActualizarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaEliminarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemEliminarNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaCancelarNivelCuentaContable=this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemCancelarNivelCuentaContable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNivelCuentaContable=this.jMenuItemGuardarCambiosNivelCuentaContable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=this.jMenuItemGuardarCambiosTablaNivelCuentaContable.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNivelCuentaContable(Boolean esInicializar) {
		if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {			
			if(this.nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
				//if(this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNivelCuentaContable();
			}
			
			this.inicializarActualizarBindingBotonesManualNivelCuentaContable(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNivelCuentaContable() {
		this.jButtonNuevoNivelCuentaContable.setVisible(this.isPermisoNuevoNivelCuentaContable);			
		this.jButtonDuplicarNivelCuentaContable.setVisible(this.isPermisoDuplicarNivelCuentaContable);			
		this.jButtonCopiarNivelCuentaContable.setVisible(this.isPermisoCopiarNivelCuentaContable);			
		this.jButtonVerFormNivelCuentaContable.setVisible(this.isPermisoVerFormNivelCuentaContable);			
		
		this.jButtonAbrirOrderByNivelCuentaContable.setVisible(this.isPermisoOrdenNivelCuentaContable);					
		
		this.jButtonNuevoRelacionesNivelCuentaContable.setVisible(this.isPermisoNuevoNivelCuentaContable);			
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonModificarNivelCuentaContable.setVisible(this.isPermisoActualizarNivelCuentaContable);	
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonActualizarNivelCuentaContable.setVisible(this.isPermisoActualizarNivelCuentaContable);	
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonEliminarNivelCuentaContable.setVisible(this.isPermisoEliminarNivelCuentaContable);
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonCancelarNivelCuentaContable.setVisible(this.isVisibilidadCeldaCancelarNivelCuentaContable);						
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosNivelCuentaContable.setVisible(this.isPermisoGuardarCambiosNivelCuentaContable);							
		}
		
		this.jButtonGuardarCambiosTablaNivelCuentaContable.setVisible(this.isPermisoActualizarNivelCuentaContable);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNivelCuentaContable() {
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonModificarNivelCuentaContable.setVisible(this.isPermisoActualizarNivelCuentaContable);	
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonActualizarNivelCuentaContable.setVisible(this.isPermisoActualizarNivelCuentaContable);	
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonEliminarNivelCuentaContable.setVisible(this.isPermisoEliminarNivelCuentaContable);
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonCancelarNivelCuentaContable.setVisible(this.isVisibilidadCeldaCancelarNivelCuentaContable);							
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosNivelCuentaContable.setVisible((this.isVisibilidadCeldaGuardarNivelCuentaContable && this.isPermisoGuardarCambiosNivelCuentaContable));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNivelCuentaContable() {
		if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNivelCuentaContable();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNivelCuentaContable() {
	}
	
	public void jTableDatosNivelCuentaContableListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNivelCuentaContable(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNivelCuentaContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.getnivelcuentacontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivelcuentacontable==null) {
						this.nivelcuentacontable = new NivelCuentaContable();
					}

					this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.nivelcuentacontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
				}

				if(this.nivelcuentacontable.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.nivelcuentacontable.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelCuentaContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaNivelCuentaContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebNivelCuentaContable(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNivelCuentaContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNivelCuentaContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.getnivelcuentacontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.nivelcuentacontableLogic.getConnexion());

				if(this.nivelcuentacontable.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.nivelcuentacontable.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNivelCuentaContable=(TitledBorder)this.jScrollPanelDatosNivelCuentaContable.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderNivelCuentaContable.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaNivelCuentaContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.getnivelcuentacontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivelcuentacontable==null) {
						this.nivelcuentacontable = new NivelCuentaContable();
					}

					this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.nivelcuentacontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
				}

				if(this.nivelcuentacontable.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.nivelcuentacontable.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelCuentaContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnivelNivelCuentaContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.getnivelcuentacontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivelcuentacontable==null) {
						this.nivelcuentacontable = new NivelCuentaContable();
					}

					this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.nivelcuentacontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
				}

				if(this.nivelcuentacontable.getnivel()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nivel = "+this.nivelcuentacontable.getnivel().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelCuentaContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_digitosNivelCuentaContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.getnivelcuentacontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivelcuentacontable==null) {
						this.nivelcuentacontable = new NivelCuentaContable();
					}

					this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.nivelcuentacontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);
				}

				if(this.nivelcuentacontable.getnumero_digitos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_digitos = "+this.nivelcuentacontable.getnumero_digitos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelCuentaContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaNivelCuentaContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNivelCuentaContable(false,false);

			this.getNivelCuentaContablesFK_IdEmpresa();

			this.inicializarActualizarBindingNivelCuentaContable(false);

			//if(NivelCuentaContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNivelCuentaContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameNivelCuentaContable() {
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
			this.jInternalFrameDetalleFormNivelCuentaContable.setVisible(false);	    			
			this.jInternalFrameDetalleFormNivelCuentaContable.dispose();
			this.jInternalFrameDetalleFormNivelCuentaContable=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNivelCuentaContable!=null) {
			this.jInternalFrameReporteDinamicoNivelCuentaContable.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNivelCuentaContable.dispose();
			this.jInternalFrameReporteDinamicoNivelCuentaContable=null;
		}
		
		if(this.jInternalFrameImportacionNivelCuentaContable!=null) {
			this.jInternalFrameImportacionNivelCuentaContable.setVisible(false);	    			
			this.jInternalFrameImportacionNivelCuentaContable.dispose();
			this.jInternalFrameImportacionNivelCuentaContable=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNivelCuentaContable();
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
			
			if(sTipo.equals("NuevoNivelCuentaContable")) {
				jButtonNuevoNivelCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNivelCuentaContable")) {
				jButtonDuplicarNivelCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNivelCuentaContable")) {
				jButtonCopiarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("VerFormNivelCuentaContable")) {
				jButtonVerFormNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNivelCuentaContable")) {
				jButtonNuevoNivelCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNivelCuentaContable")) {
				jButtonDuplicarNivelCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNivelCuentaContable")) {
				jButtonNuevoNivelCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNivelCuentaContable")) {
				jButtonDuplicarNivelCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNivelCuentaContable")) {
				jButtonNuevoNivelCuentaContableActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNivelCuentaContable")) {
				jButtonNuevoNivelCuentaContableActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNivelCuentaContable")) {
				jButtonNuevoNivelCuentaContableActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNivelCuentaContable")) {
				jButtonModificarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNivelCuentaContable")) {
				jButtonModificarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNivelCuentaContable")) {
				jButtonModificarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNivelCuentaContable")) {
				jButtonActualizarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNivelCuentaContable")) {
				jButtonActualizarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNivelCuentaContable")) {
				jButtonActualizarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("EliminarNivelCuentaContable")) {
				jButtonEliminarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNivelCuentaContable")) {
				jButtonEliminarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNivelCuentaContable")) {
				jButtonEliminarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("CancelarNivelCuentaContable")) {
				jButtonCancelarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNivelCuentaContable")) {
				jButtonCancelarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNivelCuentaContable")) {
				jButtonCancelarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("CerrarNivelCuentaContable")) {
				jButtonCerrarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNivelCuentaContable")) {
				jButtonCerrarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNivelCuentaContable")) {
				jButtonCerrarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNivelCuentaContable")) {
				jButtonMostrarOcultarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNivelCuentaContable")) {
				jButtonCancelarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNivelCuentaContable")) {
				jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNivelCuentaContable")) {
				jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNivelCuentaContable")) {
				jButtonCopiarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNivelCuentaContable")) {
				jButtonVerFormNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNivelCuentaContable")) {
				jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNivelCuentaContable")) {
				jButtonCopiarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNivelCuentaContable")) {
				jButtonVerFormNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNivelCuentaContable")) {
				jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNivelCuentaContable")) {
				jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNivelCuentaContable")) {
				jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNivelCuentaContable")) {
				jButtonRecargarInformacionNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNivelCuentaContable")) {
				jButtonRecargarInformacionNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNivelCuentaContable")) {
				jButtonRecargarInformacionNivelCuentaContableActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNivelCuentaContable")) {
				jButtonAnterioresNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNivelCuentaContable")) {
				jButtonAnterioresNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNivelCuentaContable")) {
				jButtonAnterioresNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNivelCuentaContable")) {
				jButtonSiguientesNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNivelCuentaContable")) {
				jButtonSiguientesNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNivelCuentaContable")) {
				jButtonSiguientesNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNivelCuentaContable") || sTipo.equals("MenuItemDetalleAbrirOrderByNivelCuentaContable")) {
				jButtonAbrirOrderByNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNivelCuentaContable") || sTipo.equals("MenuItemDetalleMostrarOcultarNivelCuentaContable")) {
				jButtonMostrarOcultarNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNivelCuentaContable")) {
				jButtonNuevoGuardarCambiosNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNivelCuentaContable")) {
				jButtonNuevoGuardarCambiosNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNivelCuentaContable")) {
				jButtonNuevoGuardarCambiosNivelCuentaContableActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNivelCuentaContable")) {
				jButtonCerrarReporteDinamicoNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNivelCuentaContable")) {
				jButtonGenerarReporteDinamicoNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNivelCuentaContable")) {
				
				jButtonGenerarExcelReporteDinamicoNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNivelCuentaContable")) {
				jButtonCerrarImportacionNivelCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNivelCuentaContable")) {
				
				jButtonGenerarImportacionNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNivelCuentaContable")) {
				
				jButtonAbrirImportacionNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNivelCuentaContable")) {
				jComboBoxTiposAccionesNivelCuentaContableActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNivelCuentaContable")) {
				jComboBoxTiposRelacionesNivelCuentaContableActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNivelCuentaContable")) {
				jComboBoxTiposAccionesNivelCuentaContableActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNivelCuentaContable")) {
				
				jComboBoxTiposSeleccionarNivelCuentaContableActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNivelCuentaContable")) {
				jTextFieldValorCampoGeneralNivelCuentaContableActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNivelCuentaContable")) {
				jButtonAbrirOrderByNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNivelCuentaContable")) {
				jButtonAbrirOrderByNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNivelCuentaContable")) {
				jButtonCerrarOrderByNivelCuentaContableActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNivelCuentaContableBusqueda")) {
				this.jButtonidNivelCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNivelCuentaContableUpdate")) {
				this.jButtonid_empresaNivelCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNivelCuentaContableBusqueda")) {
				this.jButtonid_empresaNivelCuentaContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nivelNivelCuentaContableBusqueda")) {
				this.jButtonnivelNivelCuentaContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_digitosNivelCuentaContableBusqueda")) {
				this.jButtonnumero_digitosNivelCuentaContableBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNivelCuentaContable();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaContableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				


				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			NivelCuentaContable nivelcuentacontableLocal=null;
			
			if(!this.getEsControlTabla()) {
				nivelcuentacontableLocal=this.nivelcuentacontable;
			} else {
				nivelcuentacontableLocal=this.nivelcuentacontableAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
							
				
				


				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
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
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
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
			
			


			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaContableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
								
						
				


				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuentaContable.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
								
				
				


				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaContableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
							
				
				


				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuentaContable.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaContableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
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
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
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
			
			


			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaContableActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
								
				
				


				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaContableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaContableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNivelCuentaContable")) {
					jCheckBoxSeleccionarTodosNivelCuentaContableItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNivelCuentaContable")) {
					jCheckBoxSeleccionadosNivelCuentaContableItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNivelCuentaContable")) {
					
				}
				
				


				
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
												
				
				


				
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaContableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaContableActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
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
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
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
			
			


			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaContableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuentaContable.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuentaContable.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuentacontable);
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
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
				
				


				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuentaContable.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentacontableAnterior =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNivelCuentaContable")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNivelCuentaContableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNivelCuentaContable.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.nivelcuentacontable =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.nivelcuentacontable);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNivelCuentaContable")) {
				
				}
				
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNivelCuentaContable")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNivelCuentaContable.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNivelCuentaContable")) {
			
			}
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNivelCuentaContable();
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
			if(sTipo.equals("NuevoNivelCuentaContable")) {
				jButtonNuevoNivelCuentaContableActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNivelCuentaContable")) {
				jButtonDuplicarNivelCuentaContableActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNivelCuentaContable")) {
				jButtonCopiarNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNivelCuentaContable")) {
				jButtonVerFormNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNivelCuentaContable")) {
				jButtonNuevoNivelCuentaContableActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNivelCuentaContable")) {
				jButtonModificarNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNivelCuentaContable")) {
				jButtonActualizarNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNivelCuentaContable")) {
				jButtonEliminarNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNivelCuentaContable")) {
				jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNivelCuentaContable")) {
				jButtonCancelarNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNivelCuentaContable")) {
				jButtonCerrarNivelCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNivelCuentaContable")) {
				jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNivelCuentaContable")) {
				jButtonNuevoGuardarCambiosNivelCuentaContableActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNivelCuentaContable")) {
				jButtonAbrirOrderByNivelCuentaContableActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNivelCuentaContable")) {
				jButtonRecargarInformacionNivelCuentaContableActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNivelCuentaContable")) {
				jButtonAnterioresNivelCuentaContableActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNivelCuentaContable")) {
				jButtonSiguientesNivelCuentaContableActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNivelCuentaContableBusqueda")) {
				this.jButtonidNivelCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNivelCuentaContableUpdate")) {
				this.jButtonid_empresaNivelCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNivelCuentaContableBusqueda")) {
				this.jButtonid_empresaNivelCuentaContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nivelNivelCuentaContableBusqueda")) {
				this.jButtonnivelNivelCuentaContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_digitosNivelCuentaContableBusqueda")) {
				this.jButtonnumero_digitosNivelCuentaContableBusquedaActionPerformed(evt);
			}
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNivelCuentaContable();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNivelCuentaContable")) {
				closingInternalFrameNivelCuentaContable();
				
			} else if(sTipo.equals("jButtonCancelarNivelCuentaContable")) {
				JInternalFrameBase jInternalFrameDetalleFormNivelCuentaContable = (JInternalFrameBase)evt.getSource();
	            	
	            NivelCuentaContableBeanSwingJInternalFrame jInternalFrameParent=(NivelCuentaContableBeanSwingJInternalFrame)jInternalFrameDetalleFormNivelCuentaContable.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNivelCuentaContableActionPerformed(null);
			}
			
			NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nivelcuentacontable,new Object(),this.nivelcuentacontableParameterGeneral,this.nivelcuentacontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNivelCuentaContable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNivelCuentaContable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNivelCuentaContable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.nivelcuentacontable)) {
			if(!esControlTabla) {
				if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.nivelcuentacontable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);			
				}
				
				if(this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNivelCuentaContable(this.nivelcuentacontable,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.nivelcuentacontableReturnGeneral=nivelcuentacontableLogic.procesarEventosNivelCuentaContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcuentacontableLogic.getNivelCuentaContables(),this.nivelcuentacontable,this.nivelcuentacontableParameterGeneral,this.isEsNuevoNivelCuentaContable,classes);//this.nivelcuentacontableLogic.getNivelCuentaContable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNivelCuentaContable(this.nivelcuentacontableReturnGeneral,this.nivelcuentacontableBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNivelCuentaContable(classes,this.nivelcuentacontableReturnGeneral,this.nivelcuentacontableBean,false);
					}
						
					if(this.nivelcuentacontableReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNivelCuentaContable(this.nivelcuentacontableReturnGeneral.getNivelCuentaContable());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNivelCuentaContable(this.nivelcuentacontableReturnGeneral.getNivelCuentaContable());	
					}
						
					if(this.nivelcuentacontableReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNivelCuentaContable(this.nivelcuentacontableReturnGeneral.getNivelCuentaContable(),classes);//this.nivelcuentacontableBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNivelCuentaContable(this.nivelcuentacontable,classes);//this.nivelcuentacontableBean);									
				}
			
				if(NivelCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNivelCuentaContable(this.nivelcuentacontable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuentaContable(this.nivelcuentacontable);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.nivelcuentacontableAnterior!=null) {
						this.nivelcuentacontable=this.nivelcuentacontableAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.nivelcuentacontableReturnGeneral=nivelcuentacontableLogic.procesarEventosNivelCuentaContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcuentacontableLogic.getNivelCuentaContables(),this.nivelcuentacontable,this.nivelcuentacontableParameterGeneral,this.isEsNuevoNivelCuentaContable,classes);//this.nivelcuentacontableLogic.getNivelCuentaContable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.nivelcuentacontableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.nivelcuentacontableReturnGeneral.getNivelCuentaContable(),nivelcuentacontableLogic.getNivelCuentaContables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.nivelcuentacontableReturnGeneral.getNivelCuentaContable(),this.nivelcuentacontables);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNivelCuentaContable.repaint();
				
				//((AbstractTableModel) this.jTableDatosNivelCuentaContable.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNivelCuentaContable();
			}
		}
	}
	
	public void actualizarVisualTableDatosNivelCuentaContable() throws Exception {
		
		NivelCuentaContableModel nivelcuentacontableModel=(NivelCuentaContableModel)this.jTableDatosNivelCuentaContable.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivelcuentacontableModel.nivelcuentacontables=this.nivelcuentacontableLogic.getNivelCuentaContables();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			nivelcuentacontableModel.nivelcuentacontables=this.nivelcuentacontables;
		}
		
		
		((NivelCuentaContableModel) this.jTableDatosNivelCuentaContable.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNivelCuentaContable() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnivelcuentacontableAnterior(),this.nivelcuentacontableLogic.getNivelCuentaContables());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnivelcuentacontableAnterior(),this.nivelcuentacontables);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNivelCuentaContable();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNivelCuentaContable(NivelCuentaContable nivelcuentacontable,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
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
										
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcuentacontable,new Object(),generalEntityParameterGeneral,this.nivelcuentacontableReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NivelCuentaContableConstantesFunciones.getClassesRelationshipsOfNivelCuentaContable(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NivelCuentaContableConstantesFunciones.getClassesRelationshipsFromStringsOfNivelCuentaContable(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNivelCuentaContable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NivelCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcuentacontable,new Object(),generalEntityParameterGeneral,this.nivelcuentacontableReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNivelCuentaContable(NivelCuentaContableBean nivelcuentacontableBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNivelCuentaContable(ArrayList<Classe> classes,NivelCuentaContableReturnGeneral nivelcuentacontableReturnGeneral,NivelCuentaContableBean nivelcuentacontableBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNivelCuentaContable(NivelCuentaContable nivelcuentacontable,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.nivelcuentacontable)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNivelCuentaContable = new NivelCuentaContableDetalleFormJInternalFrame(jDesktopPane,this.nivelcuentacontableSessionBean.getConGuardarRelaciones(),this.nivelcuentacontableSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNivelCuentaContable);
		this.jInternalFrameDetalleFormNivelCuentaContable.setVisible(false);
		this.jInternalFrameDetalleFormNivelCuentaContable.setSelected(false);						
		
		this.jInternalFrameDetalleFormNivelCuentaContable.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNivelCuentaContable.nivelcuentacontableLogic=this.nivelcuentacontableLogic;
		
		this.cargarCombosFrameForeignKeyNivelCuentaContable("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNivelCuentaContable();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNivelCuentaContable();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNivelCuentaContable("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNivelCuentaContable();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNivelCuentaContable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNivelCuentaContable"));
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonModificarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"ModificarNivelCuentaContable"));

		
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonModificarToolBarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"ModificarToolBarNivelCuentaContable"));
					
		this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemModificarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"MenuItemModificarNivelCuentaContable"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonActualizarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"ActualizarNivelCuentaContable"));
		
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonActualizarToolBarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNivelCuentaContable"));
						
		this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemActualizarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNivelCuentaContable"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonEliminarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"EliminarNivelCuentaContable"));
		
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonEliminarToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"EliminarToolBarNivelCuentaContable"));
								
		this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemEliminarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNivelCuentaContable"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonCancelarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"CancelarNivelCuentaContable"));
		
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonCancelarToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"CancelarToolBarNivelCuentaContable"));
					
		this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemCancelarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNivelCuentaContable"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemDetalleCerrarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNivelCuentaContable"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelCuentaContable"));
		
		
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelCuentaContable"));
		
		
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNivelCuentaContable"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonidNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"idNivelCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonid_empresaNivelCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNivelCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonid_empresaNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNivelCuentaContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonnivelNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"nivelNivelCuentaContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonnumero_digitosNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"numero_digitosNivelCuentaContableBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNivelCuentaContable.jTabbedPaneRelacionesNivelCuentaContable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNivelCuentaContable"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNivelCuentaContable"));
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNivelCuentaContable"));
		}
		
		this.jTableDatosNivelCuentaContable.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNivelCuentaContable"));
		
		this.jTableDatosNivelCuentaContable.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNivelCuentaContable"));
		
		this.jButtonNuevoNivelCuentaContable.addActionListener(new ButtonActionListener(this,"NuevoNivelCuentaContable"));
		
		this.jButtonDuplicarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"DuplicarNivelCuentaContable"));
		
		this.jButtonCopiarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"CopiarNivelCuentaContable"));
		
		this.jButtonVerFormNivelCuentaContable.addActionListener(new ButtonActionListener(this,"VerFormNivelCuentaContable"));
		
		
		this.jButtonNuevoToolBarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"NuevoToolBarNivelCuentaContable"));
			
		this.jButtonDuplicarToolBarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNivelCuentaContable"));
			
		this.jMenuItemNuevoNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNivelCuentaContable"));
			
		this.jMenuItemDuplicarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNivelCuentaContable"));		
		
		
		this.jButtonNuevoRelacionesNivelCuentaContable.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNivelCuentaContable"));
		
		
		this.jButtonNuevoRelacionesToolBarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNivelCuentaContable"));
			
		this.jMenuItemNuevoRelacionesNivelCuentaContable.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNivelCuentaContable"));		
		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonModificarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"ModificarNivelCuentaContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonModificarToolBarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"ModificarToolBarNivelCuentaContable"));
			
			this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemModificarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"MenuItemModificarNivelCuentaContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonActualizarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"ActualizarNivelCuentaContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonActualizarToolBarNivelCuentaContable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNivelCuentaContable"));
				
			this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemActualizarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNivelCuentaContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonEliminarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"EliminarNivelCuentaContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonEliminarToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"EliminarToolBarNivelCuentaContable"));
						
			this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemEliminarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNivelCuentaContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonCancelarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"CancelarNivelCuentaContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonCancelarToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"CancelarToolBarNivelCuentaContable"));
			
			this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemCancelarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNivelCuentaContable"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNivelCuentaContable"));		
		
		
		this.jButtonCerrarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"CerrarNivelCuentaContable"));
		
		
		this.jButtonCerrarToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"CerrarToolBarNivelCuentaContable"));
			
		this.jMenuItemCerrarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNivelCuentaContable"));
			
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jMenuItemDetalleCerrarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNivelCuentaContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosNivelCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosNivelCuentaContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelCuentaContable"));
		}
		
		this.jButtonCopiarToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"CopiarToolBarNivelCuentaContable"));
			
		this.jButtonVerFormToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"VerFormToolBarNivelCuentaContable"));
		
		this.jMenuItemGuardarCambiosNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNivelCuentaContable"));
			
		this.jMenuItemCopiarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNivelCuentaContable"));		
		
		this.jMenuItemVerFormNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNivelCuentaContable"));		
		
		
		this.jButtonGuardarCambiosTablaNivelCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNivelCuentaContable"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNivelCuentaContable"));
			
		this.jMenuItemGuardarCambiosTablaNivelCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNivelCuentaContable"));		
		
		
		
		this.jButtonRecargarInformacionNivelCuentaContable.addActionListener (new ButtonActionListener(this,"RecargarInformacionNivelCuentaContable"));
					
		this.jButtonRecargarInformacionToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNivelCuentaContable"));
		
		this.jMenuItemRecargarInformacionNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNivelCuentaContable"));		
		
		
		
		this.jButtonAnterioresNivelCuentaContable.addActionListener (new ButtonActionListener(this,"AnterioresNivelCuentaContable"));
		
		
		this.jButtonAnterioresToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNivelCuentaContable"));
		
		this.jMenuItemAnterioresNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNivelCuentaContable"));		
		
		
		this.jButtonSiguientesNivelCuentaContable.addActionListener (new ButtonActionListener(this,"SiguientesNivelCuentaContable"));
		
		
		this.jButtonSiguientesToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNivelCuentaContable"));
			
		this.jMenuItemSiguientesNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNivelCuentaContable"));
			
		this.jMenuItemAbrirOrderByNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNivelCuentaContable"));
			
		this.jMenuItemMostrarOcultarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNivelCuentaContable"));
			
		this.jMenuItemDetalleAbrirOrderByNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNivelCuentaContable"));
			
		this.jMenuItemDetalleMostarOcultarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNivelCuentaContable"));		
		
		
		this.jButtonNuevoGuardarCambiosNivelCuentaContable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNivelCuentaContable"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNivelCuentaContable"));
			
		this.jMenuItemNuevoGuardarCambiosNivelCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNivelCuentaContable"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNivelCuentaContable.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNivelCuentaContable"));

		this.jCheckBoxSeleccionadosNivelCuentaContable.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNivelCuentaContable"));
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNivelCuentaContable"));
		}
		
		
		this.jComboBoxTiposRelacionesNivelCuentaContable.addActionListener (new ButtonActionListener(this,"TiposRelacionesNivelCuentaContable"));
			
		this.jComboBoxTiposAccionesNivelCuentaContable.addActionListener (new ButtonActionListener(this,"TiposAccionesNivelCuentaContable"));
					
		this.jComboBoxTiposSeleccionarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNivelCuentaContable"));
			
		this.jTextFieldValorCampoGeneralNivelCuentaContable.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNivelCuentaContable"));		
		
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonidNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"idNivelCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonid_empresaNivelCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNivelCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonid_empresaNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNivelCuentaContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonnivelNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"nivelNivelCuentaContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonnumero_digitosNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"numero_digitosNivelCuentaContableBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNivelCuentaContable!=null) {
				this.jInternalFrameReporteDinamicoNivelCuentaContable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelCuentaContable"));
				this.jInternalFrameReporteDinamicoNivelCuentaContable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelCuentaContable"));
				this.jInternalFrameReporteDinamicoNivelCuentaContable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelCuentaContable"));
			}
			
			//this.jButtonCerrarReporteDinamicoNivelCuentaContable.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelCuentaContable"));				
			//this.jButtonGenerarReporteDinamicoNivelCuentaContable.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelCuentaContable"));
			//this.jButtonGenerarExcelReporteDinamicoNivelCuentaContable.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelCuentaContable"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNivelCuentaContable!=null) {
				this.jInternalFrameImportacionNivelCuentaContable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNivelCuentaContable"));
				this.jInternalFrameImportacionNivelCuentaContable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNivelCuentaContable"));
				this.jInternalFrameImportacionNivelCuentaContable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNivelCuentaContable"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNivelCuentaContable.addActionListener (new ButtonActionListener(this,"AbrirOrderByNivelCuentaContable"));
			
			this.jButtonAbrirOrderByToolBarNivelCuentaContable.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNivelCuentaContable"));			
			
			if(this.jInternalFrameOrderByNivelCuentaContable!=null) {
				this.jInternalFrameOrderByNivelCuentaContable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNivelCuentaContable"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuentaContable.jTabbedPaneRelacionesNivelCuentaContable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNivelCuentaContable"));
		
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
            		closingInternalFrameNivelCuentaContable();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNivelCuentaContable.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNivelCuentaContable = (JInternalFrameBase)event.getSource();
	            	
	            NivelCuentaContableBeanSwingJInternalFrame jInternalFrameParent=(NivelCuentaContableBeanSwingJInternalFrame)jInternalFrameDetalleFormNivelCuentaContable.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNivelCuentaContableActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNivelCuentaContable.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNivelCuentaContableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNivelCuentaContable.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNivelCuentaContable.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNivelCuentaContable";
		inputMap = this.jButtonNuevoNivelCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNivelCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNivelCuentaContableActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNivelCuentaContable";
		inputMap = this.jButtonNuevoRelacionesNivelCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNivelCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNivelCuentaContableActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNivelCuentaContable";
		inputMap = this.jButtonModificarNivelCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNivelCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNivelCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNivelCuentaContable";
		inputMap = this.jButtonActualizarNivelCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNivelCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNivelCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNivelCuentaContable";
		inputMap = this.jButtonEliminarNivelCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNivelCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNivelCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNivelCuentaContable";
		inputMap = this.jButtonCancelarNivelCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNivelCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNivelCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNivelCuentaContable";
		inputMap = this.jButtonCerrarNivelCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNivelCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNivelCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNivelCuentaContable";
		inputMap = this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosNivelCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonGuardarCambiosNivelCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNivelCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNivelCuentaContable.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNivelCuentaContableItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNivelCuentaContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNivelCuentaContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNivelCuentaContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNivelCuentaContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNivelCuentaContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNivelCuentaContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonidNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"idNivelCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonid_empresaNivelCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNivelCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonid_empresaNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNivelCuentaContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonnivelNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"nivelNivelCuentaContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuentaContable.jButtonnumero_digitosNivelCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"numero_digitosNivelCuentaContableBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNivelCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNivelCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNivelCuentaContableActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNivelCuentaContable.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNivelCuentaContable(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontableLogic.getNivelCuentaContables()) {
					nivelcuentacontableAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontables) {
					nivelcuentacontableAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNivelCuentaContableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNivelCuentaContable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontableLogic.getNivelCuentaContables()) {
						nivelcuentacontableAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontables) {
						nivelcuentacontableAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontableLogic.getNivelCuentaContables()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontables) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNivelCuentaContable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNivelCuentaContable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNivelCuentaContable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNivelCuentaContable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNivelCuentaContableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNivelCuentaContable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNivelCuentaContable.getSelectedRows();
			
			NivelCuentaContable nivelcuentacontableLocal=new NivelCuentaContable();
			
			//this.seleccionarTodosNivelCuentaContable(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivelcuentacontableLocal =(NivelCuentaContable) this.nivelcuentacontableLogic.getNivelCuentaContables().toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					nivelcuentacontableLocal =(NivelCuentaContable) this.nivelcuentacontables.toArray()[this.jTableDatosNivelCuentaContable.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				nivelcuentacontableLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontableLogic.getNivelCuentaContables()) {
						nivelcuentacontableAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontables) {
						nivelcuentacontableAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNivelCuentaContable(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNivelCuentaContable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNivelCuentaContable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNivelCuentaContable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNivelCuentaContableItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNivelCuentaContableParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNivelCuentaContableActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNivelCuentaContable(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNivelCuentaContable.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontableLogic.getNivelCuentaContables()) {
				
						if(sTipoSeleccionar.equals(NivelCuentaContableConstantesFunciones.LABEL_NIVEL)) {
							existe=true;
							nivelcuentacontableAux.setnivel(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS)) {
							existe=true;
							nivelcuentacontableAux.setnumero_digitos(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontables) {
					
						if(sTipoSeleccionar.equals(NivelCuentaContableConstantesFunciones.LABEL_NIVEL)) {
							existe=true;
							nivelcuentacontableAux.setnivel(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS)) {
							existe=true;
							nivelcuentacontableAux.setnumero_digitos(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNivelCuentaContable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNivelCuentaContableActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNivelCuentaContable(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNivelCuentaContable=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNivelCuentaContable.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNivelCuentaContable) {				
					conSplash=true;//false;										
					
					//this.startProcessNivelCuentaContable(conSplash);
				
					this.generarReporteNivelCuentaContablesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCuentaContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNivelCuentaContablesSeleccionados();
				//this.jComboBoxTiposAccionesNivelCuentaContable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNivelCuentaContablesSeleccionados(false);
				//this.jComboBoxTiposAccionesNivelCuentaContable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNivelCuentaContablesSeleccionados(true);
				//this.jComboBoxTiposAccionesNivelCuentaContable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNivelCuentaContable();
				
				this.exportarNivelCuentaContablesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCuentaContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNivelCuentaContables();
				//this.importarNivelCuentaContables();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCuentaContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNivelCuentaContable();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNivelCuentaContablesSeleccionados();
				//this.jComboBoxTiposAccionesNivelCuentaContable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Nivel Cuenta Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNivelCuentaContable();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNivelCuentaContable)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNivelCuentaContable(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Nivel Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCuentaContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.setSelectedIndex(0);					
				}	
			} 			
			else if(NivelCuentaContableBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNivelCuentaContable) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNivelCuentaContable(conSplash);
					
						//this.actualizarParametrosGeneralNivelCuentaContable();
						
						this.generarReporteProcesoAccionNivelCuentaContablesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNivelCuentaContable.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NivelCuentaContableBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Nivel Cuenta ContableS SELECCIONADOS?", "MANTENIMIENTO DE Nivel Cuenta Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNivelCuentaContable();
				
						this.actualizarParametrosGeneralNivelCuentaContable();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.nivelcuentacontableReturnGeneral=nivelcuentacontableLogic.procesarAccionNivelCuentaContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.nivelcuentacontableLogic.getNivelCuentaContables(),this.nivelcuentacontableParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNivelCuentaContableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNivelCuentaContable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNivelCuentaContable();
					
					NivelCuentaContableBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNivelCuentaContableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNivelCuentaContable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxTiposAccionesFormularioNivelCuentaContable.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNivelCuentaContable(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNivelCuentaContableActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNivelCuentaContable();
			
			if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();		
			NivelCuentaContable nivelcuentacontable=new NivelCuentaContable();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNivelCuentaContable(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNivelCuentaContable.getSelectedItem();
			
			
			
			
			nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(true);
			//this.sTipoAccion;
			
			if(nivelcuentacontablesSeleccionados.size()==1) {
				for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontablesSeleccionados) {
					nivelcuentacontable=nivelcuentacontableAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNivelCuentaContable();
			
      		//this.finishProcessNivelCuentaContable(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNivelCuentaContableReturnGeneral() throws Exception {
		if(this.nivelcuentacontableReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.nivelcuentacontableReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.nivelcuentacontableReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.nivelcuentacontableReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.nivelcuentacontableReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.nivelcuentacontableReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNivelCuentaContable(false);
		}
		
		if(this.nivelcuentacontableReturnGeneral.getConRetornoLista() || this.nivelcuentacontableReturnGeneral.getConRetornoObjeto()) {
			if(this.nivelcuentacontableReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.nivelcuentacontableLogic.setNivelCuentaContables(this.nivelcuentacontableReturnGeneral.getNivelCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.nivelcuentacontableReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.nivelcuentacontableLogic.setNivelCuentaContable(this.nivelcuentacontableReturnGeneral.getNivelCuentaContable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingNivelCuentaContable(false);
		}
	}
	
	public void actualizarParametrosGeneralNivelCuentaContable() throws Exception {
		
		
	}
	
	public ArrayList<NivelCuentaContable> getNivelCuentaContablesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNivelCuentaContable) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontableLogic.getNivelCuentaContables()) {
					if(nivelcuentacontableAux.getIsSelected()) {
						nivelcuentacontablesSeleccionados.add(nivelcuentacontableAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCuentaContable nivelcuentacontableAux:this.nivelcuentacontables) {
					if(nivelcuentacontableAux.getIsSelected()) {
						nivelcuentacontablesSeleccionados.add(nivelcuentacontableAux);				
					}
				}
			}
			
			if(nivelcuentacontablesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						nivelcuentacontablesSeleccionados.addAll(this.nivelcuentacontableLogic.getNivelCuentaContables());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						nivelcuentacontablesSeleccionados.addAll(this.nivelcuentacontables);				
					}
				}
			}
		} else {
			nivelcuentacontablesSeleccionados.add(this.nivelcuentacontable);
		}
		
		return nivelcuentacontablesSeleccionados;
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
	
	public void generarReporteNivelCuentaContablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNivelCuentaContablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNivelCuentaContablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNivelCuentaContablesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNivelCuentaContablesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Nivel Cuenta Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNivelCuentaContablesSeleccionados() throws Exception {
		ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();		
		
		nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNivelCuentaContables("Todos",nivelcuentacontablesSeleccionados);
		
	}	
	
	public void generarReporteNormalNivelCuentaContablesSeleccionados() throws Exception {
		ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();		
		
		nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNivelCuentaContables("Todos",nivelcuentacontablesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNivelCuentaContablesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();
		
		nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNivelCuentaContables("Todos",nivelcuentacontablesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNivelCuentaContablesSeleccionados() throws Exception {
		ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNivelCuentaContable();
		
		
		nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNivelCuentaContable();
		
		
		//this.generarReporteNivelCuentaContables("Todos",nivelcuentacontablesSeleccionados ,nivelcuentacontableImplementable,nivelcuentacontableImplementableHome);
	}
	
	public void mostrarImportacionNivelCuentaContables() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNivelCuentaContable();
		
		this.abrirFrameImportacionNivelCuentaContable();		
		
			
		//this.generarReporteNivelCuentaContables("Todos",nivelcuentacontablesSeleccionados ,nivelcuentacontableImplementable,nivelcuentacontableImplementableHome);
	}
	
	public void importarNivelCuentaContables() throws Exception {		
	
	}
	
	public void exportarNivelCuentaContablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNivelCuentaContablesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNivelCuentaContablesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNivelCuentaContablesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Nivel Cuenta Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNivelCuentaContablesSeleccionados() throws Exception {
		ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();		
		
		nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuentacontable."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNivelCuentaContable(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontablesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNivelCuentaContable(nivelcuentacontableAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//nivelcuentacontableAux.setsDetalleGeneralEntityReporte(nivelcuentacontableAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNivelCuentaContable(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NivelCuentaContableConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelCuentaContableConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelCuentaContableConstantesFunciones.LABEL_NIVEL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNivelCuentaContable(NivelCuentaContable nivelcuentacontable,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=nivelcuentacontable.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=nivelcuentacontable.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=nivelcuentacontable.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=nivelcuentacontable.getnivel().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=nivelcuentacontable.getnumero_digitos().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNivelCuentaContablesSeleccionados() throws Exception {
		ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();		
		
		nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuentacontable.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("NivelCuentaContables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNivelCuentaContable(row);				
				iRow++;
			}				
			
			for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontablesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNivelCuentaContable(nivelcuentacontableAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNivelCuentaContablesSeleccionados() throws Exception {
		ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();		
		
		nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuentacontable.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("nivelcuentacontables");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("nivelcuentacontable");
			//elementRoot.appendChild(element);
		
			for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontablesSeleccionados) {
				element = document.createElement("nivelcuentacontable");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNivelCuentaContable(nivelcuentacontableAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNivelCuentaContable(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NivelCuentaContableConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NivelCuentaContableConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(NivelCuentaContableConstantesFunciones.LABEL_NIVEL);
		cell = row.createCell(iColumn++);cell.setCellValue(NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNivelCuentaContable(NivelCuentaContable nivelcuentacontable,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(nivelcuentacontable.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(nivelcuentacontable.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(nivelcuentacontable.getnivel());
		cell = row.createCell(iColumn++);cell.setCellValue(nivelcuentacontable.getnumero_digitos());				
	}
	
	public void setFilaDatosExportarXmlNivelCuentaContable(NivelCuentaContable nivelcuentacontable,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NivelCuentaContableConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(nivelcuentacontable.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NivelCuentaContableConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(nivelcuentacontable.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(NivelCuentaContableConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(nivelcuentacontable.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnivel = document.createElement(NivelCuentaContableConstantesFunciones.NIVEL);
		elementnivel.appendChild(document.createTextNode(nivelcuentacontable.getnivel().toString().trim()));
		element.appendChild(elementnivel);

		Element elementnumero_digitos = document.createElement(NivelCuentaContableConstantesFunciones.NUMERODIGITOS);
		elementnumero_digitos.appendChild(document.createTextNode(nivelcuentacontable.getnumero_digitos().toString().trim()));
		element.appendChild(elementnumero_digitos);
	}
	
	public void generarReporteGroupGenericoNivelCuentaContablesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados=new ArrayList<NivelCuentaContable>();
		
		nivelcuentacontablesSeleccionados=this.getNivelCuentaContablesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNivelCuentaContable(nivelcuentacontablesSeleccionados);
		
		this.generarReporteNivelCuentaContables("Todos",nivelcuentacontablesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNivelCuentaContable(ArrayList<NivelCuentaContable> nivelcuentacontablesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(NivelCuentaContable nivelcuentacontableAux:nivelcuentacontablesSeleccionados) {
				nivelcuentacontableAux.setsDetalleGeneralEntityReporte(nivelcuentacontableAux.toString());
			
				if(sTipoSeleccionar.equals(NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					nivelcuentacontableAux.setsDescripcionGeneralEntityReporte1(nivelcuentacontableAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NivelCuentaContableConstantesFunciones.LABEL_NIVEL)) {
					existe=true;
					nivelcuentacontableAux.setsDescripcionGeneralEntityReporte1(nivelcuentacontableAux.getnivel().toString());
				}
				 else if(sTipoSeleccionar.equals(NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS)) {
					existe=true;
					nivelcuentacontableAux.setsDescripcionGeneralEntityReporte1(nivelcuentacontableAux.getnumero_digitos().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNivelCuentaContable(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNivelCuentaContable=true;
				this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=true;
				this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=true;
			}
			
			this.isVisibilidadCeldaModificarNivelCuentaContable=false;
			this.isVisibilidadCeldaActualizarNivelCuentaContable=false;
			this.isVisibilidadCeldaEliminarNivelCuentaContable=false;
			this.isVisibilidadCeldaCancelarNivelCuentaContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNivelCuentaContable=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=false;
			this.isVisibilidadCeldaModificarNivelCuentaContable=false;
			this.isVisibilidadCeldaActualizarNivelCuentaContable=true;
			this.isVisibilidadCeldaEliminarNivelCuentaContable=false;
			this.isVisibilidadCeldaCancelarNivelCuentaContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNivelCuentaContable=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=false;
			this.isVisibilidadCeldaModificarNivelCuentaContable=false;
			this.isVisibilidadCeldaActualizarNivelCuentaContable=true;
			this.isVisibilidadCeldaEliminarNivelCuentaContable=true;
			this.isVisibilidadCeldaCancelarNivelCuentaContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNivelCuentaContable=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=false;
			this.isVisibilidadCeldaModificarNivelCuentaContable=false;
			this.isVisibilidadCeldaActualizarNivelCuentaContable=true;
			this.isVisibilidadCeldaEliminarNivelCuentaContable=false;
			this.isVisibilidadCeldaCancelarNivelCuentaContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNivelCuentaContable=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=true;
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=true;
			this.isVisibilidadCeldaModificarNivelCuentaContable=false;
			this.isVisibilidadCeldaActualizarNivelCuentaContable=false;
			this.isVisibilidadCeldaEliminarNivelCuentaContable=false;
			this.isVisibilidadCeldaCancelarNivelCuentaContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNivelCuentaContable=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=false;
			this.isVisibilidadCeldaActualizarNivelCuentaContable=false;
			this.isVisibilidadCeldaEliminarNivelCuentaContable=false;
			this.isVisibilidadCeldaCancelarNivelCuentaContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNivelCuentaContable=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=false;
			this.isVisibilidadCeldaModificarNivelCuentaContable=true;
			this.isVisibilidadCeldaActualizarNivelCuentaContable=false;
			this.isVisibilidadCeldaEliminarNivelCuentaContable=false;
			this.isVisibilidadCeldaCancelarNivelCuentaContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuentaContable=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NivelCuentaContableJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNivelCuentaContable=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=true;
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=true;
		} else {
			this.actualizarEstadoPanelsNivelCuentaContable(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNivelCuentaContable=false;
			//this.isVisibilidadCeldaVerFormNivelCuentaContable=false;
			this.isVisibilidadCeldaDuplicarNivelCuentaContable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=false;
		} else {
			this.isVisibilidadCeldaNuevoNivelCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuentaContable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
			if(!nivelcuentacontableSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=false;												
			}
			
			this.jButtonCerrarNivelCuentaContable.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNivelCuentaContable=false;
		}
		
		if(!this.permiteMantenimiento(this.nivelcuentacontable)) {
			this.isVisibilidadCeldaActualizarNivelCuentaContable=false;
			this.isVisibilidadCeldaEliminarNivelCuentaContable=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNivelCuentaContable() {
	}
	
	public void actualizarEstadoPanelsNivelCuentaContable(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNivelCuentaContable!=null) {
				this.jScrollPanelDatosEdicionNivelCuentaContable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCuentaContable!=null) {
				this.jTabbedPaneBusquedasNivelCuentaContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNivelCuentaContable!=null) {
				this.jScrollPanelDatosNivelCuentaContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCuentaContable!=null) {
				this.jPanelPaginacionNivelCuentaContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCuentaContable!=null) {
				this.jPanelParametrosReportesNivelCuentaContable.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNivelCuentaContable!=null) {
				this.jScrollPanelDatosEdicionNivelCuentaContable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCuentaContable!=null) {
				this.jTabbedPaneBusquedasNivelCuentaContable.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosNivelCuentaContable!=null) {
				this.jScrollPanelDatosNivelCuentaContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelCuentaContable!=null) {
				this.jPanelPaginacionNivelCuentaContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelCuentaContable!=null) {
				this.jPanelParametrosReportesNivelCuentaContable.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNivelCuentaContable!=null) {
				this.jScrollPanelDatosEdicionNivelCuentaContable.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCuentaContable!=null) {
				this.jTabbedPaneBusquedasNivelCuentaContable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNivelCuentaContable!=null) {
				this.jScrollPanelDatosNivelCuentaContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelCuentaContable!=null) {
				this.jPanelPaginacionNivelCuentaContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelCuentaContable!=null) {
				this.jPanelParametrosReportesNivelCuentaContable.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNivelCuentaContable!=null) {
				this.jScrollPanelDatosEdicionNivelCuentaContable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCuentaContable!=null) {
				this.jTabbedPaneBusquedasNivelCuentaContable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNivelCuentaContable!=null) {
				this.jScrollPanelDatosNivelCuentaContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelCuentaContable!=null) {
				this.jPanelPaginacionNivelCuentaContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelCuentaContable!=null) {
				this.jPanelParametrosReportesNivelCuentaContable.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNivelCuentaContable!=null) {
				this.jScrollPanelDatosEdicionNivelCuentaContable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCuentaContable!=null) {
				this.jTabbedPaneBusquedasNivelCuentaContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNivelCuentaContable!=null) {
				this.jScrollPanelDatosNivelCuentaContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCuentaContable!=null) {
				this.jPanelPaginacionNivelCuentaContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCuentaContable!=null) {
				this.jPanelParametrosReportesNivelCuentaContable.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNivelCuentaContable!=null) {
				this.jScrollPanelDatosEdicionNivelCuentaContable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCuentaContable!=null) {
				this.jTabbedPaneBusquedasNivelCuentaContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNivelCuentaContable!=null) {
				this.jScrollPanelDatosNivelCuentaContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCuentaContable!=null) {
				this.jPanelPaginacionNivelCuentaContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCuentaContable!=null) {
				this.jPanelParametrosReportesNivelCuentaContable.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNivelCuentaContable!=null) {
				this.jScrollPanelDatosEdicionNivelCuentaContable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCuentaContable!=null) {
				this.jTabbedPaneBusquedasNivelCuentaContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNivelCuentaContable!=null) {
				this.jScrollPanelDatosNivelCuentaContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCuentaContable!=null) {
				this.jPanelPaginacionNivelCuentaContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCuentaContable!=null) {
				this.jPanelParametrosReportesNivelCuentaContable.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasNivelCuentaContable!=null) {
					this.jTabbedPaneBusquedasNivelCuentaContable.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesNivelCuentaContable!=null) {
				this.jPanelParametrosReportesNivelCuentaContable.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCuentaContable!=null) {
				this.jTabbedPaneBusquedasNivelCuentaContable.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesNivelCuentaContable!=null) {
				this.jPanelParametrosReportesNivelCuentaContable.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//NivelCuentaContableSessionBean nivelcuentacontableSessionBean=new NivelCuentaContableSessionBean();
		
		if(this.nivelcuentacontableSessionBean==null) {
			this.nivelcuentacontableSessionBean=new NivelCuentaContableSessionBean();
		}
		
		this.nivelcuentacontableSessionBean.setsUltimaBusquedaNivelCuentaContable(this.getsAccionBusqueda());
		this.nivelcuentacontableSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.nivelcuentacontableSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			nivelcuentacontableSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//NivelCuentaContableSessionBean nivelcuentacontableSessionBean=new NivelCuentaContableSessionBean();
		
		if(this.nivelcuentacontableSessionBean==null) {
			this.nivelcuentacontableSessionBean=new NivelCuentaContableSessionBean();
		}
		
		if(this.nivelcuentacontableSessionBean.getsUltimaBusquedaNivelCuentaContable()!=null&&!this.nivelcuentacontableSessionBean.getsUltimaBusquedaNivelCuentaContable().equals("")) {
			this.setsAccionBusqueda(nivelcuentacontableSessionBean.getsUltimaBusquedaNivelCuentaContable());
			this.setiNumeroPaginacion(nivelcuentacontableSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(nivelcuentacontableSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(nivelcuentacontableSessionBean.getid_empresa());
				nivelcuentacontableSessionBean.setid_empresa(-1L);
			}
		}
		
		this.nivelcuentacontableSessionBean.setsUltimaBusquedaNivelCuentaContable("");
		this.nivelcuentacontableSessionBean.setiNumeroPaginacion(NivelCuentaContableConstantesFunciones.INUMEROPAGINACION);
		this.nivelcuentacontableSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNivelCuentaContable(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNivelCuentaContable() {
		this.updateBorderResaltarBusquedasFormularioNivelCuentaContable();
		this.updateVisibilidadBusquedasFormularioNivelCuentaContable();
		this.updateHabilitarBusquedasFormularioNivelCuentaContable();
	}
	
	public void updateBorderResaltarBusquedasFormularioNivelCuentaContable() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasNivelCuentaContable.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioNivelCuentaContable() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasNivelCuentaContable.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioNivelCuentaContable() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasNivelCuentaContable.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaNivelCuentaContable(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarNivelCuentaContable.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioNivelCuentaContable() throws Exception {

		if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNivelCuentaContable();
		this.updateVisibilidadResaltarControlesFormularioNivelCuentaContable();
		this.updateHabilitarResaltarControlesFormularioNivelCuentaContable();
		
	}
	
	public void updateBorderResaltarControlesFormularioNivelCuentaContable() throws Exception {
		if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.nivelcuentacontableConstantesFunciones.resaltaridNivelCuentaContable!=null && this.jInternalFrameDetalleFormNivelCuentaContable!=null) {this.jInternalFrameDetalleFormNivelCuentaContable.jLabelidNivelCuentaContable.setBorder(this.nivelcuentacontableConstantesFunciones.resaltaridNivelCuentaContable);}
		if(this.nivelcuentacontableConstantesFunciones.resaltarid_empresaNivelCuentaContable!=null && this.jInternalFrameDetalleFormNivelCuentaContable!=null) {this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.setBorder(this.nivelcuentacontableConstantesFunciones.resaltarid_empresaNivelCuentaContable);}
		if(this.nivelcuentacontableConstantesFunciones.resaltarnivelNivelCuentaContable!=null && this.jInternalFrameDetalleFormNivelCuentaContable!=null) {this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnivelNivelCuentaContable.setBorder(this.nivelcuentacontableConstantesFunciones.resaltarnivelNivelCuentaContable);}
		if(this.nivelcuentacontableConstantesFunciones.resaltarnumero_digitosNivelCuentaContable!=null && this.jInternalFrameDetalleFormNivelCuentaContable!=null) {this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnumero_digitosNivelCuentaContable.setBorder(this.nivelcuentacontableConstantesFunciones.resaltarnumero_digitosNivelCuentaContable);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNivelCuentaContable() throws Exception {		
		if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
	
		//this.jInternalFrameDetalleFormNivelCuentaContable.jLabelidNivelCuentaContable.setVisible(this.nivelcuentacontableConstantesFunciones.mostraridNivelCuentaContable);
		this.jInternalFrameDetalleFormNivelCuentaContable.jPanelidNivelCuentaContable.setVisible(this.nivelcuentacontableConstantesFunciones.mostraridNivelCuentaContable);
		//this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.setVisible(this.nivelcuentacontableConstantesFunciones.mostrarid_empresaNivelCuentaContable);
		this.jInternalFrameDetalleFormNivelCuentaContable.jPanelid_empresaNivelCuentaContable.setVisible(this.nivelcuentacontableConstantesFunciones.mostrarid_empresaNivelCuentaContable);
		//this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnivelNivelCuentaContable.setVisible(this.nivelcuentacontableConstantesFunciones.mostrarnivelNivelCuentaContable);
		this.jInternalFrameDetalleFormNivelCuentaContable.jPanelnivelNivelCuentaContable.setVisible(this.nivelcuentacontableConstantesFunciones.mostrarnivelNivelCuentaContable);
		//this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnumero_digitosNivelCuentaContable.setVisible(this.nivelcuentacontableConstantesFunciones.mostrarnumero_digitosNivelCuentaContable);
		this.jInternalFrameDetalleFormNivelCuentaContable.jPanelnumero_digitosNivelCuentaContable.setVisible(this.nivelcuentacontableConstantesFunciones.mostrarnumero_digitosNivelCuentaContable);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNivelCuentaContable() throws Exception {
		if(this.jInternalFrameDetalleFormNivelCuentaContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNivelCuentaContable!=null) {
	
		this.jInternalFrameDetalleFormNivelCuentaContable.jLabelidNivelCuentaContable.setEnabled(this.nivelcuentacontableConstantesFunciones.activaridNivelCuentaContable);
		this.jInternalFrameDetalleFormNivelCuentaContable.jComboBoxid_empresaNivelCuentaContable.setEnabled(this.nivelcuentacontableConstantesFunciones.activarid_empresaNivelCuentaContable);
		this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnivelNivelCuentaContable.setEnabled(this.nivelcuentacontableConstantesFunciones.activarnivelNivelCuentaContable);
		this.jInternalFrameDetalleFormNivelCuentaContable.jTextFieldnumero_digitosNivelCuentaContable.setEnabled(this.nivelcuentacontableConstantesFunciones.activarnumero_digitosNivelCuentaContable);
		}
	}
	
		
}